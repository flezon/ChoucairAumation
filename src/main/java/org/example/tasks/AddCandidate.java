package org.example.tasks;


import org.example.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCandidate implements Task {

    private final String fullName;
    private final String middleName;
    private final String lastName;
    private final String email;
    private final String vacancy;

    public AddCandidate(String fullName, String middleName, String lastName, String email, String vacancy) {
        this.fullName = fullName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.vacancy = vacancy;
    }

    @Override
    @Step("{0} adds a new candidate")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentPage.RECRUITMENT_BUTTON),
                Click.on(RecruitmentPage.ADD_BUTTON),
                Enter.theValue(fullName).into(RecruitmentPage.FULL_NAME_FIELD),
                Enter.theValue(middleName).into(RecruitmentPage.MIDDLE_NAME_FIELD),
                Enter.theValue(lastName).into(RecruitmentPage.LAST_NAME_FIELD),
                Enter.theValue(email).into(RecruitmentPage.EMAIL_FIELD),
                Click.on(RecruitmentPage.VACANCY_DROPDOWN1),
                Click.on(RecruitmentPage.VACANCY_DROPDOWN),
                Click.on(RecruitmentPage.SAVE_BUTTON)
        );
    }

    public static AddCandidate withDetails(String fullName, String middleName, String lastName, String email, String vacancy) {
        return instrumented(AddCandidate.class, fullName, middleName, lastName, email, vacancy);
    }
}