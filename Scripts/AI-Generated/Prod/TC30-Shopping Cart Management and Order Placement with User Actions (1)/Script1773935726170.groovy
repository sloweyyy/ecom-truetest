import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.common.completeOrderFormWithPaymentInfo
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

"Step 2: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 3: Click on button addToCart4"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart4'))

"Step 4: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 5: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 6: Click on button cartActions (object6)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 7: Click on button cartActions (cartAction2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_2, 'button_cartActions_css_value_2': button_cartActions_css_value_2]))

"Step 8: Click on button cartActions (cart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_1': button_cartActions_css_value_1]))

"Step 9: Click on button cartActions (object11)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_3, 'button_cartActions_css_value_2': button_cartActions_css_value_3]))

"Step 10: Click on button cartActions (cartAdd2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_4, 'button_cartActions_css_value_2': button_cartActions_css_value_4]))

"Step 11: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_2, 'link_cartItems_css_value_2': link_cartItems_css_value_2]))

"Step 14: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 15: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 16: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 17: Click on button clothingCategories (electronics)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 18: Click on button clothingCategories (jewelery)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 19: Click on link buyNowOptions (buyNow8) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions', ['link_buyNowOptions_Id_1': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_1': link_buyNowOptions_css_value]))

"Step 20: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_products'))

"Step 21: Click on button clothingCategories (all2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_2, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_2]))

"Step 22: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 23: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 24: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_2, 'button_addToCart_css_value_1': button_addToCart_css_value_2]))

"Step 25: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_3, 'button_addToCart_css_value_1': button_addToCart_css_value_3]))

"Step 26: Click on link cartItems (cart11) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText, 'link_cartItems_css_value_1': link_cartItems_css_value]))

"Step 27: Click on link goToCheckout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 28: Complete order form with personal and payment information"

completeOrderFormWithPaymentInfo.execute(input_address, input_creditCardNumber, input_cvv, input_expiration, input_firstName, input_lastName, input_nameOnCard, input_zip, select_country, select_state)

"Step 29: Send multiple messages with subject and content"

sendMultipleMessagesWithContent.execute(select_subject, textarea_message, textarea_message_2)

"Step 30: Click on link about3 -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/link_about3'))

"Step 31: Click on link admin -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_admin'))

"Step 32: Click on button logout2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/button_logout'))

"Step 33: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 34: Login into Application"

TrueTestScripts.login()

"Step 35: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 36: Click on link contact2 -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_contact2'))

"Step 37: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message_1)

"Step 38: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject_1, "label", false)

"Step 39: Click on button sendMessage -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 40: Click on button logout -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_logout'))

"Step 41: Click on link cartItems (cart4) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_3, 'link_cartItems_css_value_2': link_cartItems_css_value_3]))

"Step 42: Click on button clearAll -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearAll'))

"Step 43: Click on link contact2 -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_contact2'))

"Step 44: Click on button shippingPolicies (shippingInfo) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies', ['button_shippingPolicies_ButtonInternalText_1': button_shippingPolicies_ButtonInternalText, 'button_shippingPolicies_css_value_1': button_shippingPolicies_css_value]))

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Shopping Cart Management and Order Placement with User Actions (1)_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}