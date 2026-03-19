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

"Step 2: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 3: Click on button clothingCategories (mensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 4: Click on button clothingCategories (electronics)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 5: Click on button clothingCategories (all)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_2, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_2]))

"Step 6: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 7: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 8: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_home'))

"Step 9: Click on link buyNowOptions (buyNow) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions', ['link_buyNowOptions_Id_2': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_2': link_buyNowOptions_css_value]))

"Step 10: Click on link goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_goToCart'))

"Step 11: Click on button cartActions (object)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 12: Click on button cartActions (cartAdd2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_2': button_cartActions_css_value_1]))

"Step 13: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 14: Login into Application"

TrueTestScripts.login()

"Step 15: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText, 'link_cartItems_css_value_2': link_cartItems_css_value]))

"Step 16: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 17: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 18: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 19: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 20: Login into Application"

TrueTestScripts.login()

"Step 21: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 22: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_login'))

"Step 23: Login into Application"

TrueTestScripts.login()

"Step 24: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 25: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 26: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 27: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 28: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 29: Click on button placeOrder"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 30: Click on div checkout -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_checkout'))

"Step 31: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/link_contact'))

"Step 32: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 33: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)

"Step 34: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)

"Step 35: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 36: Click on button logout -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_logout'))

"Step 37: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 38: Click on link login2 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_login2'))

"Step 39: Login into Application"

TrueTestScripts.login()

"Step 40: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_2, 'link_cartItems_css_value_2': link_cartItems_css_value_2]))

"Step 41: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 42: Enter input value in input firstName -> Navigate to page '/cart'"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)

"Step 43: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_cart/input_lastName'), input_lastName)

"Step 44: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_about'))

"Step 45: Click on link cartItems (cart) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_about/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_about/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_3, 'link_cartItems_css_value_2': link_cartItems_css_value_3]))

"Step 46: Click on button clearAll"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearAll'))

"Step 47: Click on link continueShopping -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_continueShopping'))

"Step 48: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 49: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_4, 'link_cartItems_css_value_2': link_cartItems_css_value_4]))

"Step 50: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 51: Click on button placeOrder -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 52: Login into Application"

TrueTestScripts.login()

"Step 53: Click on button logout -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/button_logout'))

"Step 54: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 55: Login into Application"

TrueTestScripts.login()

"Step 56: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Test User Actions for Cart and Checkout with Multiple Logins_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}