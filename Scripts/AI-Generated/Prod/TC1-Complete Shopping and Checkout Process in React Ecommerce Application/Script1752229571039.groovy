import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link home.png')

"Step 3: Click on link products -> Navigate to page '/product'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link products - Navigate to page product.png')

"Step 4: Click on link about -> Navigate to page '/about'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link about - Navigate to page about.png')

"Step 5: Click on link contact -> Navigate to page '/contact'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link contact - Navigate to page contact.png')

"Step 6: Click on link login -> Navigate to page '/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/link_login'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link login - Navigate to page login.png')

"Step 7: Click on link register -> Navigate to page '/register'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_register'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link register - Navigate to page register.png')

"Step 8: Click on link cart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link cart - Navigate to page cart.png')

"Step 9: Click on link reactEcommerce -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_reactEcommerce'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link reactEcommerce - Navigate to page .png')

"Step 10: Click on image card"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/image_card'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on image card.png')

"Step 11: Click on link buyNow (buyNow) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow', ['link_buyNow_id': link_buyNow_id]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link buyNow buyNow - Navigate to page product.png')

"Step 12: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button addToCart.png')

"Step 13: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link goToCart - Navigate to page cart.png')

"Step 14: Click on link goToCheckout -> Navigate to page '/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link goToCheckout - Navigate to page checkout.png')

"Step 15: Click on div firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div firstName.png')

"Step 16: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input firstName.png')

"Step 17: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input firstName.png')

"Step 18: Click on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input lastName.png')

"Step 19: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Enter input value in input lastName.png')

"Step 20: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input email.png')

"Step 21: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input email.png')

"Step 22: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on input address.png')

"Step 23: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Enter input value in input address.png')

"Step 24: Click on input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input address2.png')

"Step 25: Enter input value in input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address2'), input_address2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in input address2.png')

"Step 26: Select option with input value from select country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Prod/Page_checkout/select_country'), select_country)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Select option with input value from select country.png')

"Step 27: Select option with input value from select state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Prod/Page_checkout/select_state'), select_state)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Select option with input value from select state.png')

"Step 28: Click on input zip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on input zip.png')

"Step 29: Enter input value in input zip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'), input_zip)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Enter input value in input zip.png')

"Step 30: Click on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on input nameOnCard.png')

"Step 31: Enter input value in input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Enter input value in input nameOnCard.png')

"Step 32: Click on input creditCardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on input creditCardNumber.png')

"Step 33: Enter input value in input creditCardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Enter input value in input creditCardNumber.png')

"Step 34: Click on div expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on div expiration.png')

"Step 35: Click on input expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on input expiration.png')

"Step 36: Enter input value in input expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'), input_expiration)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Enter input value in input expiration.png')

"Step 37: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on input cvv.png')

"Step 38: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Enter input value in input cvv.png')

"Step 39: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on form checkout.png')

"Step 40: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on form checkout.png')

"Step 41: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on form checkout.png')

"Step 42: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on input email.png')

"Step 43: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_email'), input_email_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Enter input value in input email.png')

"Step 44: Click on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on input nameOnCard.png')

"Step 45: Click on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on input nameOnCard.png')

"Step 46: Click on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on input nameOnCard.png')

"Step 47: Enter input value in input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Enter input value in input nameOnCard.png')

"Step 48: Press key Tab on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Press key Tab on input nameOnCard.png')

"Step 49: Press key Tab on input nameOnCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Press key Tab on input nameOnCard.png')

"Step 50: Enter input value in input creditCardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Enter input value in input creditCardNumber.png')

"Step 51: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on form checkout.png')

"Step 52: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Click on input address.png')

"Step 53: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Enter input value in input address.png')

"Step 54: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on input firstName.png')

"Step 55: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Enter input value in input firstName.png')

"Step 56: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Press key Tab on input firstName.png')

"Step 57: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Press key Tab on input firstName.png')

"Step 58: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Enter input value in input lastName.png')

"Step 59: Click on div orderSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Click on div orderSummary.png')

"Step 60: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Click on form checkout.png')

"Step 61: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Click on input address.png')

"Step 62: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address_2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Enter input value in input address.png')

"Step 63: Click on input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Click on input address2.png')

"Step 64: Enter input value in input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address2'), input_address2_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Enter input value in input address2.png')

"Step 65: Click on input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Click on input address.png')

"Step 66: Enter input value in input address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address_3)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Enter input value in input address.png')

"Step 67: Click on input expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Click on input expiration.png')

"Step 68: Click on input expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on input expiration.png')

"Step 69: Enter input value in input expiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'), input_expiration_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Enter input value in input expiration.png')

