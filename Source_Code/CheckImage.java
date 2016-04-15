public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
    }
    @Test
    public void checkImagePresence()throws Exception{
        checkImageByJavaScriptExecutor();
        checkImageByCss();
    }

    public void checkImageByJavaScriptExecutor(){
        // Css value : css=img.product-image
        // xpath value: //img[@alt='Interstellar']
        WebElement ImageFile = driver.findElement(By.xpath("//img[@alt='Interstellar']"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
                ("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent){
            System.out.println("Image not displayed.");
        }
        else{
            System.out.println("Image displayed.");
        }
    }

    public void checkImageByCss(){
        if(!isDisplay(By.cssSelector("img.product-image"))){
            System.out.println("Image not displayed.");
        }
        else{
            System.out.println("Image displayed.");
        }
    }
    public boolean isDisplay(By by){
        try{
            WebElement elementDisply = driver.findElement(by);
            elementDisply.isDisplayed();
            //Reporters.log("element displayed successfully");
            return true;
        }catch (Exception e){
            //Reporters.log("element not displayed");
            return false;
        }
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}