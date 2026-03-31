package com.Base;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.microsoft.playwright.Page;

public class TestLisener implements ITestListener {
	@AfterMethod
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		Page page = BaseTest.page;

		if (page != null) {

			try {
				page.evaluate("document.body.style.border='5px solid red'");
				page.evaluate("document.activeElement.style.border='3px solid red'");
				page.waitForTimeout(500);
				String fileName = result.getName() + "_" + System.currentTimeMillis() + ".png";

				page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("screenshots/" + fileName))
						.setFullPage(true));

				System.out.println("Screenshot taken for: " + result.getName());
			} catch (Exception e) {
				System.out.println("Screenshot failed: " + e.getMessage());
			}
		} else {
			System.out.println("Page is null - Screenshot not captured");
		}
	}
}
