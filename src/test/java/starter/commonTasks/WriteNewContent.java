package starter.commonTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import starter.UI.PagesPage;
import starter.global.Parameters;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteNewContent implements Task {

    public WriteNewContent() {
    }

    public static Performable put (){
        return instrumented(WriteNewContent.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Parameters.TITLE_PAGE).into(PagesPage.TITLE_FIELD),
                Click.on(PagesPage.ADD_PARAGRAPH_BUTTON),
                Click.on(PagesPage.PARAGRAPH_BUTTON),
                Enter.theValue(Parameters.PARAGRAPH_PAGE).into(PagesPage.PARAGRAPH_FIELD)
        );

    }
}
