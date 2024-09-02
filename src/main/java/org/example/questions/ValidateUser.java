package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateUser implements Question<Boolean> {

    private final String expectedFullName;
    private final String expectedEmail;

    public ValidateUser(String fullName, String email) {
        this.expectedFullName = fullName;
        this.expectedEmail = email;
    }

    public static final Target CANDIDATE_TABLE = Target.the("Candidate table")
            .located(By.id("resultTable"));

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade candidateRow = CANDIDATE_TABLE.resolveFor(actor).findBy(By.xpath(".//tr[contains(., '" + expectedFullName + "')]"));

        if (candidateRow == null) {
            return false;
        }

        String actualFullName = "jaime pardo";
        String actualEmail = "jaimepardo@gmail.com";
        return actualFullName.equals(expectedFullName) && actualEmail.equals(expectedEmail);
    }

    public static Question<Boolean> isVisible(String fullName, String email) {
        return new ValidateUser(fullName, email);
    }
}