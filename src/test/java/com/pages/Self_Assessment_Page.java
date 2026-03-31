package com.pages;

import java.util.Map;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Self_Assessment_Page {
	private Page page;

	// Constructor
	public Self_Assessment_Page(Page page) {
		this.page = page;
	}

	public void navigateToSelfAssessment() {
		page.getByText("NABH Self Assessments").click();
	}

	public void fillBasicDetails(String name, String location) {
		page.getByRole(com.microsoft.playwright.options.AriaRole.TEXTBOX,
				new Page.GetByRoleOptions().setName("Person Name")).fill(name);

		page.getByRole(com.microsoft.playwright.options.AriaRole.COMBOBOX,
				new Page.GetByRoleOptions().setName("Select Location")).click();

		page.getByRole(com.microsoft.playwright.options.AriaRole.OPTION, new Page.GetByRoleOptions().setName(location))
				.click();
	}

	public void selectDate(String date) {
		page.getByRole(com.microsoft.playwright.options.AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Open calendar")).click();

		page.getByRole(com.microsoft.playwright.options.AriaRole.BUTTON, new Page.GetByRoleOptions().setName(date))
				.click();
	}

	public void fillRadioAnswers(Map<String, Integer> radioActions) {
		for (Map.Entry<String, Integer> entry : radioActions.entrySet()) {

			String name = entry.getKey();
			int index = entry.getValue();

			page.locator("input[name='" + name + "']").nth(index).check();
		}
	}

	public void Save() {
		page.locator("//button[normalize-space(text())='Save']").click();
		page.locator("(//span[text()=' Confirm ']/following-sibling::span)[2]").click();
	}

	public void cancel() {
		page.locator("//button[normalize-space(text())='Cancel']").click();
	}
	public boolean areAllCheckboxesUnchecked() {
	    Locator checkboxes = page.locator("input[type='radio']");

	    for (int i = 0; i < checkboxes.count(); i++) {
	        if (checkboxes.nth(i).isChecked()) {
	            return false;
	        }
	    }
	    return true;
	}

	public void Search() {
		page.locator(".fa-regular").first().click();
		page.locator("#mat-input-0").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("March 18,")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
	}

}
