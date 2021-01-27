package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import starter.commonTasks.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStepDefinitions {

    @Given("(.*) login the system")
    public void actor_login_the_system(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.OpenSourceCmsLoginPage(),
                DoLogin.Login());
    }
}
