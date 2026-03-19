package truetest.Prod.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

public class sendMultipleMessagesThroughContactForm {
    
    private static def execute(String select_subject, String textarea_message, String textarea_message_1) {
        
        "Step 1: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
        
        "Step 2: Select option with input value from select subject"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)
        
        "Step 3: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
        
        "Step 4: Enter input value in textarea message"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)
        
        "Step 5: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
        
        "Step 6: Enter input value in textarea message"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message_1)
        
        "Step 7: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
    }
}

