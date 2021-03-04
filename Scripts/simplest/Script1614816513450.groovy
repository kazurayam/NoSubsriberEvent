import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl("http://demoaut.katalon.com/")
WebUI.waitForPageLoad(10)
WebUI.delay(3)
WebUI.closeBrowser()