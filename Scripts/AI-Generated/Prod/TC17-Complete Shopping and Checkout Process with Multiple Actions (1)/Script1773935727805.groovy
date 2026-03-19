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

"Step 4: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 5: Click on button cartActions (object)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 6: Click on button cartActions (cartAction4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_2': button_cartActions_css_value_1]))

"Step 7: Click on button clearAll"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearAll'))

"Step 8: Click on link productNavigation (products2) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation', ['link_productNavigation_AInternalText_2': link_productNavigation_AInternalText_1, 'link_productNavigation_css_value_2': link_productNavigation_css_value_1]))

"Step 9: Click on button clothingCategories (mensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 10: Click on button clothingCategories (selectWomensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 11: Click on button clothingCategories (jewelery)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_2, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_2]))

"Step 12: Click on button clothingCategories (electronics)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_3, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_3]))

"Step 13: Click on button clothingCategories (all)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_4, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_4]))

"Step 14: Click on link buyNowOptions (buyNow) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions', ['link_buyNowOptions_Id_1': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_1': link_buyNowOptions_css_value]))

"Step 15: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

"Step 16: Click on link goToCart -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_goToCart'))

"Step 17: Login into Application"

TrueTestScripts.login()

"Step 18: Click on link cartItems (cart6) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_2, 'link_cartItems_css_value_2': link_cartItems_css_value_2]))

"Step 19: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 20: Click on button placeOrder -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 21: Click on button clothingCategories (selectWomensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_5, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_5]))

"Step 22: Click on button addToCart (addToCart6)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id, 'button_addToCart_css_value_1': button_addToCart_css_value]))

"Step 23: Click on link cartItems (cart12) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_cartItems', ['link_cartItems_AInternalText_1': link_cartItems_AInternalText, 'link_cartItems_css_value_1': link_cartItems_css_value]))

"Step 24: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 25: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)

"Step 26: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName)

"Step 27: Enter input value in input creditCardNumber"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber)

"Step 28: Enter input value in input cvv"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv)

"Step 29: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 30: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 31: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 32: Login into Application"

TrueTestScripts.login()

"Step 33: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_register/link_login'))

"Step 34: Login into Application"

TrueTestScripts.login()

"Step 35: Click on link admin -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_admin'))

"Step 36: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/link_home'))

"Step 37: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 38: Click on link navigateToAbout -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_navigateToAbout'))

"Step 39: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

"Step 40: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 41: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_fullName'), input_fullName)

"Step 42: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_emailAddress'), input_emailAddress)

"Step 43: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 44: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_fullName'), input_fullName_1)

"Step 45: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_emailAddress'), input_emailAddress_1)

"Step 46: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)

"Step 47: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)

"Step 48: Click on button sendMessage -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 49: Click on button addToCart (addToCart2) -> Navigate to page '/checkout'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_Id_1': button_addToCart_Id_1, 'button_addToCart_css_value_1': button_addToCart_css_value_1]))

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Complete Shopping and Checkout Process with Multiple Actions (1)_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}