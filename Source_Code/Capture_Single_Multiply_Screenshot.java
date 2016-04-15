@BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
    }
    @Test
    public void testProduct(){
        driver.findElement(By.xpath("//img[@alt='Interstellar']")).click();
        ScreenShot.captureScreenShot(driver);

        driver.findElement(By.cssSelector("img[alt=\"Ex Machina\"]")).click();
        ScreenShot.captureScreenShot(driver);
    }

    public static  void captureScreenShot(WebDriver driver){
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        int i =1;
        try{
            FileUtils.copyFile(src, new File("D:/WORKSPACE/FUNCTIONAL-TESTING/screenshot/image"+(new Random().nextInt(10)) +".jpg"));
            //System.out.println(SequenceGenerator.nextInt(5));System.getCurrentTimeMilliSec();NanotTime();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void singleScreenShot(){
        // Css value: css=img.product-image -     xpath value: //img[@alt='Interstellar']
        // Css value: css=img[alt="Ex Machina"] - xpath value: //img[@alt='Ex Machina']
        driver.findElement(By.cssSelector("img.product-image")).click();
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(src, new File("D:/WORKSPACE/FUNCTIONAL-TESTING/screenshot/product.jpg"));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }