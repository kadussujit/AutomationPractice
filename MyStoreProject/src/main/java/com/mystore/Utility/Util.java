package com.mystore.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.mystore.Base.TestBase;

public class Util extends TestBase{
	
	public void takeSS(String filename)
	{
		String path =".\\MyStoreProject\\Screenshots\\";
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path+filename+".png");
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Add correct path");
		}
	}

}
