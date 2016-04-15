@BeforeTest
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(enabled = false)
    public void toolTipCase1() {
        driver.navigate().to(seleniumURL);

        WebElement element1 = driver.findElement(By.xpath("//li[@id='menu_projects']/a"));//("//a[@title='Selenium Projects']"));
        WebElement element2 = driver.findElement(By.cssSelector("#header>h1 a"));
        // Get tooltip text
        String toolTipText1 = element1.getAttribute("title");
        String toolTipText2 = element2.getAttribute("title");

        System.out.println("Tool tip text present for element 1 :- " + toolTipText1);
        System.out.println("Too tip text preset for element 2 :" + toolTipText2);

        // Compare toll tip text
        //Assert.assertEquals("Return to Selenium home page", toolTipText);
    }
    @Test(enabled = false)
    public void toolTipCase2() {
        driver.navigate().to("http://www.google.com");
        WebElement element1 = driver.findElement(By.cssSelector("#hplogo > a > img[alt=\"St. Patrick's Day 2016\"]"));
        // Get tooltip text
        String toolTipText = element1.getAttribute("title");
        System.out.println("Tool tip text present for element 1 :- " + toolTipText);
        // Compare toll tip text
        Assert.assertEquals("Return to Selenium home page", toolTipText);
    }

    @Test
    public void toolTipCase3() {
        driver.navigate().to(jQueryURL);

        // As there is frame, we have to navigate to frame
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

        // Text box field, where we mouse hover
        WebElement element = driver.findElement(By.id("age"));

        // Use action class to mouse hover on Text box field
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));

        // To get the tool tip text and assert
        String toolTipText = toolTipElement.getText();
        System.out.println(toolTipText);
        Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipText);

    }


}