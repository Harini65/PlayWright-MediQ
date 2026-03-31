package com.Tests;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Base.TestLisener;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

@Listeners(TestLisener.class)
class Self_Assessments extends BaseTest {
	@Test(priority = 1, enabled = false)
	public void OT() {
		page.getByText("NABH Self Assessments").click();
		page.getByText("OT Audit Check List").dblclick();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Person Name")).fill("Harini");
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Location")).click();
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Department-1")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open calendar")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("March 10,")).click();
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A. Physi0al fa0ilities
		radioActions.put("radio-group-0-01", 0);
		radioActions.put("radio-group-1-02", 1);
		radioActions.put("radio-group-2-03", 1);
		radioActions.put("radio-group-3-04", 2);
		radioActions.put("radio-group-4-05", 1);
		radioActions.put("radio-group-5-06", 0);
		radioActions.put("radio-group-6-07", 1);
		radioActions.put("radio-group-7-08", 2);
		// B. Pre-operative and post-operative ward/area
		radioActions.put("radio-group-8-01", 0);
		radioActions.put("radio-group-9-02", 1);
		radioActions.put("radio-group-10-03", 2);
		radioActions.put("radio-group-11-04", 0);
		radioActions.put("radio-group-12-05", 1);
		// 0. Related to medi0ines/0onsumable/supplies
		radioActions.put("radio-group-13-01", 0);
		radioActions.put("radio-group-14-02", 1);
		radioActions.put("radio-group-15-03", 2);
		radioActions.put("radio-group-16-04", 0);
		radioActions.put("radio-group-17-05", 1);
		// D. Pro0esses for patient safety
		radioActions.put("radio-group-18-01", 0);
		radioActions.put("radio-group-19-02", 1);
		radioActions.put("radio-group-20-03", 2);
		radioActions.put("radio-group-21-04", 0);
		radioActions.put("radio-group-22-05", 1);
		radioActions.put("radio-group-23-06", 0);
		radioActions.put("radio-group-24-07", 1);
		// E. Environmental pro0ess
		radioActions.put("radio-group-25-01", 0);
		radioActions.put("radio-group-26-02", 1);
		radioActions.put("radio-group-27-03", 2);
		radioActions.put("radio-group-28-04", 0);
		radioActions.put("radio-group-29-05", 1);
		radioActions.put("radio-group-30-06", 0);
		radioActions.put("radio-group-31-07", 1);
		// F. Quality Indi0ators
		radioActions.put("radio-group-32-01", 0);
		radioActions.put("radio-group-33-02", 1);
		radioActions.put("radio-group-34-03", 2);
		radioActions.put("radio-group-35-04", 0);
		radioActions.put("radio-group-36-05", 1);
		radioActions.put("radio-group-37-06", 0);
		radioActions.put("radio-group-38-07", 1);
		radioActions.put("radio-group-39-08", 1);
		for (Map.Entry<String, Integer> entry : radioActions.entrySet()) {
			String name = entry.getKey();
			int index = entry.getValue();

			page.locator("input[name='" + name + "']").nth(index).check();
		}
		page.locator("//button[normalize-space(text())='Save']").click();
		page.locator("(//span[text()=' Confirm ']/following-sibling::span)[2]").click();
	}

	@Test(priority = 2, enabled = false)
	public void PhamAudit() {
		page.getByText("NABH Self Assessments").click();
		page.getByText("Pharmacy Audit Check List").click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Person Name")).fill("James");
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Location")).click();
		page.getByText("Radiology").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open calendar")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("March 18,")).click();
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A. Legal Requirements
		radioActions.put("radio-group-0-01", 0);
		radioActions.put("radio-group-1-02", 1);
		radioActions.put("radio-group-2-03", 1);
		radioActions.put("radio-group-3-04", 2);
		radioActions.put("radio-group-4-05", 1);
		radioActions.put("radio-group-5-06", 0);
		radioActions.put("radio-group-6-07", 1);
		// B. Availability of Medicine
		radioActions.put("radio-group-7-01", 2);
		radioActions.put("radio-group-8-02", 0);
		radioActions.put("radio-group-9-03", 1);
		radioActions.put("radio-group-10-04", 2);
		radioActions.put("radio-group-11-05", 0);
		radioActions.put("radio-group-12-06", 1);
		radioActions.put("radio-group-13-07", 0);
		radioActions.put("radio-group-14-08", 1);
		radioActions.put("radio-group-15-09", 2);
		radioActions.put("radio-group-16-10", 0);
		radioActions.put("radio-group-17-11", 1);
		radioActions.put("radio-group-18-12", 0);
		radioActions.put("radio-group-19-13", 1);
		// C. Medicine safety
		radioActions.put("radio-group-20-01", 2);
		radioActions.put("radio-group-21-02", 0);
		radioActions.put("radio-group-22-03", 1);
		radioActions.put("radio-group-23-04", 0);
		radioActions.put("radio-group-24-05", 1);
		radioActions.put("radio-group-25-06", 0);
		radioActions.put("radio-group-26-07", 1);
		radioActions.put("radio-group-27-08", 2);
		radioActions.put("radio-group-28-09", 0);
		radioActions.put("radio-group-29-10", 1);
		radioActions.put("radio-group-30-11", 0);
		// D. Safety of pharmacy
		radioActions.put("radio-group-31-01", 1);
		radioActions.put("radio-group-32-02", 0);
		radioActions.put("radio-group-33-03", 1);
		// E. Quality Indicators applicable to pharmacy
		radioActions.put("radio-group-34-01", 2);
		radioActions.put("radio-group-35-02", 0);
		radioActions.put("radio-group-36-03", 1);
		radioActions.put("radio-group-37-04", 0);
		radioActions.put("radio-group-38-05", 1);
		for (Map.Entry<String, Integer> entry : radioActions.entrySet()) {
			String name = entry.getKey();
			int index = entry.getValue();

			page.locator("input[name='" + name + "']").nth(index).check();
		}
		page.locator("//button[normalize-space(text())='Save']").click();
		page.locator("(//span[text()=' Confirm ']/following-sibling::span)[2]").click();

	}

	@Test(priority = 3)
	public void EDAudit() {
		page.getByText("NABH Self Assessments").click();
		page.getByText("Emergency Department Audit").click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Person Name")).fill("harini");
		page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Location")).click();
		page.getByText("Multi-Specialty").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open calendar")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("March 24,")).click();
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		radioActions.put("radio-group-0-01", 0);
		radioActions.put("radio-group-1-02", 1);
		radioActions.put("radio-group-2-03", 1);
		radioActions.put("radio-group-3-04", 2);
		radioActions.put("radio-group-4-05", 1);
		radioActions.put("radio-group-5-06", 0);
		radioActions.put("radio-group-6-07", 1);
		radioActions.put("radio-group-7-08", 2);
		radioActions.put("radio-group-8-09", 0);
		radioActions.put("radio-group-9-10", 1);
		radioActions.put("radio-group-10-11", 2);
		radioActions.put("radio-group-11-12", 0);
		radioActions.put("radio-group-12-13", 1);
		radioActions.put("radio-group-13-14", 0);
		radioActions.put("radio-group-14-15", 1);
		radioActions.put("radio-group-15-16", 2);
		radioActions.put("radio-group-16-17", 0);
		radioActions.put("radio-group-17-18", 1);
		radioActions.put("radio-group-18-19", 0);
		radioActions.put("radio-group-19-20", 1);
		radioActions.put("radio-group-20-21", 2);
		radioActions.put("radio-group-21-22", 0);
		radioActions.put("radio-group-22-23", 1);
		radioActions.put("radio-group-23-24", 0);
		radioActions.put("radio-group-24-25", 1);
		radioActions.put("radio-group-25-26", 0);
		radioActions.put("radio-group-26-27", 1);
		radioActions.put("radio-group-27-28", 2);
		for (Map.Entry<String, Integer> entry : radioActions.entrySet()) {
			String name = entry.getKey();
			int index = entry.getValue();

			page.locator("input[name='" + name + "']").nth(index).check();
		}
		page.locator("//button[normalize-space(text())='Save']").click();
		page.locator("(//span[text()=' Confirm ']/following-sibling::span)[2]").click();

	}
}