import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject(
	'Object Repository/Page_Social Network/input_Phone_phone'),
	 GlobalVariable.username1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Social Network/input_Phone_password'),
	GlobalVariable.password1)

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_ng nhp'))

WebUI.delay(0.5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/li_Trang ch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/li_a im'))
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/li_Bn b'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/li_Lch trnh'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/li_t phng'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/span_Phng L_ant-input-affix-wrapper rounded-full w-250px ant-input-affix-wrapper-lg'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/button_Phng L'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/div_Chia s cm ngh ca bn'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/div_Phng L_w-36px h-36px border-0.5px border-8B239C rounded-full mr-3 cursor-pointer flex items-center justify-center bg-8B239C hoverbg-761b84 hoverborder-761b84'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/div_To tin'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/button_Phng L'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/a_a im'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/a_Bn b'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/a_Lch trnh'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/a_t phng'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIHomePage/Page_Social Network/a_Trang ch'))

WebUI.closeBrowser()

