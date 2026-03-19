package truetest.Prod.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class registerNewUser {
    
    private static def execute(String input_confirmPassword, String input_email, String input_fullName, String input_password) {
        
        "Step 1: Click on link register3 -> Navigate to page '/register'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_register3'))
        
        "Step 2: Click on button register"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/button_register'))
        
        "Step 3: Enter input value in input fullName"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_register/input_fullName'), input_fullName)
        
        "Step 4: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_register/input_email'), input_email)
        
        "Step 5: Enter input value in input password"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_register/input_password'), input_password)
        
        "Step 6: Enter input value in input confirmPassword"
        
        WebUI.setText(findTestObject('AI-Generated/Prod/Page_register/input_confirmPassword'), input_confirmPassword)
        
        "Step 7: Click on button register"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/button_register'))
    }
}

