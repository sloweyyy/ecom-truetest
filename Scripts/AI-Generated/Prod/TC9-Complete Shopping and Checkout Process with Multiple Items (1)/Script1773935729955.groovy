import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.common.sendMultipleMessagesWithContent
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

"Step 5: Click on link buyNowOptions (buyNow2) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions', ['link_buyNowOptions_Id_1': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_1': link_buyNowOptions_css_value]))

"Step 6: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

"Step 7: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_products'))

"Step 8: Click on link cartItems (cart10) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText, 'link_cartItems_css_value_1': link_cartItems_css_value]))

"Step 9: Click on button object2"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_object2'))

"Step 10: Click on button object3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_object3'))

"Step 11: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation', ['link_productNavigation_AInternalText_2': link_productNavigation_AInternalText_3, 'link_productNavigation_css_value_2': link_productNavigation_css_value_3]))

"Step 12: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 13: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_1, 'link_cartItems_css_value_1': link_cartItems_css_value_1]))

"Step 14: Click on button cartActions (cart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_2': button_cartActions_css_value]))

"Step 15: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_login'))

"Step 16: Login into Application"

TrueTestScripts.login()

"Step 17: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_5, 'link_cartItems_css_value_2': link_cartItems_css_value_5]))

"Step 18: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 19: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 20: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText_1, 'link_productNavigation_css_value_1': link_productNavigation_css_value_1]))

"Step 21: Click on button addToCart (addToCart2) -> Navigate to page '/checkout'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 22: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)

"Step 23: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName)

"Step 24: Enter input value in input address"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address)

"Step 25: Enter input value in input creditCardNumber"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber)

"Step 26: Select option with input value from select country"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_country'), select_country, "label", false)

"Step 27: Select option with input value from select state"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_state'), select_state, "label", false)

"Step 28: Click on button placeOrder -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 29: Login into Application"

TrueTestScripts.login()

"Step 30: Click on link productNavigation (products2) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText_2, 'link_productNavigation_css_value_1': link_productNavigation_css_value_2]))

"Step 31: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 32: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_3, 'button_addToCart_css_value_1': button_addToCart_css_value_3]))

"Step 33: Click on link cartItems (cart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_2, 'link_cartItems_css_value_1': link_cartItems_css_value_2]))

"Step 34: Click on link cartItems (cart4) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_3, 'link_cartItems_css_value_1': link_cartItems_css_value_3]))

"Step 35: Click on button object5"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_object5'))

"Step 36: Click on button logout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_logout'))

"Step 37: Login into Application"

TrueTestScripts.login()

"Step 38: Click on link admin -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_admin'))

"Step 39: Click on button logout -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/button_logout'))

"Step 40: Click on link cartItems (cart4) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_6, 'link_cartItems_css_value_2': link_cartItems_css_value_6]))

"Step 41: Click on button clearCart3 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearCart3'))

"Step 42: Login into Application"

TrueTestScripts.login()

"Step 43: Click on link contact"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/link_contact'))

"Step 44: Send multiple messages with subject and content"

sendMultipleMessagesWithContent.execute(select_subject, textarea_message, textarea_message_1)

"Step 45: Click on link productNavigation (about) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/link_productNavigation', ['link_productNavigation_AInternalText_3': link_productNavigation_AInternalText_4, 'link_productNavigation_css_value_3': link_productNavigation_css_value_4]))

"Step 46: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_4, 'button_addToCart_css_value_1': button_addToCart_css_value_4]))

"Step 47: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_5, 'button_addToCart_css_value_1': button_addToCart_css_value_5]))

"Step 48: Click on link cartItems (cart11)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_4, 'link_cartItems_css_value_1': link_cartItems_css_value_4]))

"Step 49: Click on link buyNowOptions (buyNow5) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions', ['link_buyNowOptions_Id_1': link_buyNowOptions_Id_1, 'link_buyNowOptions_css_value_1': link_buyNowOptions_css_value_1]))

"Step 50: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 51: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName_1)

"Step 52: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName_1)

"Step 53: Enter input value in input creditCardNumber"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber_1)

"Step 54: Enter input value in input nameOnCard"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard)

"Step 55: Enter input value in input expiration"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'), input_expiration)

"Step 56: Enter input value in input cvv"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv)

"Step 57: Enter input value in input address"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address_1)

"Step 58: Select option with input value from select country"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_country'), select_country_1, "label", false)

"Step 59: Select option with input value from select state"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_checkout/select_state'), select_state_1, "label", false)

"Step 60: Enter input value in input zip"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'), input_zip)

"Step 61: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 62: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complete Shopping and Checkout Process with Multiple Items (1)_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}