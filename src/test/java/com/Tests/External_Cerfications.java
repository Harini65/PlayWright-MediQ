package com.Tests;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Base.TestLisener;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@Listeners(TestLisener.class)
public class External_Cerfications extends BaseTest {

	@Test(priority = 1)
	public void AAC() {
		page.getByText("NABH External Certifications").click();
		page.getByText("NABH External AAC").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open calendar")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("2025")).click();

		Map<String, String> answers = new LinkedHashMap<>();
		// AAC-1
		answers.put("commitment_0_0", "yes");
		answers.put("commitment_0_1", "no");
		answers.put("commitment_0_2", "yes");
		answers.put("commitment_0_3", "no");
		// AAC-2
		answers.put("commitment_1_0", "yes");
		answers.put("commitment_1_1", "no");
		answers.put("commitment_1_2", "yes");
		answers.put("core_1_0", "no");
		answers.put("achievement_1_0", "yes");
		// AAC-3
		answers.put("commitment_2_0", "no");
		answers.put("commitment_2_1", "yes");
		answers.put("commitment_2_2", "yes");
		answers.put("commitment_2_3", "no");
		// AAC-4
		answers.put("commitment_3_0", "no");
		answers.put("commitment_3_1", "yes");
		answers.put("commitment_3_2", "yes");
		answers.put("core_3_0", "no");
		answers.put("achievement_3_0", "yes");
		answers.put("achievement_3_1", "no");
		answers.put("excellence_3_0", "yes");
		// AAC-5
		answers.put("commitment_4_0", "yes");
		answers.put("commitment_4_1", "no");
		answers.put("commitment_4_2", "yes");
		answers.put("core_4_0", "no");
		answers.put("achievement_4_0", "yes");
		// AAC-6
		answers.put("commitment_5_0", "yes");
		answers.put("commitment_5_1", "no");
		answers.put("commitment_5_2", "yes");
		answers.put("commitment_5_3", "yes");
		answers.put("commitment_5_4", "no");
		answers.put("commitment_5_5", "no");
		answers.put("commitment_5_6", "yes");
		answers.put("commitment_5_7", "no");
		answers.put("commitment_5_8", "yes");
		answers.put("achievement_5_0", "yes");
		// AAC-7
		answers.put("commitment_6_0", "yes");
		answers.put("commitment_6_1", "no");
		answers.put("commitment_6_2", "yes");
		answers.put("commitment_6_3", "no");
		answers.put("commitment_6_4", "yes");
		answers.put("excellence_6_0", "yes");
		// AAC-8
		answers.put("commitment_7_0", "no");
		answers.put("commitment_7_1", "yes");
		answers.put("commitment_7_2", "yes");
		answers.put("commitment_7_3", "no");
		// AAC-9
		answers.put("commitment_8_0", "no");
		answers.put("commitment_8_1", "yes");
		answers.put("commitment_8_2", "no");
		answers.put("commitment_8_3", "yes");
		answers.put("commitment_8_4", "no");
		answers.put("commitment_8_5", "no");
		answers.put("commitment_8_6", "yes");
		answers.put("commitment_8_7", "no");
		answers.put("core_8_0", "yes");
		answers.put("achievement_8_0", "no");
		// AAC-10
		answers.put("commitment_9_0", "yes");
		answers.put("commitment_9_1", "no");
		answers.put("commitment_9_2", "no");
		answers.put("commitment_9_3", "yes");
		answers.put("commitment_9_4", "no");
		answers.put("achievement_9_0", "yes");
		answers.put("achievement_9_1", "yes");
		answers.put("excellence_9_0", "yes");
		// AAC-11
		answers.put("commitment_10_0", "yes");
		answers.put("commitment_10_1", "no");
		answers.put("commitment_10_2", "yes");
		answers.put("commitment_10_3", "no");
		answers.put("commitment_10_4", "yes");
		answers.put("commitment_10_5", "no");
		answers.put("commitment_10_6", "yes");
		// AAC-12
		answers.put("commitment_11_0", "no");
		answers.put("commitment_11_1", "no");
		answers.put("commitment_11_2", "yes");
		answers.put("commitment_11_3", "no");
		answers.put("commitment_11_4", "yes");
		answers.put("core_11_0", "yes");
		answers.put("achievement_11_0", "no");
		answers.put("excellence_11_0", "yes");
		// AAC-13
		answers.put("commitment_12_0", "no");
		answers.put("commitment_12_1", "yes");
		answers.put("commitment_12_2", "yes");
		answers.put("commitment_12_3", "no");
		answers.put("achievement_12_0", "no");
		answers.put("excellence_12_0", "yes");
		// AAC-14
		answers.put("commitment_13_0", "no");
		answers.put("commitment_13_1", "no");
		answers.put("commitment_13_2", "yes");
		answers.put("commitment_13_3", "no");
		answers.put("commitment_13_4", "yes");
		answers.put("commitment_13_5", "no");
		answers.put("achievement_13_0", "no");
		// add remaining here

		page.waitForSelector("input[type='radio']");

		for (Map.Entry<String, String> entry : answers.entrySet()) {
			String locator = "#" + entry.getKey() + "_" + entry.getValue();
			page.locator(locator).check();
			System.out.println("Selecting: " + locator);

			if (page.locator(locator).count() > 0) {
				page.locator(locator).check();
			} else {
				System.out.println("❌ Not found: " + locator);
			}
		}
		// page.locator("//button[normalize-space(text())='Cancel']").click();
		page.locator("//button[normalize-space(text())='Save']").click();
		page.locator("//span[normalize-space(text())='Confirm']").click();
	}

