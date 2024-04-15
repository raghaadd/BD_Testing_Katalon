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

WebUI.setText(findTestObject('Object Repository/Page_ProductSearch  Ballard Designs/input_Design Services_searchTerm'), 
    'FM139')

WebUI.sendKeys(findTestObject('Object Repository/Page_ProductSearch  Ballard Designs/input_Design Services_searchTerm'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/span_ADD A MONOGRAM'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/img_Style 35_personalization-image-picker-o_0102b1'))

WebUI.setText(findTestObject('Page_Ballard Personalized Christmas Stockin_e18856/input_Monogram Letters_Monogram21-option'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/img_Tan_personalization-swatch-picker-option-image'))

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/span_ADD TO SELECTION'))

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/span_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Ballard Personalized Christmas Stockin_e18856/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/img_Spa_gwt-personalization-swatch-picker-o_39ad32'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/button_Save and Close'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Remove'))

WebUI.delay(3)

WebUI.closeBrowser()

