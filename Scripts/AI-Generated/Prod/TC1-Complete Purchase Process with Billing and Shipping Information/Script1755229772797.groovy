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

"Step 2: Click on image card"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/image_card'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on image card.png')

"Step 3: Click on link buyNow -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/link_buyNow'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link buyNow - Navigate to page product.png')

"Step 4: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button addToCart.png')

"Step 5: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button addToCart.png')

"Step 6: Click on link cart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_product/link_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link cart - Navigate to page cart.png')

"Step 7: Click on link goToCheckout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_cart/link_goToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link goToCheckout - Navigate to page checkout.png')

"Step 8: Click on form checkout"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/form_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on form checkout.png')

"Step 9: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input firstName.png')

"Step 10: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input firstName.png')

"Step 11: Click on input lastName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input lastName.png')

"Step 12: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input lastName.png')

"Step 13: Click on div billingDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_billingDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on div billingDetails.png')

"Step 14: Click on input address"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on input address.png')

"Step 15: Enter input value in input address"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_address'), input_address)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input address.png')

"Step 16: Click on input nameOnCard"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input nameOnCard.png')

"Step 17: Enter input value in input nameOnCard"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_nameOnCard'), input_nameOnCard)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input nameOnCard.png')

"Step 18: Click on input creditCardNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input creditCardNumber.png')

"Step 19: Enter input value in input creditCardNumber"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_creditCardNumber'), input_creditCardNumber)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Enter input value in input creditCardNumber.png')

"Step 20: Click on input expiration"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input expiration.png')

"Step 21: Enter input value in input expiration"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_expiration'), input_expiration)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input expiration.png')

"Step 22: Click on input cvv"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on input cvv.png')

"Step 23: Enter input value in input cvv"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_cvv'), input_cvv)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Enter input value in input cvv.png')

"Step 24: Click on input address2"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_address2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input address2.png')

"Step 25: Select option with input value from select country"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Prod/Page_checkout/select_country'), select_country)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Select option with input value from select country.png')

"Step 26: Select option with input value from select state"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Prod/Page_checkout/select_state'), select_state)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Select option with input value from select state.png')

"Step 27: Click on input zip"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on input zip.png')

"Step 28: Enter input value in input zip"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_zip'), input_zip)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Enter input value in input zip.png')

"Step 29: Click on div orderSummaryDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummaryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div orderSummaryDetails.png')

"Step 30: Click on div billingDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_billingDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on div billingDetails.png')

"Step 31: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on input email.png')

"Step 32: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Enter input value in input email.png')

"Step 33: Click on div orderSummaryDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummaryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on div orderSummaryDetails.png')

"Step 34: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on input email.png')

"Step 35: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_email'), input_email_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Enter input value in input email.png')

"Step 36: Click on div address"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_address'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on div address.png')

"Step 37: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on input firstName.png')

"Step 38: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_checkout/input_firstName'), input_firstName_1)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Enter input value in input firstName.png')

"Step 39: Click on div orderSummaryDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummaryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on div orderSummaryDetails.png')

"Step 40: Click on div orderSummary"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on div orderSummary.png')

"Step 41: Click on div orderSummaryDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/div_orderSummaryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on div orderSummaryDetails.png')

"Step 42: Click on link reactEcommerce -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_checkout/link_reactEcommerce'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on link reactEcommerce - Navigate to page .png')

"Step 43: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase Process with Billing and Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}