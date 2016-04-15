
Syntax 1-
In this scenario if you know the total number of frames in webpage then using index, you can easily switch
try {
 
 driver.switchTo().frame(indexnumber);
 
      }
catch (NoSuchFrameException e)
     {            
 
 System.out.println(e.getMessage());     
 
      }

In this scenario if you know the name  of frames in webpage then using name also, you can easily switch
 

try {
driver.switchTo().frame(“framename”);
      } 
 catch (NoSuchFrameException e)
    {            
    System.out.println(e.getMessage());     
    }
1
2
3
4
5
6
7
try {
driver.switchTo().frame(“framename”);
      } 
 catch (NoSuchFrameException e)
    {            
    System.out.println(e.getMessage());     
    }




 try {
 
WebElement button=driver.findElement(By.xpath(""));  

driver.switchTo().frame(button);

}
catch (NoSuchFrameException e)
     {          
System.out.println(e.getMessage());     

     }
1
2
3
4
5
6
7
8
9
10
11
12
 try {
 
WebElement button=driver.findElement(By.xpath(""));  
 
driver.switchTo().frame(button);
 
}
catch (NoSuchFrameException e)
     {          
System.out.println(e.getMessage());     
 
     }