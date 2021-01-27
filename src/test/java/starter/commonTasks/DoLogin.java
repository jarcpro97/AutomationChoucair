package starter.commonTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.UI.LoginPage;
import starter.global.Parameters;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DoLogin implements Task {

    public DoLogin() {
    }

    public static Performable Login (){
        return instrumented(DoLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Parameters.USERNAME).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(Parameters.PASSWORD).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.angularRequestsHaveFinished()
        );

    }
}
