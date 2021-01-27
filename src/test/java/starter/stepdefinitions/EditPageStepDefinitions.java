package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;
import starter.commonTasks.WriteEditContent;
import starter.commonTasks.WriteNewContent;
import starter.global.Parameters;
import starter.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class EditPageStepDefinitions {


    @When("he decides to edit the page")
    public void he_decides_to_edit_the_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.PAGES),
                MoveMouse.to(PagesPage.PAGE_TABLE),
                Click.on(PagesPage.EDIT_OPTION),
                WaitUntil.angularRequestsHaveFinished(),
                Hit.the(Keys.ESCAPE).into(PagesPage.TITLE_FIELD),
                WriteEditContent.put()
        );
    }

    @When("update the content")
    public void update_de_content() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(PagesPage.UPDATE_BUTTON),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(PagesPage.VIEW_PAGE_LINK),
                WaitUntil.angularRequestsHaveFinished()
                );
    }

    @Then("the (.*) should be edited")
    public void the_page_should_be_edited(String val) {
        theActorInTheSpotlight().should(
                seeThat("Title edit "+val, Text.description(PagesPage.TITLE_PAGE),equalTo(Parameters.TITLE_PAGE+Parameters.PAGE_EDIT)),
                seeThat("Paragraph edit "+val,Text.description(PagesPage.PARAGRAPH_PAGE),equalTo(Parameters.PARAGRAPH_PAGE+Parameters.PAGE_EDIT))
        );
    }
}
