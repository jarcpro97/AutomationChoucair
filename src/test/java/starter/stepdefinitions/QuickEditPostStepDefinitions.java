package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class QuickEditPostStepDefinitions {

    @When("he decides to Quick edit the post")
    public void he_decides_to_Quick_edit_the_post() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.POSTS),
                MoveMouse.to(PagesPage.PAGE_TABLE),
                Click.on(PagesPage.QUICK_EDIT.QUICK_EDIT_TABLE),
                WaitUntil.angularRequestsHaveFinished()
        );
    }
}
