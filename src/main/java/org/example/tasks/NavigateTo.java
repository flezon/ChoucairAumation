package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    private final String url;

    public NavigateTo(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} navigates to #url")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static NavigateTo theLoginPage() {
        return instrumented(NavigateTo.class, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}