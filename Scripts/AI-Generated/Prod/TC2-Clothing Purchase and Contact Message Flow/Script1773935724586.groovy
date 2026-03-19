import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.common.completeOrderFormWithPaymentDetails
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

"Step 2: Click on button clothingCategories (mensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 3: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 4: Click on button addToCart2"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart4'))

"Step 5: Click on button clothingCategories (all)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 6: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText, 'link_cartItems_css_value_2': link_cartItems_css_value]))

"Step 7: Click on button cartActions (object)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 8: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 9: Login into Application"

TrueTestScripts.login()

"Step 10: Click on link object"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_object'))

"Step 11: Click on link object"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_object'))

"Step 12: Click on link cartItems (cart3) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 13: Click on link goToCheckout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 14: Complete order form with payment details"

completeOrderFormWithPaymentDetails.execute(input_address, input_creditCardNumber, input_cvv, input_expiration, input_firstName, input_lastName, input_nameOnCard, input_zip, select_country2, select_state)

"Step 15: Click on link buyNowOptions (buyNow) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_buyNowOptions', ['link_buyNowOptions_Id_1': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_1': link_buyNowOptions_css_value]))

"Step 16: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_navigateToAbout'))

"Step 17: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

"Step 18: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)

"Step 19: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)

"Step 20: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 21: Click on button faq -> Navigate to page '/admin/contact-messages'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_faq'))

"Step 22: Click on button clearAll2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_admin_contact_messages/button_clearAll2'))

"Step 23: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 24: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 25: Click on link cartItems (cart4) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_2, 'link_cartItems_css_value_2': link_cartItems_css_value_2]))

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Clothing Purchase and Contact Message Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}