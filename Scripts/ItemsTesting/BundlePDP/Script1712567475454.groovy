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

WebUI.setText(findTestObject('Object Repository/Page_Furniture Stores and Home Decor/input_Design Services_searchTerm'), 
    'LC686')

WebUI.sendKeys(findTestObject('Object Repository/Page_Furniture Stores and Home Decor/input_Design Services_searchTerm'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Carriage House 6 Light Birdcage Pendan_e113a6/img_Select Finish_gwt-image-picker-option-image'))

WebUI.click(findTestObject('Object Repository/Page_Carriage House 6 Light Birdcage Pendan_e113a6/button_In-stock usually ships in 1-7 busine_2d3f42'))

WebUI.click(findTestObject('Object Repository/Page_Carriage House 6 Light Birdcage Pendan_e113a6/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Carriage House 6 Light Birdcage Pendan_e113a6/button_Checkout'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/img_Dark Bronze_gwt-image-picker-option-image'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/button_Save and Close'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/button_49.00_decrementId'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Remove'))

WebUI.delay(3)

