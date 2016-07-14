package uk.co.amazon.ui_testsprint1;

//import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.database.DatabaseManager;
import uk.co.amazon.hooks.Hooks;
import uk.co.amazon.pages.YourAccountPage;

import java.sql.ResultSet;
import java.sql.SQLException;


public class AmazonLoginTest extends Hooks {

	private YourAccountPage yourAccountPage;
	//private String accountName = "hello";
    private String myUsername = null;
    private String myPassword = null;
    private String myMessage = null;

	@Test
	public void testSignIn() throws SQLException {
       String mySqlQuery = "SELECT * FROM automation_testdata.login_details WHERE ID = 1;";
        ResultSet resultSet = DatabaseManager.runSqlSelectStatement(mySqlQuery);
        while(resultSet.next()){
            this.myUsername = resultSet.getString("username");
            this.myPassword = resultSet.getString("password");
            this.myMessage = resultSet.getString("message");
        }
        yourAccountPage = homePage
                .goToSignInPage()
                .populateSignInDetails(myUsername, myPassword);
        Assert.assertTrue(yourAccountPage.validateUserAccountName(myMessage.toLowerCase()), "Does not contain "+myMessage);
        System.out.println(myMessage+", LoginTest ran successfully");


/*
		System.out.println("Testing!!!");
        yourAccountPage = homePage
                .goToSignInPage()
                .populateSignInDetails();

		Assert.assertTrue(yourAccountPage.validateUserAccountName(accountName), "Does not contain "+accountName);

/*
		homePage.goToSignInPage();
		String mySqlQuery = "SELECT * FROM automation_testdata.login_details WHERE ID = 1;";

		try {
			ResultSet resultSet = DatabaseManager.runSqlSelectStatement(mySqlQuery);
            while(resultSet.next()){
                String myUsername = resultSet.getString("Username");
                String myPassword = resultSet.getString(3);
                System.out.println(myUsername);
                System.out.println(myPassword);
                Assert.assertEquals("tokslambe@gmail.com", myUsername);
                Assert.assertEquals("uranus2016", myPassword);
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
  */
	}
}
