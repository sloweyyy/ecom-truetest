import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Staging.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link login -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_login'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link login - Navigate to page login.png')

"Step 3: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on input email.png')

"Step 4: Click on link reactEcommerce -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/link_reactEcommerce'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link reactEcommerce - Navigate to page .png')

"Step 5: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link products - Navigate to page product.png')

"Step 6: Click on link products"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_product/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link products.png')

"Step 7: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_product/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link about - Navigate to page about.png')

"Step 8: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_about/link_contact'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link contact - Navigate to page contact.png')

"Step 9: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/input_name'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input name.png')

"Step 10: Enter input value in input name"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_contact/input_name'), input_name)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input name.png')

"Step 11: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input email.png')

"Step 12: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_contact/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input email.png')

"Step 13: Press key Tab on input email"

WebUI.sendKeys(findTestObject('AI-Generated/Staging/Page_contact/input_email'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Press key Tab on input email.png')

"Step 14: Enter input value in textarea message"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_contact/textarea_message'), textarea_message)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in textarea message.png')

"Step 15: Click on div send"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/div_send'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div send.png')

"Step 16: Click on div send"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/div_send'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div send.png')

"Step 17: Click on div send"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/div_send'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on div send.png')

"Step 18: Click on textarea message"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/textarea_message'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on textarea message.png')

"Step 19: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link cart - Navigate to page cart.png')

"Step 20: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link goToCheckout - Navigate to page login.png')

"Step 21: Click on link register -> Navigate to page '/register'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/link_register'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link register - Navigate to page register.png')

"Step 22: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_register/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link cart - Navigate to page cart.png')

"Step 23: Click on link about"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on link about.png')

"Step 24: Click on link contact -> Navigate to page '/contact'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_contact'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on link contact - Navigate to page contact.png')

"Step 25: Click on link home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_contact/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on link home - Navigate to page .png')

"Step 26: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on link cart - Navigate to page cart.png')

"Step 27: Click on link goToCheckout -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on link goToCheckout - Navigate to page login.png')

"Step 28: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on div demoCredentials.png')

"Step 29: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div demoCredentials.png')

"Step 30: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on div demoCredentials.png')

"Step 31: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on div demoCredentials.png')

"Step 32: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on div demoCredentials.png')

"Step 33: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on div demoCredentials.png')

"Step 34: Click on div emailAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_emailAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on div emailAddress.png')

"Step 35: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on input email.png')

"Step 36: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_login/input_email'), input_email_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Enter input value in input email.png')

"Step 37: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on div demoCredentials.png')

"Step 38: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on div demoCredentials.png')

"Step 39: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on div demoCredentials.png')

"Step 40: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on div demoCredentials.png')

"Step 41: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on div demoCredentials.png')

"Step 42: Click on div demoCredentials"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_demoCredentials'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on div demoCredentials.png')

"Step 43: Click on div password"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/div_password'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on div password.png')

"Step 44: Click on input password"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/input_password'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on input password.png')

"Step 45: Enter input value in input password"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_login/input_password'), input_password)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Enter input value in input password.png')

"Step 46: Click on button login -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_login/button_login'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on button login - Navigate to page .png')

"Step 47: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on link cart - Navigate to page cart.png')

"Step 48: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on link goToCheckout - Navigate to page checkout.png')

"Step 49: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on input firstName.png')

"Step 50: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Enter input value in input firstName.png')

"Step 51: Click on input lastName"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_lastName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on input lastName.png')

"Step 52: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Enter input value in input lastName.png')

"Step 53: Click on div billingDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/div_billingDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Click on div billingDetails.png')

"Step 54: Click on input address"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on input address.png')

"Step 55: Enter input value in input address"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_address'), input_address)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Enter input value in input address.png')

"Step 56: Click on input address2"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_address2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Click on input address2.png')

"Step 57: Enter input value in input address2"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_address2'), input_address2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Enter input value in input address2.png')

"Step 58: Select option with input value from select country"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Staging/Page_checkout/select_country'), select_country)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Select option with input value from select country.png')

"Step 59: Select option with input value from select state"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Staging/Page_checkout/select_state'), select_state)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Select option with input value from select state.png')

"Step 60: Click on input zip"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_zip'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Click on input zip.png')

"Step 61: Enter input value in input zip"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_zip'), input_zip)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Enter input value in input zip.png')

"Step 62: Click on input nameOnCard"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Click on input nameOnCard.png')

"Step 63: Enter input value in input nameOnCard"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_nameOnCard'), input_nameOnCard)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Enter input value in input nameOnCard.png')

"Step 64: Click on input creditCardNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_creditCardNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Click on input creditCardNumber.png')

"Step 65: Enter input value in input creditCardNumber"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_creditCardNumber'), input_creditCardNumber)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Enter input value in input creditCardNumber.png')

"Step 66: Click on input expiration"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Click on input expiration.png')

"Step 67: Enter input value in input expiration"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_expiration'), input_expiration)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Enter input value in input expiration.png')

"Step 68: Click on input cvv"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on input cvv.png')

"Step 69: Enter input value in input cvv"

WebUI.setText(findTestObject('AI-Generated/Staging/Page_checkout/input_cvv'), input_cvv)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Enter input value in input cvv.png')

"Step 70: Click on button placeOrder"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/button_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Click on button placeOrder.png')

"Step 71: Click on link continueShopping -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_checkout/link_continueShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on link continueShopping - Navigate to page .png')

"Step 72: Click on button toggleNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/button_toggleNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on button toggleNavigation.png')

"Step 73: Click on link products -> Navigate to page '/product'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_home/link_products'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on link products - Navigate to page product.png')

"Step 74: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Click on button addToCart addToCart.png')

"Step 75: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Click on button addToCart addToCart2.png')

"Step 76: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Dynamic Objects/Page_product/button_addToCart', ['button_addToCart_id': button_addToCart_id_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Click on button addToCart addToCart3.png')

"Step 77: Click on button toggleNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_product/button_toggleNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Click on button toggleNavigation.png')

"Step 78: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_product/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Click on link cart - Navigate to page cart.png')

"Step 79: Click on button clearCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/button_clearCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Click on button clearCart.png')

"Step 80: Click on div cartEmpty"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/div_cartEmpty'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Click on div cartEmpty.png')

"Step 81: Click on link cart -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Staging/Page_cart/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on link cart - Navigate to page .png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Comprehensive User Journey through E commerce Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}