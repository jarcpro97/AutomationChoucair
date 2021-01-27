package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;
import starter.commonTasks.WriteEditContent;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditPostStepDefinitions {

    @When("he decides to edit the post")
    public void he_decides_to_edit_the_post() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.POSTS),
                MoveMouse.to(PagesPage.PAGE_TABLE),
                Click.on(PagesPage.EDIT_OPTION),
                WaitUntil.angularRequestsHaveFinished(),
                Hit.the(Keys.ESCAPE).into(PagesPage.TITLE_FIELD),
                WriteEditContent.put()
        );
    }
}
