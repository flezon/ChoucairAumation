package org.example.tasks;

import org.example.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteHiringProcess implements Task {

    private final String interviewTitle;
    private final String interviewer;
    private final String interviewDate;

    public CompleteHiringProcess(String interviewTitle, String interviewer, String interviewDate) {
        this.interviewTitle = interviewTitle;
        this.interviewer = interviewer;
        this.interviewDate = interviewDate;
    }

    @Override
    @Step("{0} completes the hiring process")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentPage.SHORTLIST_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON2),
                Click.on(RecruitmentPage.SCHEDULE_INTERVIEW_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON3),
                Enter.theValue(interviewTitle).into(RecruitmentPage.INTERVIEW_TITLE_FIELD),
                Enter.theValue(interviewer).into(RecruitmentPage.INTERVIEWER_FIELD),
                Click.on(RecruitmentPage.INTERVIEWER_FIELD1),
                Enter.theValue(interviewDate).into(RecruitmentPage.DATE_FIELD),
                Click.on(RecruitmentPage.SAVE_BUTTON4),
                Click.on(RecruitmentPage.MARK_INTERVIEW_PASSED_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON5),
                Click.on(RecruitmentPage.OFFER_JOB_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON6),
                Click.on(RecruitmentPage.HIRE_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON7),
                Click.on(RecruitmentPage.RECRUITMENT_BUTTON)
        );
    }

    public static CompleteHiringProcess withDetails(String interviewTitle, String interviewer, String interviewDate) {
        return instrumented(CompleteHiringProcess.class, interviewTitle, interviewer, interviewDate);
    }
}