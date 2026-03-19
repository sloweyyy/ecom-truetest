import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1280, 713)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 3: Click on button addToCart4"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart4'))

"Step 4: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 5: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Click on link cartItems (cart10) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText, 'link_cartItems_css_value_2': link_cartItems_css_value]))

"Step 8: Click on button cartActions (object)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 9: Click on button cartActions (cartAdd2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_2': button_cartActions_css_value_1]))

"Step 10: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 11: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 12: Click on button logout -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 13: Click on link productNavigation (home2) -> Navigate to page '/'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 14: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 15: Click on link cartItems (cart4) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 16: Click on link goToCheckout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Logout and Re login with Cart Actions Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}