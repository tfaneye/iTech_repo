package com.guru99.live.firstPackageTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.guru99.live.excel_reader.SpreadsheetData;
import com.guru99.live.hooks.GeneralHooks;
import com.guru99.live.pages.HomePage;

@RunWith(Parameterized.class)
public class LoginTest extends GeneralHooks {
	
	private HomePage homePage;
	private String username;
	private String password;
	private String name;
	
	public LoginTest(String username, String password, String name){
		this.username = username;
		this.password = password;
		this.name = name;
		
	}
	
	@Parameters
	public static Collection spreadSheetData() throws IOException{
		//String excelName = "\\test_data\\release_one\\LoginTestData.xls";
		//String localPath = "\\src\\test\\resources";
		/*String path = System.getProperty("user.dir")+"\\src\\test\\resources\\com\\guru99\\live\\test_data\\LoginTestData.xls";*/
		String path = System.getProperty("user.dir")+"/src/test/resources/com/guru99/live/test_data/LoginTestData.xls";
		InputStream spreadsheet = new FileInputStream(path);
		return new SpreadsheetData(spreadsheet).getData();
	}
	
	@Test
	public void magentoLoginTest(){
		String message = homePage
		.goToMyAccount()
		.loginWith(username, password).validateLogin();

		//.validateLogin("Welcome, Donald Jonathan!");
	}
	
	@Test @Ignore
	public void magentoLogoutTest(){
		//myAccountPage.logout();
	}
	
	

}
