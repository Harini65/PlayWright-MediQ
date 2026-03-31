package com.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class BaseTest {
	protected Playwright playwrite;
	protected Browser browser;
	protected static Page page;

	@BeforeTest
	public void Setup() {
		playwrite = Playwright.create();
		browser = playwrite.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		BrowserContext context = browser.newContext();
		page = context.newPage();
		page.navigate("https://nabh-dev-ui-gugpbpcfd9czb6as.centralus-01.azurewebsites.net/#/login");
	}

	@BeforeClass
	public void Valid_login() {
		page.locator("(//input[contains(@class,'form-control ng-untouched')])[1]").fill("MediQ_NABH_User");
		page.locator("(//input[contains(@class,'form-control ng-untouched')])[2]").fill("Logix#123$");
		page.locator("//button[contains(@class,'btn btn-primary')]").click();
		assertThat(page.getByText("Main Line Hospitals")).isVisible();
		assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Screen Navigation")))
				.isVisible();
	}

	@Test
	public void LogoCheck() {
		assertThat(page.getByRole(AriaRole.IMG).nth(2)).isVisible();

	}

	@AfterClass
	public void Logout() {
		page.locator("#dropdownMenuButton").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
		assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
	}

	@AfterTest
	public void TearDown() {
		if (page != null)
			page.close();
		if (browser != null)
			browser.close();
		if (playwrite != null)
			playwrite.close();

	}

}
