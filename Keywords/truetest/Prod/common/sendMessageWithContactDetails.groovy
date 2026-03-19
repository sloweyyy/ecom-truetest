package truetest.Prod.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

public class sendMessageWithContactDetails {
    
    private static def execute(String input_emailAddress, String input_fullName, String select_subject, String textarea_message) {
        
        "Step 1: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
        
        "Step 2: Enter input value in input fullName"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_fullName'), input_fullName)
        
        "Step 3: Enter input value in input emailAddress"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_emailAddress'), input_emailAddress)
        
        "Step 4: Select option with input value from select subject"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)
        
        "Step 5: Enter input value in textarea message"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)
        
        "Step 6: Click on button sendMessage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))
    }
}

