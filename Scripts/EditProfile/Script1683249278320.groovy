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
WebUI.setText(findTestObject('Page_Social Network/input_Phone_phone'), GlobalVariable.username1)
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Social Network/input_Phone_password'), GlobalVariable.password1)
WebUI.click(findTestObject('Object Repository/Page_Social Network/span_ng nhp'))
WebUI.delay(2.5)
WebUI.click(findTestObject('Object Repository/Page_Social Network/button_Phng L'))
WebUI.click(findTestObject('Object Repository/Page_Social Network/a_Trang c nhn'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Social Network/span_Chnh sa'))
WebUI.delay(2.5)
WebUI.click(findTestObject('Object Repository/Page_Social Network/UI Profile/Page_Social Network/div_ngy_w-30px h-30px border-gray_1 bg-gray_1 hoverborder-gray_2 hoverbg-gray_2 rounded-full flex items-center justify-center p-1 cursor-pointer shadow-md'))
WebUI.delay(2)
WebUI.clearText(findTestObject('Object Repository/Page_Social Network/input_Khc_email'))
WebUI.setText(findTestObject('Object Repository/Page_Social Network/input_Khc_email'), '')
WebUI.click(findTestObject('Object Repository/Page_Social Network/button_Cp nht'))
WebUI.delay(1)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Social Network/p_phunglygmail.com'), 'phungly@gmail.com')
WebUI.closeBrowser()
