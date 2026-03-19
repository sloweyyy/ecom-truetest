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

"Step 2: Click on button clothingCategories (mensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value]))

"Step 3: Click on button clothingCategories (womensClothing)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_1, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_1]))

"Step 4: Click on button clothingCategories (all)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_2, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_2]))

"Step 5: Click on button clothingCategories (selectJewelery)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_3, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_3]))

"Step 6: Click on button clothingCategories (electronics)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_clothingCategories', ['button_clothingCategories_ButtonInternalText_1': button_clothingCategories_ButtonInternalText_4, 'button_clothingCategories_css_value_1': button_clothingCategories_css_value_4]))

"Step 7: Click on link buyNowOptions (buyNow5) -> Navigate to page '/product/*'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_buyNowOptions', ['link_buyNowOptions_Id_2': link_buyNowOptions_Id, 'link_buyNowOptions_css_value_2': link_buyNowOptions_css_value]))

"Step 8: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

"Step 9: Click on link productNavigation (home2) -> Navigate to page '/'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_product/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_product/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText, 'link_productNavigation_css_value_1': link_productNavigation_css_value]))

"Step 10: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 11: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText, 'link_cartItems_css_value_2': link_cartItems_css_value]))

"Step 12: Click on button cartActions (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions', ['button_cartActions_DivInternalHasText_1': button_cartActions_DivInternalHasText, 'button_cartActions_css_value_1': button_cartActions_css_value]))

"Step 13: Click on button cartActions (cartAction4)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_1, 'button_cartActions_css_value_2': button_cartActions_css_value_1]))

"Step 14: Click on button cartActions (cart2)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/button_cartActions_1', ['button_cartActions_DivInternalHasText_2': button_cartActions_DivInternalHasText_2, 'button_cartActions_css_value_2': button_cartActions_css_value_2]))

"Step 15: Click on button clearAll"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_clearAll'))

"Step 16: Click on link continueShopping -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_continueShopping'))

"Step 17: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 18: Click on button addToCart4"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart4'))

"Step 19: Click on link cartItems (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_1, 'link_cartItems_css_value_2': link_cartItems_css_value_1]))

"Step 20: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 21: Login into Application"

TrueTestScripts.login()

"Step 22: Click on link cartItems (cart3) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_2, 'link_cartItems_css_value_2': link_cartItems_css_value_2]))

"Step 23: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

"Step 24: Click on button placeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/button_placeOrder'))

"Step 25: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/link_productNavigation', ['link_productNavigation_AInternalText_1': link_productNavigation_AInternalText_1, 'link_productNavigation_css_value_1': link_productNavigation_css_value_1]))

"Step 26: Click on button logout2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_logout'))

"Step 27: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 28: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 29: Login into Application"

TrueTestScripts.login()

"Step 30: Click on link about2 -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_about'))

"Step 31: Click on link contact2 -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_about/link_contact'))

"Step 32: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_fullName'), input_fullName)

"Step 33: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/input_emailAddress'), input_emailAddress)

"Step 34: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 35: Click on button shippingPolicies (faqShipping)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies', ['button_shippingPolicies_ButtonInternalText_1': button_shippingPolicies_ButtonInternalText, 'button_shippingPolicies_css_value_1': button_shippingPolicies_css_value]))

"Step 36: Click on button shippingPolicies (returnPolicy)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/button_shippingPolicies', ['button_shippingPolicies_ButtonInternalText_1': button_shippingPolicies_ButtonInternalText_1, 'button_shippingPolicies_css_value_1': button_shippingPolicies_css_value_1]))

"Step 37: Click on link cartItems (cart) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/link_cartItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/link_cartItems', ['link_cartItems_AInternalText_2': link_cartItems_AInternalText_3, 'link_cartItems_css_value_2': link_cartItems_css_value_3]))

"Step 38: Click on button cart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cart3'))

"Step 39: Click on button cart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/button_cart3'))

"Step 40: Click on link productNavigation (home2) -> Navigate to page '/'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_cart/link_productNavigation', ['link_productNavigation_AInternalText_2': link_productNavigation_AInternalText_2, 'link_productNavigation_css_value_2': link_productNavigation_css_value_2]))

"Step 41: Click on link contact2 -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_contact2'))

"Step 42: Select option with input value from select subject"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Prod/Page_contact/select_subject'), select_subject, "label", false)

"Step 43: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_contact/textarea_message'), textarea_message)

"Step 44: Click on button sendMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_contact/button_sendMessage'))

"Step 45: Click on link productNavigation (products) -> Navigate to page '/product'"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_contact/link_productNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_contact/link_productNavigation', ['link_productNavigation_AInternalText_3': link_productNavigation_AInternalText_3, 'link_productNavigation_css_value_3': link_productNavigation_css_value_3]))

"Step 46: Click on button logout2 -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_logout'))

"Step 47: Click on link cart14 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_cart14'))

"Step 48: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_register'))

"Step 49: Login into Application"

TrueTestScripts.login()

"Step 50: Click on button logout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

"Step 51: Click on button addToCart3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart3'))

"Step 52: Click on button addToCart5 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_addToCart5'))

"Step 53: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Navigate and Checkout with Multiple Actions and Contact Messages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}