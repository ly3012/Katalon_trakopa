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
WebUI.click(findTestObject('Object Repository/Page_Social Network/button_Phng L'))
WebUI.click(findTestObject('Page_Social Network/a_Trang c nhn'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/a_Trang ch'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/a_Gii thiu'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/a_nh'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/a_Bn b'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/div_Chia s cm ngh ca bn'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/div_Gii thiuChnh sa lm vic ti Ph ThTng hc t_9faaa2'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/div_nh'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/div_Bn b'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Social Network/UIProfile/Page_Social Network/div_Phng L'))
WebUI.closeBrowser()


