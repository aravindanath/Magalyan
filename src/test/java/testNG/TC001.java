package testNG;

import org.testng.annotations.*;

/**
 * 
 * @author aravindanathdm
 * 
 *         End to End Amazon Test TC001 launch chrome open url login search
 *         addtocart add address cod logout
 * 
 *
 */

public class TC001 {

	@BeforeTest
	public void launchBrowser() {

		System.err.println("Launch browser");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("=================before method=====================");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("********************After method********************");
	}

	@Test(priority = 1)
	public void openURL() {

		System.out.println("open URL");
	}

	@Test(priority = 2)
	public void login() {

		System.out.println("login");
	}

	@Test(priority = 3)
	public void search() {

		System.out.println("search");
	}

	@Test(priority = 4)
	public void addToCart() {

		System.out.println("Add to cart");
	}

	@Test(priority = 5)
	public void addAddredd() {

		System.out.println("Add address");
	}

	@Test(priority = 6)
	public void cod() {

		System.out.println("cod");
	}

	@AfterTest
	public void closeBrowser() {

		System.err.println("close browser");
	}

}
