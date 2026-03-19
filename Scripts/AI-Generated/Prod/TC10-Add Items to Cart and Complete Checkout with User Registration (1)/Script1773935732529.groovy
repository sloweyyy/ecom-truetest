import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.common.completeOrderFormWithPaymentInfo
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

"Step 2: Click on link buyNowOptions (buyNow) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions', ['link_buyNowOptions_Id_2': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_2': link_buyNowOptions_css_value]))

"Step 3: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

"Step 4: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_products'))

"Step 5: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 6: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText, 'link_cartItems_css_value_1': link_cartItems_css_value]))

"Step 7: Click on button cartActions (object)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 8: Click on button cartActions (cartAdd) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_2', ['button_cartActions_DivInternalHasText_3': button_cartActions_DivInternalHasText_2, 'button_cartActions_css_value_3': button_cartActions_css_value_2]))

"Step 9: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 10: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_1, 'link_cartItems_css_value_1': link_cartItems_css_value_1]))

"Step 11: Click on button cartActions (object6)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_1': button_cartActions_css_value_1]))

"Step 12: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 13: Login into Application"

TrueTestScripts.login()

"Step 14: Click on link cartItems (cart3) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_4, 'link_cartItems_css_value_2': link_cartItems_css_value_4]))

"Step 15: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 16: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 17: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 18: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 19: Click on link cartItems (cart12) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_2, 'link_cartItems_css_value_1': link_cartItems_css_value_2]))

"Step 20: Click on link goToCheckout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 21: Complete order form with personal and payment information"

completeOrderFormWithPaymentInfo.execute(input_address, input_creditCardNumber, input_cvv, input_expiration, input_firstName, input_lastName, input_nameOnCard, input_zip, select_country, select_state)

"Step 22: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 23: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_login'))

"Step 24: Login into Application"

TrueTestScripts.login()

"Step 25: Click on link register2 -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/link_register2'))

"Step 26: Login into Application"

TrueTestScripts.login()

"Step 27: Click on button logout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 28: Login into Application"

TrueTestScripts.login()

"Step 29: Click on link admin -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_admin'))

"Step 30: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/link_about'))

"Step 31: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

"Step 32: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)

"Step 33: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 34: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)

"Step 35: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 36: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message_1)

"Step 37: Click on button sendMessage -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 38: Click on button clothingCategories (jewelery)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 39: Click on button clothingCategories (electronics)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 40: Click on button clothingCategories (all2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_2, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_2]))

"Step 41: Click on link userProfiles (username)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_userProfiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_userProfiles', ['link_userProfiles_AInternalText_1': link_userProfiles_AInternalText, 'link_userProfiles_css_value_1': link_userProfiles_css_value]))

"Step 42: Click on link object"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_object'))

"Step 43: Click on link reactEcommerce -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_reactEcommerce'))

"Step 44: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

"Step 45: Click on link cartItems (cart8) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText_3, 'link_cartItems_css_value_1': link_cartItems_css_value_3]))

"Step 46: Click on button clearCart2 -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearCart3'))

"Step 47: Click on button logout -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/button_logout'))

"Step 48: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_fullName'), input_fullName)

"Step 49: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject_1, "label", false)

"Step 50: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message_2)

"Step 51: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_emailAddress'), input_emailAddress)

"Step 52: Click on button sendMessage -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 53: Login into Application"

TrueTestScripts.login()

"Step 54: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Add Items to Cart and Complete Checkout with User Registration (1)_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}