package com.Tests;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Base.TestLisener;
import com.pages.Self_Assessment_Page;

@Listeners(TestLisener.class)

public class Self_Assesments_T extends BaseTest {
	@Test(priority = 1, enabled = false)
	public void OT_Test() {

		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("OT Audit Check List").dblclick();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
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

		saPage.fillRadioAnswers(radioActions);
		saPage.Save();
	}

	@Test(priority = 2, enabled = false)
	public void PhamAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Pharmacy Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
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

		saPage.fillRadioAnswers(radioActions);
		saPage.Save();
	}

	@Test(priority = 3, enabled = false)
	public void EdAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Emergency Department Audit").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
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
		saPage.fillRadioAnswers(radioActions);
		saPage.Save();
	}

	@Test(priority = 4, enabled = false)
	public void NICUAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("NICU Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A.
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
		// B.
		radioActions.put("radio-group-24-01", 1);
		radioActions.put("radio-group-25-02", 0);
		radioActions.put("radio-group-26-03", 1);
		radioActions.put("radio-group-27-04", 2);
		radioActions.put("radio-group-28-05", 0);
		radioActions.put("radio-group-29-06", 1);
		radioActions.put("radio-group-30-07", 0);
		radioActions.put("radio-group-31-08", 1);
		radioActions.put("radio-group-32-09", 0);
		radioActions.put("radio-group-33-10", 1);

		saPage.fillRadioAnswers(radioActions);
		saPage.Save();

	}

	@Test(priority = 5, enabled = false)
	public void CSSIDAudit_Tes() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("CSSD Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A.Infrastucuture
		radioActions.put("radio-group-0-01", 0);
		radioActions.put("radio-group-1-02", 1);
		radioActions.put("radio-group-2-03", 2);
		radioActions.put("radio-group-3-04", 1);
		radioActions.put("radio-group-4-04.1", 1);
		radioActions.put("radio-group-5-04.2", 0);
		radioActions.put("radio-group-6-04.3", 2);
		radioActions.put("radio-group-7-04.4", 0);
		radioActions.put("radio-group-8-05", 0);
		radioActions.put("radio-group-9-06", 1);
		radioActions.put("radio-group-10-07", 2);
		radioActions.put("radio-group-11-08", 0);
		radioActions.put("radio-group-12-09", 1);
		radioActions.put("radio-group-13-10", 2);
		radioActions.put("radio-group-14-11", 1);
		// B.Process
		radioActions.put("radio-group-15-01", 2);
		radioActions.put("radio-group-16-01.1", 1);
		radioActions.put("radio-group-17-01.2", 0);
		radioActions.put("radio-group-18-01.3", 2);
		radioActions.put("radio-group-19-01.4", 0);
		radioActions.put("radio-group-20-01.5", 1);
		radioActions.put("radio-group-21-01.6", 2);
		radioActions.put("radio-group-22-02", 1);
		radioActions.put("radio-group-23-02.1", 0);
		radioActions.put("radio-group-24-02.2", 1);
		radioActions.put("radio-group-25-02.3", 0);
		radioActions.put("radio-group-26-02.4", 1);
		radioActions.put("radio-group-27-03", 2);
		radioActions.put("radio-group-28-04", 0);
		radioActions.put("radio-group-29-05", 1);
		radioActions.put("radio-group-30-05.1", 2);
		radioActions.put("radio-group-31-05.2", 1);
		radioActions.put("radio-group-32-05.3", 0);
		radioActions.put("radio-group-33-05.4", 2);
		radioActions.put("radio-group-34-06", 1);
		radioActions.put("radio-group-35-06.1", 0);
		radioActions.put("radio-group-36-06.2", 2);
		radioActions.put("radio-group-37-06.3", 0);
		radioActions.put("radio-group-38-06.4", 0);
		radioActions.put("radio-group-39-07", 1);
		radioActions.put("radio-group-40-07.1", 2);
		radioActions.put("radio-group-41-07.2", 0);
		radioActions.put("radio-group-42-08", 1);
		radioActions.put("radio-group-43-09", 0);
		radioActions.put("radio-group-44-10", 2);
		radioActions.put("radio-group-45-11", 2);
		// C.Staff Knowledge
		radioActions.put("radio-group-46-01", 2);
		radioActions.put("radio-group-47-02", 0);
		radioActions.put("radio-group-48-03", 1);
		radioActions.put("radio-group-49-04", 0);
		radioActions.put("radio-group-50-05", 1);
		radioActions.put("radio-group-51-06", 2);
		radioActions.put("radio-group-52-07", 2);
		radioActions.put("radio-group-53-08", 0);
		radioActions.put("radio-group-54-09", 1);
		radioActions.put("radio-group-55-10", 2);
		radioActions.put("radio-group-56-11", 1);
		radioActions.put("radio-group-57-11.1", 0);
		radioActions.put("radio-group-58-11.2", 0);
		radioActions.put("radio-group-59-11.3", 2);
		radioActions.put("radio-group-60-11.4", 1);
		radioActions.put("radio-group-61-11.5", 0);

		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();

	}

	@Test(priority = 6, enabled = false)
	public void ICAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Infection Control Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A. Facility and Infrastructure for Infection Control
		radioActions.put("radio-group-0-01", 0);
		radioActions.put("radio-group-1-02", 1);
		radioActions.put("radio-group-2-03", 1);
		radioActions.put("radio-group-3-04", 2);
		radioActions.put("radio-group-4-05", 1);
		radioActions.put("radio-group-5-06", 0);
		radioActions.put("radio-group-6-07", 1);
		// B. Organization for Infection Control
		radioActions.put("radio-group-7-01", 2);
		radioActions.put("radio-group-8-02", 0);
		radioActions.put("radio-group-9-03", 1);
		radioActions.put("radio-group-10-04", 2);
		// C. Policies, Processes, Practices and Implementation
		radioActions.put("radio-group-11-01", 0);
		radioActions.put("radio-group-12-02", 1);
		radioActions.put("radio-group-13-03", 0);
		radioActions.put("radio-group-14-04", 1);
		radioActions.put("radio-group-15-05", 2);
		radioActions.put("radio-group-16-06", 0);
		radioActions.put("radio-group-17-07", 1);
		radioActions.put("radio-group-18-08", 0);
		radioActions.put("radio-group-19-09", 1);
		radioActions.put("radio-group-20-10", 2);
		radioActions.put("radio-group-21-11", 0);
		radioActions.put("radio-group-22-12", 1);
		radioActions.put("radio-group-23-13", 0);
		radioActions.put("radio-group-24-14", 1);
		radioActions.put("radio-group-25-15", 0);
		radioActions.put("radio-group-26-16", 1);
		radioActions.put("radio-group-27-17", 2);
		radioActions.put("radio-group-28-18", 0);
		radioActions.put("radio-group-29-19", 1);
		radioActions.put("radio-group-30-20", 0);
		radioActions.put("radio-group-31-21", 1);
		radioActions.put("radio-group-32-22", 0);
		radioActions.put("radio-group-33-23", 1);
		// D. Quality Indicators
		radioActions.put("radio-group-34-01", 2);
		radioActions.put("radio-group-35-02", 0);
		radioActions.put("radio-group-36-03", 1);
		radioActions.put("radio-group-37-04", 0);
		radioActions.put("radio-group-38-05", 1);
		radioActions.put("radio-group-39-06", 0);
		radioActions.put("radio-group-40-07", 1);
		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();
	}

	@Test(priority = 7, enabled = false)
	public void MRAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Medical Record Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		//
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
		radioActions.put("radio-group-13-13.1", 1);
		radioActions.put("radio-group-14-13.2", 2);
		radioActions.put("radio-group-15-13.3", 0);
		radioActions.put("radio-group-16-13.4", 1);
		radioActions.put("radio-group-17-13.5", 2);
		radioActions.put("radio-group-18-14", 0);
		radioActions.put("radio-group-19-14.1", 1);
		radioActions.put("radio-group-20-14.2", 2);
		radioActions.put("radio-group-21-14.3", 0);
		radioActions.put("radio-group-22-14.4", 1);
		radioActions.put("radio-group-23-14.5", 0);
		radioActions.put("radio-group-24-14.6", 1);
		radioActions.put("radio-group-25-14.7", 0);
		radioActions.put("radio-group-26-14.8", 1);
		radioActions.put("radio-group-27-14.9", 2);
		radioActions.put("radio-group-28-14.10", 0);
		radioActions.put("radio-group-29-14.11", 1);
		radioActions.put("radio-group-30-14.12", 0);
		radioActions.put("radio-group-31-14.13", 1);
		radioActions.put("radio-group-32-14.14", 0);
		radioActions.put("radio-group-33-15", 1);
		radioActions.put("radio-group-34-15.1", 2);
		radioActions.put("radio-group-35-15.2", 0);
		radioActions.put("radio-group-36-15.3", 1);
		radioActions.put("radio-group-37-15.4", 0);
		radioActions.put("radio-group-38-15.5", 2);
		radioActions.put("radio-group-39-15.6", 1);
		radioActions.put("radio-group-40-16", 0);
		radioActions.put("radio-group-41-16.1", 1);
		radioActions.put("radio-group-42-16.2", 0);
		radioActions.put("radio-group-43-16.3", 1);
		radioActions.put("radio-group-44-16.4", 2);
		radioActions.put("radio-group-45-16.5", 0);
		radioActions.put("radio-group-46-16.6", 1);
		radioActions.put("radio-group-47-16.7", 0);
		radioActions.put("radio-group-48-16.8", 2);
		radioActions.put("radio-group-49-17", 2);

		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();
	}

	@Test(priority = 8, enabled = false)
	public void HRAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Human Resource Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
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
		radioActions.put("radio-group-23-23.1", 0);
		radioActions.put("radio-group-24-23.2", 1);
		radioActions.put("radio-group-25-23.3", 0);
		radioActions.put("radio-group-26-23.4", 1);
		radioActions.put("radio-group-27-23.5", 2);
		radioActions.put("radio-group-28-24", 0);
		radioActions.put("radio-group-29-25", 1);
		radioActions.put("radio-group-30-26", 0);
		radioActions.put("radio-group-31-27", 2);
		radioActions.put("radio-group-32-27.1", 0);
		radioActions.put("radio-group-33-27.2", 1);
		radioActions.put("radio-group-34-27.3", 2);
		radioActions.put("radio-group-35-27.4", 1);

		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();

	}

	@Test(priority = 9, enabled = false)
	public void DSAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Dieatary service Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
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

		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();
	}

	@Test(priority = 10, enabled = false)
	public void IWAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Inpatient Wards Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		// A. Physical facilities
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
		// B. Staffing
		radioActions.put("radio-group-11-01", 0);
		radioActions.put("radio-group-12-02", 1);
		radioActions.put("radio-group-13-03", 0);
		radioActions.put("radio-group-14-04", 1);
		// C. Ward management
		radioActions.put("radio-group-15-01", 2);
		radioActions.put("radio-group-16-02", 0);
		radioActions.put("radio-group-17-03", 1);
		radioActions.put("radio-group-18-04", 0);
		radioActions.put("radio-group-19-05", 1);
		radioActions.put("radio-group-20-06", 2);
		radioActions.put("radio-group-21-07", 0);
		radioActions.put("radio-group-22-08", 1);
		radioActions.put("radio-group-23-09", 0);
		radioActions.put("radio-group-24-10", 1);
		radioActions.put("radio-group-25-11", 0);
		radioActions.put("radio-group-26-12", 1);
		radioActions.put("radio-group-27-13", 2);
		radioActions.put("radio-group-28-14", 0);
		radioActions.put("radio-group-29-15", 1);
		radioActions.put("radio-group-30-16", 0);
		// D. Staff awareness
		radioActions.put("radio-group-31-01", 1);
		radioActions.put("radio-group-32-02", 0);
		radioActions.put("radio-group-33-03", 1);
		radioActions.put("radio-group-34-04", 2);
		radioActions.put("radio-group-35-05", 0);
		radioActions.put("radio-group-36-06", 1);
		radioActions.put("radio-group-37-07", 0);
		radioActions.put("radio-group-38-08", 1);
		radioActions.put("radio-group-39-09", 1);
		radioActions.put("radio-group-40-10", 0);
		radioActions.put("radio-group-41-11", 1);
		radioActions.put("radio-group-42-12", 2);
		radioActions.put("radio-group-43-13", 0);
		radioActions.put("radio-group-44-14", 1);
		radioActions.put("radio-group-45-15", 0);
		radioActions.put("radio-group-46-16", 1);

		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();
		Assert.assertTrue(saPage.areAllCheckboxesUnchecked(), "Some checkboxes are still selected");

	}

	@Test(priority = 11)
	public void BHAudit_Test() {
		Self_Assessment_Page saPage = new Self_Assessment_Page(page);

		// Step 1: Navigation
		saPage.navigateToSelfAssessment();
		page.getByText("Bio Hazard Audit Check List").click();

		// Step 2: Fill details
		saPage.fillBasicDetails("Harini", "Department-1");

		// Step 3: Select Date
		saPage.selectDate("March 10");

		// Step 4: Radio Actions (your data)
		Map<String, Integer> radioActions = new LinkedHashMap<>();
		radioActions.put("radio-group-0-01", 2);
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
		
		saPage.fillRadioAnswers(radioActions);
		saPage.cancel();
		Assert.assertTrue(saPage.areAllCheckboxesUnchecked(), "Some checkboxes are still selected");

	}
}
