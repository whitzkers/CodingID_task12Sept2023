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

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/a_Masuk'))

WebUI.setText(findTestObject('Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 'not.litefrost@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    'jlYWSi8mxv13dCRq/gql3A==')

WebUI.click(findTestObject('Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/i_Kontak_fas fa-user-alt'))

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/span_Profil'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/a_Edit Profile'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Coding.ID - Dashboard/img_Invoice_avatar-icon'), findTestData('New Test Data').getValue(
        2, 1))

WebUI.setText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/input_Fullname_name'), 'Sanjaya Sanjayi')

WebUI.setText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/input_Phone_whatsapp'), '081284065087')

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/button_Save Changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Coding.ID - Dashboard/div_Berhasil'), 'Berhasil')

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Dashboard/button_OK'))

WebUI.closeBrowser()

