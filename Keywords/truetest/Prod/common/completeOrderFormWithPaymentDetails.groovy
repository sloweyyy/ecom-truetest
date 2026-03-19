package truetest.Prod.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

public class completeOrderFormWithPaymentDetails {
    
    private static def execute(String input_address, String input_creditCardNumber, String input_cvv, String input_expiration, String input_firstName, String input_lastName, String input_nameOnCard, String input_zip, String select_country2, String select_state) {
        
        "Step 1: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)
        
        "Step 2: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName)
        
        "Step 3: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address)
        
        "Step 4: Enter input value in input zip"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'), input_zip)
        
        "Step 5: Select option with input value from select country2"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_country2'), select_country2, "label", false)
        
        "Step 6: Select option with input value from select state"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_state'), select_state, "label", false)
        
        "Step 7: Enter input value in input nameOnCard"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard)
        
        "Step 8: Enter input value in input creditCardNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber)
        
        "Step 9: Enter input value in input expiration"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'), input_expiration)
        
        "Step 10: Enter input value in input cvv"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv)
        
        "Step 11: Click on button placeOrder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))
    }
}

