import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 2: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link about - Navigate to page about.png')

"Step 3: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link products - Navigate to page product.png')

"Step 4: Click on div productButtons"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/div_productButtons'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on div productButtons.png')

"Step 5: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_login'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link login - Navigate to page login.png')

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Click on div loginForm"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/div_loginForm'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div loginForm.png')

"Step 8: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_register'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link register - Navigate to page register.png')

"Step 9: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/link_login'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link login - Navigate to page login.png')

"Step 10: Click on div password"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/div_password'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div password.png')

"Step 11: Login into Application"

TrueTestScripts.login()

"Step 12: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on input fullName.png')

"Step 13: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input fullName.png')

"Step 14: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on input fullName.png')

"Step 15: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on input fullName.png')

"Step 16: Click on link reactEcommerce -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/link_reactEcommerce'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link reactEcommerce - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-User Registration and Login Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}