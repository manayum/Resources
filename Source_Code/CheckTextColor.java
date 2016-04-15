    public WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
    }
    @Test
    public void checkColor(){
        String color;
        color = driver.findElement(By.xpath("//a[contains(text(),'See more')]")).getCssValue("color");
        System.out.println(color);
        String [] hexValue = color.replace("rgba(", "").replace(")","").split(",");

        int hexValue1 = Integer.parseInt(hexValue[0]);
        hexValue[1] = hexValue[1].trim();
        int hexValue2 = Integer.parseInt(hexValue[1]);
        hexValue[2] = hexValue[2].trim();
        int hexValue3 = Integer.parseInt(hexValue[2]);
        hexValue[3] = hexValue[3].trim();
        int hexValue4 = Integer.parseInt(hexValue[3]);

        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        String expectedColor = "#247bbd";

       try{
           Assert.assertEquals(actualColor, expectedColor);
           System.out.println("Validated  text color successfull ");
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
