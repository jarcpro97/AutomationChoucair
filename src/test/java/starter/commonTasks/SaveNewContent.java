package starter.commonTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.UI.PagesPage;
import starter.global.Parameters;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveNewContent implements Task {

    public SaveNewContent() {
    }

    public static Performable save (){
        return instrumented(SaveNewContent.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PagesPage.PUBLISH_BUTTON),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(PagesPage.CONFIRM_PUBLISH_BUTTON),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(PagesPage.VIEW_PAGE_BUTTON),
                WaitUntil.angularRequestsHaveFinished()
        );

    }
}