	@Test(priority = 2, enabled = false)
	public void PRE() {
		page.getByText("NABH External Certifications").click();
		page.getByText("NABH External PRE").click();

		assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("NABH External Audit - PRE")))
				.isVisible();

		Map<String, String> answers = new LinkedHashMap<>();
		// PRE-1
		answers.put("commitment_0_0", "yes");
		answers.put("core_0_0", "no");
		answers.put("core_0_1", "yes");
		answers.put("core_0_2", "yes");
		answers.put("achievement_0_0", "no");
		// PRE-2
		answers.put("commitment_1_0", "yes");
		answers.put("commitment_1_1", "no");
		answers.put("commitment_1_2", "yes");
		answers.put("commitment_1_3", "yes");
		answers.put("commitment_1_4", "no");
		answers.put("commitment_1_5", "no");
		answers.put("commitment_1_6", "yes");
		answers.put("commitment_1_7", "no");
		answers.put("commitment_1_8", "yes");
		answers.put("core_1_0", "no");
		answers.put("core_1_1", "yes");
		answers.put("achievement_1_0", "no");
		// PRE-3
		answers.put("commitment_2_0", "yes");
		answers.put("commitment_2_1", "no");
		answers.put("commitment_2_2", "no");
		answers.put("commitment_2_3", "yes");
		answers.put("core_2_0", "no");
		answers.put("achievement_2_0", "no");
		answers.put("achievement_2_1", "yes");
		// PRE-4
		answers.put("commitment_3_0", "yes");
		answers.put("commitment_3_1", "yes");
		answers.put("core_3_0", "no");
		answers.put("core_3_1", "yes");
		answers.put("core_3_2", "no");
		// PRE-5
		answers.put("commitment_4_0", "yes");
		answers.put("commitment_4_1", "yes");
		answers.put("commitment_4_2", "no");
		answers.put("commitment_4_3", "yes");
		answers.put("commitment_4_4", "no");
		answers.put("commitment_4_5", "yes");
		answers.put("commitment_4_6", "yes");
		answers.put("core_4_0", "yes");
		answers.put("achievement_4_0", "no");
		page.waitForSelector("input[type='radio']");

		for (Map.Entry<String, String> entry : answers.entrySet()) {
			String locator = "#" + entry.getKey() + "_" + entry.getValue();
			page.locator(locator).check();
			System.out.println("Selecting: " + locator);

			if (page.locator(locator).count() > 0) {
				page.locator(locator).check();
			} else {
				System.out.println("❌ Not found: " + locator);
			}
		}

		page.locator("//button[normalize-space(text())='Cancel']").click();

	}

	@Test(priority = 3, enabled = false)
	public void COM() {
		page.getByText("NABH External Certifications").click();
		page.getByText("NABH External COM").click();
		// assertThat(page.getByRole(AriaRole.HEADING, new
		// Page.GetByRoleOptions().setName("NABH External Audit - COM"))).isVisible();
		Map<String, String> answers = new LinkedHashMap<>();
		// COM-1
		answers.put("commitment_0_0", "yes");
		answers.put("commitment_0_1", "no");
		answers.put("commitment_0_2", "yes");
		answers.put("commitment_0_3", "no");
		answers.put("core_0_0", "no");
		answers.put("achievement_0_0", "yes");
		answers.put("excellence_0_0", "yes");
		answers.put("excellence_0_1", "no");
		// COM-2
		answers.put("commitment_1_0", "yes");
		answers.put("commitment_1_1", "no");
		answers.put("commitment_1_2", "yes");
		answers.put("commitment_1_3", "yes");
		answers.put("commitment_1_4", "no");
		answers.put("commitment_1_5", "yes");
		answers.put("commitment_1_6", "yes");
		answers.put("core_1_0", "no");
		answers.put("achievement_1_0", "yes");
		answers.put("achievement_1_1", "yes");
		// COM-3
		answers.put("commitment_2_0", "no");
		answers.put("commitment_2_1", "yes");
		answers.put("commitment_2_2", "yes");
		answers.put("commitment_2_3", "no");
		answers.put("commitment_2_4", "no");
		answers.put("commitment_2_5", "yes");
		answers.put("commitment_2_6", "yes");
		answers.put("commitment_2_7", "no");
		answers.put("achievement_2_0", "yes");
		// COM-4
		answers.put("commitment_3_0", "no");
		answers.put("commitment_3_1", "yes");
		answers.put("commitment_3_2", "yes");
		answers.put("commitment_3_3", "yes");
		// COM-5
		answers.put("commitment_4_0", "yes");
		answers.put("commitment_4_1", "no");
		answers.put("commitment_4_2", "yes");
		answers.put("commitment_4_3", "yes");
		answers.put("commitment_4_4", "no");
		answers.put("commitment_4_5", "yes");
		// COM-6
		answers.put("commitment_5_0", "yes");
		answers.put("commitment_5_1", "no");
		answers.put("commitment_5_2", "yes");
		answers.put("commitment_5_3", "yes");
		answers.put("commitment_5_4", "no");
		answers.put("core_5_0", "no");
		answers.put("achievement_5_0", "yes");
		answers.put("excellence_5_0", "yes");
		// COM-7
		answers.put("commitment_6_0", "yes");
		answers.put("commitment_6_1", "no");
		answers.put("commitment_6_2", "yes");
		answers.put("commitment_6_3", "no");
		answers.put("commitment_6_4", "yes");
		answers.put("commitment_6_5", "no");
		answers.put("commitment_6_6", "yes");
		answers.put("core_6_0", "no");
		// COM-8
		answers.put("commitment_7_0", "no");
		answers.put("commitment_7_1", "yes");
		answers.put("commitment_7_2", "yes");
		answers.put("commitment_7_3", "no");
		answers.put("commitment_7_4", "no");
		answers.put("core_7_0", "no");
		answers.put("achievement_7_0", "yes");
		answers.put("achievement_7_1", "yes");
		// COM-9
		answers.put("commitment_8_0", "no");
		answers.put("commitment_8_1", "yes");
		answers.put("commitment_8_2", "no");
		answers.put("commitment_8_3", "yes");
		answers.put("commitment_8_4", "no");
		answers.put("commitment_8_5", "no");
		answers.put("achievement_8_0", "yes");
		answers.put("excellence_8_0", "yes");
		// COM-10
		answers.put("commitment_9_0", "yes");
		answers.put("commitment_9_1", "no");
		answers.put("commitment_9_2", "no");
		answers.put("commitment_9_3", "yes");
		answers.put("commitment_9_4", "no");
		answers.put("commitment_9_5", "yes");
		answers.put("commitment_9_6", "no");
		// COM-11
		answers.put("commitment_10_0", "yes");
		answers.put("commitment_10_1", "no");
		answers.put("commitment_10_2", "yes");
		answers.put("commitment_10_3", "no");
		answers.put("commitment_10_4", "yes");
		answers.put("commitment_10_5", "no");
		answers.put("commitment_10_6", "yes");
		// COM-12
		answers.put("commitment_11_0", "no");
		answers.put("commitment_11_1", "no");
		answers.put("commitment_11_2", "yes");
		answers.put("commitment_11_3", "no");
		answers.put("commitment_11_4", "yes");
		answers.put("commitment_11_5", "yes");
		answers.put("commitment_11_6", "no");
		answers.put("commitment_11_7", "yes");
		// COM-13
		answers.put("commitment_12_0", "no");
		answers.put("commitment_12_1", "yes");
		answers.put("commitment_12_2", "yes");
		answers.put("commitment_12_3", "no");
		answers.put("commitment_12_4", "yes");
		answers.put("commitment_12_5", "yes");
		answers.put("commitment_12_6", "no");
		answers.put("core_12_0", "no");
		answers.put("core_12_1", "no");
		answers.put("achievement_12_0", "yes");
		// COM-14
		answers.put("commitment_13_0", "no");
		answers.put("commitment_13_1", "no");
		answers.put("commitment_13_2", "yes");
		answers.put("commitment_13_3", "no");
		answers.put("commitment_13_4", "yes");
		answers.put("commitment_13_5", "no");
		answers.put("commitment_13_6", "no");
		answers.put("core_13_0", "no");
		answers.put("achievement_13_0", "yes");
		answers.put("achievement_13_1", "yes");
		// COM-15
		answers.put("commitment_14_0", "no");
		answers.put("commitment_14_1", "no");
		answers.put("core_14_0", "no");
		answers.put("core_14_1", "yes");
		// COM-16
		answers.put("commitment_15_0", "no");
		answers.put("commitment_15_1", "no");
		answers.put("commitment_15_2", "yes");
		answers.put("core_15_0", "no");
		answers.put("core_15_1", "yes");
		answers.put("core_15_2", "yes");
		// COM-17
		answers.put("commitment_16_0", "no");
		answers.put("commitment_16_1", "no");
		answers.put("commitment_16_2", "yes");
		answers.put("commitment_16_3", "no");
		// COM-18
		answers.put("commitment_17_0", "no");
		answers.put("commitment_17_1", "no");
		answers.put("commitment_17_2", "yes");
		answers.put("commitment_17_3", "no");
		answers.put("commitment_17_4", "yes");
		answers.put("commitment_17_5", "no");
		answers.put("excellence_17_0", "yes");
		// COM-19
		answers.put("commitment_18_0", "no");
		answers.put("commitment_18_1", "no");
		answers.put("commitment_18_2", "yes");
		answers.put("commitment_18_3", "no");
		answers.put("commitment_18_4", "yes");
		// COM-20
		answers.put("commitment_19_0", "no");
		answers.put("commitment_19_1", "no");
		answers.put("commitment_19_2", "yes");
		answers.put("commitment_19_3", "no");
		answers.put("achievement_19_0", "yes");
		page.waitForSelector("input[type='radio']");

		for (Map.Entry<String, String> entry : answers.entrySet()) {
			String locator = "#" + entry.getKey() + "_" + entry.getValue();
			page.locator(locator).check();
			System.out.println("Selecting: " + locator);

			if (page.locator(locator).count() > 0) {
				page.locator(locator).check();
			} else {
				System.out.println("❌ Not found: " + locator);
			}
		}

		page.locator("//button[normalize-space(text())='Cancel']").click();

	}

	@Test(priority = 4, enabled = false)
	public void FMS() {
		page.getByText("NABH External Certifications").click();
		page.locator("//a[normalize-space(text())='NABH External FMS']").click();
		/*
		 * assertThat(page.getByRole(AriaRole.HEADING, new
		 * Page.GetByRoleOptions().setName("NABH External Audit - FMS"))) .isVisible();
		 */

		Map<String, String> answers = new LinkedHashMap<>();
		// FMS-1
		answers.put("commitment_0_0", "yes");
		answers.put("commitment_0_1", "no");
		answers.put("core_0_0", "no");
		answers.put("core_0_1", "no");
		answers.put("excellence_0_0", "yes");
		// FMS-2
		answers.put("commitment_1_0", "yes");
		answers.put("commitment_1_1", "no");
		answers.put("commitment_1_2", "yes");
		answers.put("commitment_1_3", "yes");
		answers.put("core_1_0", "no");
		answers.put("core_1_1", "no");
		answers.put("excellence_1_0", "yes");
		// FMS-3
		answers.put("commitment_2_0", "no");
		answers.put("commitment_2_1", "yes");
		answers.put("commitment_2_2", "yes");
		answers.put("core_2_0", "no");
		answers.put("achievement_2_0", "yes");
		// FMS-4
		answers.put("commitment_3_0", "no");
		answers.put("commitment_3_1", "yes");
		answers.put("commitment_3_2", "yes");
		answers.put("commitment_3_3", "yes");
		answers.put("commitment_3_4", "yes");
		answers.put("commitment_3_5", "yes");
		answers.put("core_3_0", "no");
		answers.put("achievement_3_0", "yes");
		// FMS-5
		answers.put("commitment_4_0", "yes");
		answers.put("commitment_4_1", "no");
		answers.put("commitment_4_2", "yes");
		answers.put("commitment_4_3", "yes");
		answers.put("commitment_4_4", "no");
		answers.put("commitment_4_5", "yes");
		answers.put("core_4_0", "no");
		answers.put("achievement_4_0", "yes");
		// FMS-6
		answers.put("commitment_5_0", "yes");
		answers.put("commitment_5_1", "no");
		answers.put("commitment_5_2", "yes");
		answers.put("commitment_5_3", "yes");
		answers.put("core_5_0", "no");
		answers.put("core_5_1", "no");
		// FMS-7
		answers.put("commitment_6_0", "yes");
		answers.put("commitment_6_1", "no");
		answers.put("commitment_6_2", "yes");
		answers.put("core_6_0", "no");
		answers.put("achievement_6_0", "yes");
		page.waitForSelector("input[type='radio']");

		for (Map.Entry<String, String> entry : answers.entrySet()) {
			String locator = "#" + entry.getKey() + "_" + entry.getValue();
			page.locator(locator).check();
			System.out.println("Selecting: " + locator);

			if (page.locator(locator).count() > 0) {
				page.locator(locator).check();
			} else {
				System.out.println("❌ Not found: " + locator);
			}
		}

		page.locator("//button[normalize-space(text())='Cancel']").click();

	}
}
