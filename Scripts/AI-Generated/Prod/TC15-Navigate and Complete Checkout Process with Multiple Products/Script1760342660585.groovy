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

"Step 2: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on link products - Navigate to page product.png')

"Step 3: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link about - Navigate to page about.png')

"Step 4: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on link contact - Navigate to page contact.png')

"Step 5: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on link home - Navigate to page .png')

"Step 6: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_id': button_addToCart_id]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button addToCart addToCart.png')

"Step 7: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_addToCart', ['button_addToCart_id': button_addToCart_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on button addToCart addToCart2.png')

"Step 8: Click on link cart (cart) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cart', ['link_cart_internalText': link_cart_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on link cart cart - Navigate to page cart.png')

"Step 9: Click on link goToCheckout2 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on link goToCheckout2 - Navigate to page checkout.png')

"Step 10: Click on input zip"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on input zip.png')

"Step 11: Enter input value in input zip"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'), input_zip)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Enter input value in input zip.png')

"Step 12: Click on div checkoutSummary"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_checkoutSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on div checkoutSummary.png')

"Step 13: Click on input nameOnCard"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on input nameOnCard.png')

"Step 14: Enter input value in input nameOnCard"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Enter input value in input nameOnCard.png')

"Step 15: Click on label creditCardNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/label_creditCardNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on label creditCardNumber.png')

"Step 16: Click on input creditCardNumber -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on input creditCardNumber - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Navigate and Complete Checkout Process with Multiple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}