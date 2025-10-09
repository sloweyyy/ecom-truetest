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

"Step 1: Navigate to /about"

TrueTestScripts.navigate("about")

"Step 2: Click on p aboutText"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/p_aboutText'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on p aboutText.png')

"Step 3: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link home - Navigate to page .png')

"Step 4: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link products - Navigate to page product.png')

"Step 5: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button addToCart addToCart3.png')

"Step 6: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button addToCart addToCart4.png')

"Step 7: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button addToCart addToCart4.png')

"Step 8: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id_3]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button addToCart addToCart4.png')

"Step 9: Click on link cart3 -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_cart3'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on link cart3 - Navigate to page cart.png')

"Step 10: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on button removeFromCart removeFromCart.png')

"Step 11: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on button removeFromCart removeFromCart.png')

"Step 12: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on button removeFromCart removeFromCart.png')

"Step 13: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText_3]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on button removeFromCart removeFromCart.png')

"Step 14: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText_4]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on button removeFromCart removeFromCart.png')

"Step 15: Click on button removeFromCart (removeFromCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_removeFromCart', ['button_removeFromCart_internalHasText': button_removeFromCart_internalHasText_5]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on button removeFromCart removeFromCart.png')

"Step 16: Click on button cartAction"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cartAction'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on button cartAction.png')

"Step 17: Click on button cartAction"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cartAction'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button cartAction.png')

"Step 18: Click on button cartAction"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cartAction'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on button cartAction.png')

"Step 19: Click on button cartAction"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cartAction'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on button cartAction.png')

"Step 20: Click on link continueShopping -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_continueShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on link continueShopping - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Remove Items from Shopping Cart and Return to Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}