package com.example.calculatortest;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ExampleUnitTest {
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "HUAWEI LYO-L21");
        // Имя ОС на мобильном устройстве
        capabilities.setCapability("platformName", "Android");
        // Версия ОС
        capabilities.setCapability("platformVersion", "5.1");
        // Уникальный индефикатор подключенного устройства
        capabilities.setCapability("imei", "862557038726010");

        capabilities.setCapability("appActivity", "com.vbanthia.androidsampleapp.MainActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    //Сумма (0+0)
    public void testAddition() {
        
        clickToLeftField();

        setToLeftField("0");

        clickToRightField();

        setToRightField("0");

        clickToAddition();

        results = driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,00 + 0,00 = 0,00", "Результат должен быть равен: 0");

        Reset();

    }
    //Сумма (0+1)
    public void testAddition1() {
  
        clickToLeftField();

        setToLeftField("0");

        clickToRightField();

        setToRightField("1");

        clickToAddition();

        results = driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,00 + 1,00 = 1,00", "Результат должен быть равен: 1");

        Reset();

    }

    //Сумма (1+0)
    public void testAddition2() {
   
        clickToLeftField();

        setToLeftField("1");

        clickToRightField();

        setToRightField("0");

        clickToAddition();

        results = driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "1,00 + 0,00 = 1,00", "Результат должен быть равен: 1");

        Reset();

    }

    //Сумма (0,5+0,5)
    public void testAddition3() {
 
        clickToLeftField();

        setToLeftField("0.5");

        clickToRightField();

        setToRightField("0.5");

        clickToAddition();

        results = t) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,50 + 0,50 = 1,00", "Результат должен быть равен: 1");

        Reset();

    }

    private void Reset() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/resetButton").click();
    }

    //Разница (0 - 1)
    public void testSub() {

        clickToLeftField();

        setToLeftField("0");

        clickToRightField();

        setToRightField("1");

        clickToSubtract();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,00 - 1,00 = -1,00", "Результат должен быть равен: -1");

        Reset();
    }

    //Разница (1 - 0)
    public void testSub1() {

        clickToLeftField();

        setToLeftField("1");

        clickToRightField();

        setToRightField("0");

        clickToSubtract();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "1,00 - 0,00 = 1,00", "Результат должен быть равен: 1");

        Reset();
    }

    //Частное (0.5/0.4)
    public void testDiv() {
 
        clickToLeftField();

        setToLeftField("0.5");

        clickToRightField();

        setToRightField("0.4");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,50 / 0,40 = 1,25", "Результат должен быть равен: 1,25");

        Reset();
    }

    //Частное (0/5)
    public void testDiv1() {
       
        clickToLeftField();

        setToLeftField("0");

        clickToRightField();

        setToRightField("5");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,00 / 5,00 = 0,00", "Результат должен быть равен: 0");

        Reset();
    }

    //Частное (10/5)
    public void testDiv2() {
       
        clickToLeftField();

        setToLeftField("10");

        clickToRightField();

        setToRightField("5");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "10,00 / 5,00 = 2,00", "Результат должен быть равен: 2");

        Reset();
    }

    //Частное (5/1)
    public void testDiv3() {
       
        clickToLeftField();

        setToLeftField("5");

        clickToRightField();

        setToRightField("1");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,50 / 0,40 = 1,25", "Результат должен быть равен: 1,25");

        Reset();
    }

    //Частное (5/10)
    public void testDiv4() {
        
        
        clickToLeftField();

        setToLeftField("5");

        clickToRightField();

        setToRightField("10");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "5,00 / 10,00 = 0,50", "Результат должен быть равен: 0,5");

        Reset();
    }

    //Частное (5/1000)
    public void testDiv5() {
        

        clickToLeftField();

        setToLeftField("5");

        clickToRightField();

        setToRightField("1000");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "5,00 / 1000 = 0,005", "Результат должен быть равен: 0,005");

        Reset();
    }

    //Частное (5/0)
    public void testDiv6() {
  
        clickToLeftField();

        setToLeftField("5");

        clickToRightField();

        setToRightField("5");

        clickToDiv();

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "5.00 / 1000,00 = Infinity", "На ноль делить нельзя");

        Reset();
    }
    //Произведение (0*5)
    public void testMult() {

        clickToLeftField();

        setToLeftField("0");

        clickToRightField();

        setToRightField("5");

        clickToMult();


        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "5,00 * 0,00 = 0,00", "Результат должен быть равен: 0");

        Reset();
    }

    //Произведение (1.5*10)
    public void testMult1() {
        
        clickToLeftField();

        setToLeftField("1.5");

        clickToRightField();

        setToRightField("10");

        clickToMult();


        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "1,50 * 10,00 = 15,00", "Результат должен быть равен: 15");

        Reset();
    }

    //Произведение (1.7*1.3)
    public void testMult2() {
        

        clickToLeftField();

        setToLeftField("1.7");

        clickToRightField();

        setToRightField("1.3");

        clickToMult();


        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "1,70 * 1,30 = 2,21", "Результат должен быть равен: 2,21");

        Reset();
    }

    //Произведение (1*5)
    public void testMult3() {
       

        clickToLeftField();

        setToLeftField("1");

        clickToRightField();

        setToRightField("5");

        clickToMult();


        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "1,00 * 5,00 = 5,00", "Результат должен быть равен: 5");

        Reset();
    }

    //Произведение (5*1)
    public void testMult4() {
        

        clickToLeftField();

        setToLeftField("5");

        clickToRightField();

        setToRightField("1");

        clickToMult();


        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft");

        assertion(results, "0", "Должен быть доступен ввод только одного нуля без разделителя");

        Reset();
    }
	
	 @Test
    //Сумма (Ввод нулей)
    public void testAddition() {
        

        clickToLeftField();

        setToLeftField("0");

        MobileElement results = (MobileElement) driver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView");

        assertion(results, "0,00 + 0,00 = 0,00", "Результат должен быть равен: 0");

        Reset();

    private void clickToDiv() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/divisionButton").click();
    }

    private void clickToSubtract() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/subtractButton").click();
    }

    private void clickToMult() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/multiplicationButton").click();
    }

    private void setToRightField(String number) {
        driver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").sendKeys(number);
    }

    private void setToLeftField(String number) {
        driver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").sendKeys(number);
    }

    private void assertion(MobileElement results, String expectedResult, String message) {
        Assert.assertEquals(expectedResult, results.getText(), message);
    }

    private void clickToAddition() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/additionButton").click();
    }

    private void clickToRightField() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").click();
    }

    private void clickToLeftField() {
        driver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}


