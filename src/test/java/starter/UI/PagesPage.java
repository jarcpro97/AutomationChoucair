package starter.UI;

import org.openqa.selenium.By;

public class PagesPage {

    public static By ADD_NEW_BUTTON = By.xpath("//a[@class='page-title-action']");
    public static By TITLE_FIELD = By.id("post-title-0");
    public static By ADD_PARAGRAPH_BUTTON = By.xpath("//button[@class='components-button block-editor-inserter__toggle has-icon']");
    public static By PARAGRAPH_BUTTON = By.xpath("//button[@class='components-button block-editor-block-types-list__item editor-block-list-item-paragraph']");
    public static By PARAGRAPH_FIELD = By.xpath("//p[@data-title='Paragraph']");
    public static By PUBLISH_BUTTON = By.xpath("//button[contains(text(),'Publish')]");
    public static By CONFIRM_PUBLISH_BUTTON = By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']");
    public static By VIEW_PAGE_BUTTON = By.xpath("//a[@class='components-button is-secondary']");
    public static By TITLE_PAGE = By.xpath("//h1[@class='entry-title']");
    public static By PARAGRAPH_PAGE = By.xpath("//div[@class='entry-content']");
    public static By EDIT_OPTION = By.xpath("//a[@aria-label='Edit “PRUEBA NUEVA”']");
    public static By VIEW_PAGE_LINK = By.xpath("//a[@class='components-button components-snackbar__action is-tertiary']");
    public static By UPDATE_BUTTON = By.xpath("//button[contains(text(),'Update')]");
    public static By PAGE_TABLE = By.xpath("//a[contains(text(),'PRUEBA NUEVA')]");
    public static By PAGE_EDITED_TABLE = By.xpath("//a[contains(text(),'PRUEBA NUEVA EDITADO')]");
    public static By PAGE_QUICK_EDITED_TABLE = By.xpath("//a[contains(text(),'PRUEBA NUEVA EDITADO EDITADO')]");
    public static QuickEdit QUICK_EDIT;
































}
