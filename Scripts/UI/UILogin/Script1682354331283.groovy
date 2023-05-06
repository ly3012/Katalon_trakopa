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

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Page_Social Network/div_ng nhpPhoneQun mt khung nhpBn cha c ti khonng k'))

WebUI.verifyElementVisible(findTestObject('Page_Social Network/input_Phone_phone'))

WebUI.verifyElementVisible(findTestObject('Page_Social Network/input_Phone_password'))

WebUI.verifyElementVisible(findTestObject('Page_Social Network/button_ng nhp'))

WebUI.verifyElementVisible(findTestObject('Page_Social Network/div_Qun mt khu'))

WebUI.click(findTestObject('Page_Social Network/div_Qun mt khu'))

WebUI.verifyElementText(findTestObject('Page_Social Network/h1_Ly li mt khu'), 'LẤY LẠI MẬT KHẨU')

WebUI.click(findTestObject('Page_Social Network/a_Quay li trang ng nhp'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Social Network/a_ng k'))

WebUI.verifyElementVisible(findTestObject('Page_Social Network/button_ng k'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