"Step 70: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Click on form checkout.png')

"Step 71: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on form checkout.png')

"Step 72: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on form checkout.png')

"Step 73: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on form checkout.png')

"Step 74: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Click on input cvv.png')

"Step 75: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Click on input cvv.png')

"Step 76: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Click on input cvv.png')

"Step 77: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Enter input value in input cvv.png')

"Step 78: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Click on form checkout.png')

"Step 79: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Click on form checkout.png')

"Step 80: Click on div checkoutForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_checkoutForm'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Click on div checkoutForm.png')

"Step 81: Click on link register -> Navigate to page '/register'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/link_register'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on link register - Navigate to page register.png')

"Step 82: Login into Application"

TrueTestScripts.login()

"Step 83: Login into Application"

TrueTestScripts.login()

"Step 84: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 84-Click on link home - Navigate to page .png')

"Step 85: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 85-Click on link home.png')

"Step 86: Click on div mensCasual"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/div_mensCasual'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 86-Click on div mensCasual.png')

"Step 87: Click on link buyNow (buyNow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow', ['link_buyNow_id': link_buyNow_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 87-Click on link buyNow buyNow2.png')

"Step 88: Click on link buyNow (buyNow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow', ['link_buyNow_id': link_buyNow_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 88-Click on link buyNow buyNow3.png')

"Step 89: Click on link buyNow (buyNow4) -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNow', ['link_buyNow_id': link_buyNow_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 89-Click on link buyNow buyNow4 - Navigate to page product.png')

"Step 90: Click on image productCard (productCard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 90-Click on image productCard productCard.png')

"Step 91: Click on div buyNowAddToCart (buyNowAddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart', ['div_buyNowAddToCart_divNthChild': div_buyNowAddToCart_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 91-Click on div buyNowAddToCart buyNowAddToCart.png')

"Step 92: Click on link buyNow (buyNow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow', ['link_buyNow_divNthChild': link_buyNow_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 92-Click on link buyNow buyNow.png')

"Step 93: Click on div buyNowAddToCart (buyNowAddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart', ['div_buyNowAddToCart_divNthChild': div_buyNowAddToCart_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 93-Click on div buyNowAddToCart buyNowAddToCart2.png')

"Step 94: Click on image productCard (card)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 94-Click on image productCard card.png')

"Step 95: Click on link buyNow (buyNow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow', ['link_buyNow_divNthChild': link_buyNow_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 95-Click on link buyNow buyNow2.png')

"Step 96: Click on link buyNow (buyNow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNow', ['link_buyNow_divNthChild': link_buyNow_divNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 96-Click on link buyNow buyNow2.png')

"Step 97: Click on image productCard (card)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 97-Click on image productCard card.png')

"Step 98: Click on image productCard (card)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 98-Click on image productCard card.png')

"Step 99: Click on image productCard (card)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_4]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 99-Click on image productCard card.png')

"Step 100: Click on image productCard (productCard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_5]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 100-Click on image productCard productCard.png')

"Step 101: Click on image productCard (card2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_6]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 101-Click on image productCard card2.png')

"Step 102: Click on image card3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/image_card3'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 102-Click on image card3.png')

"Step 103: Click on image card3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/image_card3'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 103-Click on image card3.png')

"Step 104: Click on div productActions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/div_productActions'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 104-Click on div productActions.png')

"Step 105: Click on image productCard (productCard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/image_productCard', ['image_productCard_divNthChild': image_productCard_divNthChild_7]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 105-Click on image productCard productCard.png')

"Step 106: Click on div buyNowAddToCart (buyNowAddToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/div_buyNowAddToCart', ['div_buyNowAddToCart_divNthChild': div_buyNowAddToCart_divNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 106-Click on div buyNowAddToCart buyNowAddToCart2.png')

"Step 107: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 107-Click on button addToCart2.png')

"Step 108: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 108-Click on button addToCart2.png')

"Step 109: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 109-Click on button addToCart2.png')

"Step 110: Click on link cart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 110-Click on link cart - Navigate to page cart.png')

"Step 111: Click on link goToCheckout -> Navigate to page '/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 111-Click on link goToCheckout - Navigate to page checkout.png')

"Step 112: Click on div billingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_billingAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 112-Click on div billingAddress.png')

"Step 113: Click on form checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 113-Click on form checkout.png')

"Step 114: Click on link reactEcommerce -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/link_reactEcommerce'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 114-Click on link reactEcommerce - Navigate to page .png')

"Step 115: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Shopping and Checkout Process in React Ecommerce Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}