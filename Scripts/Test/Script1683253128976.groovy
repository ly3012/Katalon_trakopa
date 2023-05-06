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

WebUI.navigateToUrl('http://localhost:32000/login')

WebUI.setText(findTestObject('Object Repository/Page_Social Network/input_Phone_phone'), '036 767 306 8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Social Network/input_Phone_password'), '8hpL1O2nqpDAgR9zh5PFjQ==')

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/button_Phng L'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/a_Trang c nhn'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/a_Chnh sa'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_Chnh sa'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/svg_Cng vic_icon icon-tabler icon-tabler-pencil'))

WebUI.setText(findTestObject('Object Repository/Page_Social Network/input_ngy_work'), 'Phú Thọ')

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_Cp nht'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/div_Cng vic lm vic ti Ph Th'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/p_lm vic ti Ph Th'))

