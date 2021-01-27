package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.NavigationMenu;
import starter.UI.PagesPage;
import starter.global.Parameters;
import starter.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddNewPostStepDefinitions {


    @Given("add new post")
    public void add_new_post() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NavigationMenu.POSTS),
                Click.on(PagesPage.ADD_NEW_BUTTON),
                WaitUntil.angularRequestsHaveFinished(),
                Hit.the(Keys.ESCAPE).into(PagesPage.TITLE_FIELD)
        );
    }


}
