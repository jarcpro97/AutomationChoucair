package starter.commonTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.UI.PagesPage;
import starter.global.Parameters;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteEditContent implements Task {

    public WriteEditContent() {
    }

    public static Performable put (){
        return instrumented(WriteEditContent.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Parameters.PAGE_EDIT).into(PagesPage.TITLE_FIELD),
                Enter.theValue(Parameters.PAGE_EDIT).into(PagesPage.PARAGRAPH_FIELD)
        );

    }
}
