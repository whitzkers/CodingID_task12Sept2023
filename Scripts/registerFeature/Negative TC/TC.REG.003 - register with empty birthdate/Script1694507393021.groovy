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

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/btn_Register'))

WebUI.setText(findTestObject('registerPage/input_Nama_name'), GlobalVariable.name)

WebUI.setText(findTestObject('registerPage/input_E-Mail_email'), GlobalVariable.unregistEmail)

WebUI.setText(findTestObject('registerPage/input_Whatsapp_whatsapp'), GlobalVariable.whatsapp)

WebUI.setEncryptedText(findTestObject('registerPage/input_Kata Sandi_password'), GlobalVariable.unregistPassword)

WebUI.setEncryptedText(findTestObject('registerPage/input_Konfirmasi kata sandi_password_confirmation'), GlobalVariable.unregistPassword)

WebUI.click(findTestObject('registerPage/input_Konfirmasi kata sandi_inlineCheckbox1'))

WebUI.click(findTestObject('registerPage/button_Daftar'))

WebUI.verifyElementPresent(findTestObject('registerPage/txt_birthdate diisi'), 0)

WebUI.closeBrowser()

