package MyTests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

     public static void main(String[] args) throws  Exception{

           WiniumDriver driver;
           DesktopOptions option = new DesktopOptions();
           option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
           driver = new WiniumDriver(new URL("http://localhost:9999"), option );
           Thread.sleep(2000);
           driver.findElement(By.id("137")).click();
           driver.findElement(By.id("93")).click();
           driver.findElement(By.id("133")).click();
           driver.findElement(By.id("121")).click();
           Thread.sleep(2000);
           String output = driver.findElement(By.id("150")).getAttribute("Name");
           
           System.out.println("Result is: " + output);
           
           
     
     
     }

}
