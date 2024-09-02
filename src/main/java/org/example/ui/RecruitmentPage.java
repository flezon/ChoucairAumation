package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {
    public static final Target RECRUITMENT_BUTTON = Target.the("Recruitment button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));

    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

    public static final Target FULL_NAME_FIELD = Target.the("Full name field")
            .located(By.name("firstName"));

    public static final Target MIDDLE_NAME_FIELD = Target.the("Middle name field")
            .located(By.name("middleName"));

    public static final Target LAST_NAME_FIELD = Target.the("Last name field")
            .located(By.name("lastName"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));

    public static final Target VACANCY_DROPDOWN1 = Target.the("Vacancy dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i"));
    public static final Target VACANCY_DROPDOWN = Target.the("Vacancy dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div[3]"));

    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));

    public static final Target SHORTLIST_BUTTON = Target.the("Shortlist button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));

    public static final Target SAVE_BUTTON2 = Target.the("Save button2")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Schedule Interview button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));

    public static final Target SAVE_BUTTON3 = Target.the("Save button3")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target INTERVIEW_TITLE_FIELD = Target.the("Interview Title field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));

    public static final Target INTERVIEWER_FIELD = Target.the("Interviewer field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"));

    public static final Target INTERVIEWER_FIELD1 = Target.the("Interviewer field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]"));

    public static final Target DATE_FIELD = Target.the("Date field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input"));

    public static final Target SAVE_BUTTON4 = Target.the("Save button4")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target MARK_INTERVIEW_PASSED_BUTTON = Target.the("Mark Interview Passed button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target SAVE_BUTTON5 = Target.the("Save button5")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target OFFER_JOB_BUTTON = Target.the("Offer Job button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target SAVE_BUTTON6 = Target.the("Save button6")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target HIRE_BUTTON = Target.the("Hire button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));

    public static final Target SAVE_BUTTON7 = Target.the("Save button7")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target EMPLOYEE_LIST = Target.the("Employee List")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]"));

}