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
    'MO567')

WebUI.sendKeys(findTestObject('Object Repository/Page_Furniture Stores and Home Decor/input_Design Services_searchTerm'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/img_1,227.00 - 1,699.00_gwt-image-picker-op_170771'))

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/img_Make a Selection_gwt-image-picker-option-image'))

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/img_Make a Selection_gwt-image-picker-option-image_1'))

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Edit'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/div_ITEM 13-Drawer CabinetIn-stock usually _95b5d4'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/img_In-stock usually ships in 1-7 business _d8e2a1_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hutton 32 inch White Credenza Modular _a00fd2/button_Update Cart'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Object Repository/Page_Shopping Cart  Ballard Designs/a_Remove'))

WebUI.delay(3)

