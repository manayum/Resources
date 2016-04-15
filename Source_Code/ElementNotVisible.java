Element Not Visible solution:

Solution 1:

WebDriverWait wait = new WebDriverWait(driver, 30)
.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='index.html']")));


Solution 2:

int ok_size=driver.findElements(By.xpath("//button[text()='OK']")).size();
 
driver.findElements(By.xpath("//button[text()='OK']")).get(ok_size-1).click();