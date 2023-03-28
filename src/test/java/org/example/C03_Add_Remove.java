package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Add_Remove extends  C00_Base {
    @Test
    public void Add_Remov(){
        //Select random number from 0 to 6

        int min = 0; // Minimum value of range
        int max = 1; // Maximum value of range
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);

        for(int x =0; x < random_int; x++){
            driver.findElement(By.cssSelector("button[onclick=\"addElement()\"]")).click();
            int count=driver.findElements(By.cssSelector("button[class=\"added-manually\"]")).size();
            Assert.assertEquals(count,random_int);
        }
    }

}
