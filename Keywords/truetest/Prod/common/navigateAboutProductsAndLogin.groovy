package truetest.Prod.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateAboutProductsAndLogin {
    
    private static def execute() {
        
        "Step 1: Click on link about -> Navigate to page '/about'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_about'))
        
        "Step 2: Click on link products -> Navigate to page '/product'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_products'))
        
        "Step 3: Click on button womensClothing"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_womensClothing'))
        
        "Step 4: Click on link login -> Navigate to page '/login'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_login'))
        
        "Step 5: Click on link login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_login'))
    }
}

