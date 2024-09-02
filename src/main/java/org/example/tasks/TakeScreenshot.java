package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TakeScreenshot implements Task {

    private final Target target;

    public TakeScreenshot(Target target) {
        this.target = target;
    }

    @Override
    @Step("{0} takes a screenshot")
    public <T extends Actor> void performAs(T actor) {
        TakesScreenshot camera = (TakesScreenshot) BrowseTheWeb.as(actor).getDriver();
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String filename = "screenshot_" + timestamp + ".png";
        Path destinationPath = Paths.get("target", "screenshots", filename);

        try {
            Files.createDirectories(destinationPath.getParent());
            Files.copy(screenshot.toPath(), destinationPath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save screenshot", e);
        }
    }

    public static TakeScreenshot of(Target target) {
        return instrumented(TakeScreenshot.class, target);
    }

    public TakeScreenshot andSaveIt() {
        return this;
    }
}