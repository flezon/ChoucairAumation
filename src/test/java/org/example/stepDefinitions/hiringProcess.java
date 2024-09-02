package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.example.tasks.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.example.ui.RecruitmentPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class hiringProcess {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor actor = Actor.named("The user");
    private String candidateFullName;
    private String candidateEmail;

    @Given("^the user is on the login page$")
    public void theUserIsOnTheLoginPage() {
        actor.can(BrowseTheWeb.with(hisBrowser));
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @When("^the user logs in with valid credentials$")
    public void theUserLogsInWithValidCredentials() {
        actor.attemptsTo(Login.withCredentials("admin", "admin123"));
    }

    @When("^navigates to the Recruitment page$")
    public void navigatesToTheRecruitmentPage() {
        // This step is already included in the RecruitmentProcess task
    }

    @When("adds a new candidate with the following details:")
    public void theUserAddsANewCandidateWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        java.util.List<java.util.Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        java.util.Map<String, String> candidateDetails = data.get(0);

        actor.attemptsTo(
                AddCandidate.withDetails(
                        candidateDetails.get("Full Name"),
                        candidateDetails.get("Middle Name"),
                        candidateDetails.get("Last Name"),
                        candidateDetails.get("Email"),
                        candidateDetails.get("Vacancy")
                )
        );
    }
    /*@When("^adds a new candidate with the following details:$")
      public void addsANewCandidateWithTheFollowingDetails(List<Map<String, String>> candidateDetails) {
          Map<String, String> candidate = candidateDetails.get(0);
          candidateFullName = candidate.get("Full Name") + " " + candidate.get("Middle Name") + " " + candidate.get("Last Name");
          candidateEmail = candidate.get("Email");

          actor.attemptsTo(
                  RecruitmentProcess.complete(
                          candidate.get("Full Name"),
                          candidate.get("Middle Name"),
                          candidate.get("Last Name"),
                          candidateEmail,
                          candidate.get("Vacancy"),
                          "Prueba",
                          "a",
                          "2024-04-09"
                  )
          );
      }*/

    @When("the user completes the hiring process with the following details:")
    public void theUserCompletesTheHiringProcessWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        java.util.List<java.util.Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        java.util.Map<String, String> interviewDetails = data.get(0);

        actor.attemptsTo(
                CompleteHiringProcess.withDetails(
                        interviewDetails.get("Interview Title"),
                        interviewDetails.get("Interviewer"),
                        interviewDetails.get("Date")
                )
        );
    }

    @Then("the user should see the new employee in the Recruitment page")
    public void theUserShouldSeeTheNewEmployeeInTheRecruitmentPage() {
        actor.attemptsTo(
                Ensure.that(RecruitmentPage.EMPLOYEE_LIST).isDisplayed(),
                Ensure.that(RecruitmentPage.EMPLOYEE_LIST).hasText(("Jaime Pardo Pardo"))
        );
    }

    @Then("the user takes a screenshot of the Recruitment page")
    public void theUserTakesAScreenshotOfTheRecruitmentPage() {
        actor.attemptsTo(
                TakeScreenshot.of(RecruitmentPage.EMPLOYEE_LIST).andSaveIt()
        );
    }

}