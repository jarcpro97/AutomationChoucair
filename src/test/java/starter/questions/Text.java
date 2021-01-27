package starter.questions;

import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class Text {
    public static Question<String> description(By element) {
        return actor -> net.serenitybdd.screenplay.questions.Text.of(element)
                .viewedBy(actor).asString();
    }
}
