package test.pages;

import org.openqa.selenium.support.FindBy;
//import ru.sbt.webdriver.elements.Button;
import ru.sbt.webdriver.elements.Button;
import ru.sbt.webdriver.elements.DateBox;
import ru.sbt.webdriver.elements.DropDown;
import ru.sbt.webdriver.elements.InputBox;
import ru.sbt.webdriver.pages.BasePage;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by Kasyanenko Konstantin
 * on 03.07.2017.
 */
@PageEntry(title = "Пополняй")
public class ResultsPage extends BasePage {

    @ElementTitle("Кнопка рассчитать")
    @FindBy(xpath = "//div[@class='calc-form__submit-block']")
    private Button buttonCalculate;

    @ElementTitle("Дата открытия вклада")
    @FindBy(xpath = "//div[2]/div/div[@class='kit-date-picker']")
    private DateBox openDate;

    @ElementTitle("Дата закрытия вклада")
    @FindBy(xpath = "//div[3]/div/div[@class='kit-date-picker']")
    private DateBox closeDate;

    @FindBy(xpath = "//div[@class = 'kit-dropdown']")
    @ElementTitle("Валюта вклада")
    public DropDown valVklad;

    @FindBy(xpath = "//div[@class='kit-masked-input']")
    @ElementTitle("Сумма вклада")
    public InputBox sumVlad;

    public ResultsPage() {
    }

    @ActionTitle("количество результатов поиска должно быть")
    public void checkResultCount(String resultCountString){
        // TODO: 05.07.2017
    }
}
