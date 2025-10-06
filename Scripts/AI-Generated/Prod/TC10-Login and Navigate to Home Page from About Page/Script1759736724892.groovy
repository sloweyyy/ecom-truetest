import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.common.navigateAboutProductsAndLogin
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

"Step 2: Navigate to about page and explore products and login"

navigateAboutProductsAndLogin.execute()

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_register'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on link register - Navigate to page register.png')

"Step 5: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/link_login'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on link login - Navigate to page login.png')

"Step 6: Click on input password -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/input_password'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on input password - Navigate to page .png')

"Step 7: Click on nav navigation -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/nav_navigation'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on nav navigation - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Login and Navigate to Home Page from About Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}