package starter.UI;

import org.openqa.selenium.By;

public class QuickEdit {

    public static By QUICK_EDIT_TABLE = By.xpath("//button[@aria-label='Quick edit “PRUEBA NUEVA EDITADO” inline']");
    public static By TITLE_QUICK_EDIT = By.xpath("//input[@name='post_title']");
    public static By SLUG_QUICK_EDIT = By.xpath("//input[@name='post_name']");
    public static By PARENT_QUICK_EDIT = By.id("post_parent");
    public static By ORDER_QUICK_EDIT = By.xpath("//input[@name='menu_order']");
    public static By MONTH_QUICK_EDIT = By.xpath("//input[@name='mm']");
    public static By DAY_QUICK_EDIT = By.xpath("//input[@name='jj']");
    public static By YEAR_QUICK_EDIT = By.xpath("//input[@name='aa']");
    public static By HOUR_QUICK_EDIT = By.xpath("//input[@name='hh']");
    public static By MINUTES_QUICK_EDIT = By.xpath("//input[@name='mn']");
    public static By COMMENTS_QUICK_EDIT = By.xpath("//input[@name='comment_status']");
    public static By PASSWORD_QUICK_EDIT = By.xpath("//input[@name='post_password']");
    public static By PRIVATE_QUICK_EDIT = By.xpath("//input[@name='keep_private']");
    public static By STATUS_QUICK_EDIT = By.xpath("//select[@name='_status']");
    public static By UPDATE_QUICK_EDIT = By.xpath("//button[@class='button button-primary save alignright']");
    public static By QUICK_SECOND_EDIT_TABLE = By.xpath("//button[@aria-label='Quick edit “PRUEBA NUEVA EDITADO EDITADO” inline']");

}
