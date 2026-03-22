package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testIssueSearch() {
        open("https://github.com/");

        $(".input-button").click();
        $("#query-builder-test").sendKeys("orazumov-pr/AllureReportTests");
        $("#query-builder-test").submit();

        $(linkText("orazumov-pr/AllureReportTests")).click();
        $("[data-content='Issues']").click();
        $(withText("#1")).should(Condition.exist);

    }

}
