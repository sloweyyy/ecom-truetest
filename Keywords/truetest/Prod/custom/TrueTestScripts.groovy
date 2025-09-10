package truetest.Prod.custom

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.regex.Pattern

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable

public class TrueTestScripts {

	public static void login() {
		try {
WebUI.click(findTestObject('Object Repository/Page_Ecommerce Website/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce Website/input_nameexample.com'), 'demo@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce Website/input_Password'), 'pWfyc2akvc4=')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce Website/button_Login'))

		} catch(Exception e) {
			if (e.getCause() instanceof WebElementNotFoundException) {
				KeywordUtil.logInfo(e.getMessage())
				KeywordUtil.markWarning(e.getMessage())
			} else {
				throw e
			}
		}
	}

	static Integer DELAY_TIME = 3 // in seconds

	private static String combineUrlQueryParams(Map<String, String> queryParams) {
		String queryParameters = "";
		try {
			queryParameters = GlobalVariable.query_params;
		}
		catch (Exception e) {
			KeywordUtil.logInfo(e.getMessage());
		}
		for (Map.Entry<String, String> param: queryParams) {
			if (queryParameters.length() > 0) {
				queryParameters += "&";
			}
			queryParameters += "${param.getKey()}=${param.getValue()}";
		}
		return queryParameters;
	}

	private static void do_navigate(String path, String queryParameters) {
		String applicationDomain = GlobalVariable.application_domain;
		if (path == null) {
			path = "";
		}
		if (!path.startsWith("/")) {
			path = "/$path";
		}
		String url = "$applicationDomain$path";
		if (queryParameters != null && queryParameters.length() > 0) {
			url = "$url?$queryParameters";
		}
		WebUI.navigateToUrl(url);
		WebUI.delay(DELAY_TIME);
	}

	public static void navigate(String path, Map<String, String> searchParams) {
		String queryParameters = this.combineUrlQueryParams(searchParams);
		this.do_navigate(path, queryParameters);
	}

	public static void navigate(String path) {
		this.do_navigate(path, "");
	}

	public static void selectOptionByValue(TestObject to, String rawValue) {
		def parsedValue = rawValue
		if (!parsedValue.startsWith("[")) {
			parsedValue = "[\"" + parsedValue + "\"]"
		}
		def jsonSlurper = new JsonSlurper()
		def options = jsonSlurper.parseText(parsedValue)
		for (option in options) {
			WebUI.selectOptionByValue(to, Pattern.quote(option), true)
		}
	}

	public static void setSliderValue(TestObject to, double value) {
		WebUI.delay(1)
		WebUI.enhancedClick(to)
		def sliderElement = WebUiCommonHelper.findWebElement(to, 30)
		double sliderWidth = Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getBoundingClientRect().width", Arrays.asList(sliderElement)).toString())
		def sliderHandleElement = WebUI.executeJavaScript("return arguments[0].querySelector('[role=slider]')", Arrays.asList(sliderElement))
		double min =  Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuemin')", Arrays.asList(sliderHandleElement)).toString())
		double max =  Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuemax')", Arrays.asList(sliderHandleElement)).toString())
		double currentValue = Double.parseDouble(WebUI.executeJavaScript("return arguments[0].getAttribute('aria-valuenow')", Arrays.asList(sliderHandleElement)).toString())
		int offsetX = Math.floor(((value - currentValue) / (max - min)) * sliderWidth)
		WebUI.dragAndDropByOffset(to, offsetX, 0)
	}
}

