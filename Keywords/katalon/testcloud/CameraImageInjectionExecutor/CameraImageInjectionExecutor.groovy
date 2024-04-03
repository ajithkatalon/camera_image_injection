package katalon.testcloud.CameraImageInjectionExecutor

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CameraImageInjectionExecutor {
    /**
     * Injects an image from "Data Files/TestCloud" into the camera for testing purposes.
     *
     * @param fileName The name of the file to inject.
     * @return true if the injection was successful, false if there was an error.
     */
    
	@Keyword
    def injectImage(String fileName) {
		 //file name (get project directory first then + relative path)
		
	}

    /**
     * Checks whether a file with the given name exist in "Data Files/TestCloud".
     *
     * @param fileName The name of the file to check.
     * @return true if the file exists, false otherwise.
     */
 
	 @Keyword 
    def exist(String fileName) {
}
}