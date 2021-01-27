package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;
import starter.commonTasks.WriteEditContent;
import starter.global.Parameters;
import starter.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class QuickEditPageStepDefinitions {

    @When("he decides to Quick edit the page")
    public void he_decides_to_Quick_edit_the_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.PAGES),
                MoveMouse.to(PagesPage.PAGE_TABLE),
                Click.on(PagesPage.QUICK_EDIT.QUICK_EDIT_TABLE),
                WaitUntil.angularRequestsHaveFinished()
        );
    }

    @When("update de content in the fields")
    public void update_de_content_in_the_fields() {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(Parameters.PAGE_EDIT).into(PagesPage.QUICK_EDIT.TITLE_QUICK_EDIT),
                Enter.theValue("-"+Parameters.PAGE_EDIT).into(PagesPage.QUICK_EDIT.SLUG_QUICK_EDIT),
                Click.on(PagesPage.QUICK_EDIT.UPDATE_QUICK_EDIT),
                WaitUntil.angularRequestsHaveFinished(),
                MoveMouse.to(PagesPage.PAGE_QUICK_EDITED_TABLE),
                Click.on(PagesPage.QUICK_EDIT.QUICK_SECOND_EDIT_TABLE)
        );
    }

    @Then("the (.*) should be Quick edited")
    public void the_page_should_be_Quick_edited(String val) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(PagesPage.QUICK_EDIT.TITLE_QUICK_EDIT),
                        WebElementStateMatchers.hasValue(Parameters.TITLE_PAGE+Parameters.PAGE_EDIT+Parameters.PAGE_EDIT)),
                seeThat(WebElementQuestion.the(PagesPage.QUICK_EDIT.SLUG_QUICK_EDIT),
                        WebElementStateMatchers.hasValue("prueba-nueva-editado"))
        );
    }
}
