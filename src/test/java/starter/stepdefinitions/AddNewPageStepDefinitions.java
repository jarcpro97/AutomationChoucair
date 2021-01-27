package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;
import starter.commonTasks.SaveNewContent;
import starter.commonTasks.WriteNewContent;
import starter.global.Parameters;
import starter.questions.Text;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class AddNewPageStepDefinitions {

    @Given("add new page")
    public void add_new_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.PAGES),
                Click.on(PagesPage.ADD_NEW_BUTTON),
                WaitUntil.angularRequestsHaveFinished(),
                Hit.the(Keys.ESCAPE).into(PagesPage.TITLE_FIELD)
        );
    }
    @When("he write the content")
    public void he_write_the_content() {
        theActorInTheSpotlight().attemptsTo(
                WriteNewContent.put()
                );
    }

    @When("save the page")
    public void save_the_page() {
        theActorInTheSpotlight().attemptsTo(
                SaveNewContent.save()
                );
    }

    @Then("the (.*) should be created")
    public void the_page_should_be_created(String val) {
        theActorInTheSpotlight().should(
                seeThat("Title "+val,Text.description(PagesPage.TITLE_PAGE),equalTo(Parameters.TITLE_PAGE)),
                seeThat("Paragraph "+val,Text.description(PagesPage.PARAGRAPH_PAGE),equalTo(Parameters.PARAGRAPH_PAGE))
        );
    }

}
