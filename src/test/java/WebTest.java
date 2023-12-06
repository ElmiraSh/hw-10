import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.files.DownloadActions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static com.codeborne.selenide.Condition.text;
import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selectors.withText;

public class WebTest {
@BeforeAll
 static void beforeEach() {
   // Configuration.baseUrl = "https://habr.com/en";
    Configuration.browserSize = "1920x1080";
    Configuration.pageLoadStrategy="eager";
//    Configuration.headless=true;
     Configuration.holdBrowserOpen = true;
}


        static Stream<Arguments> selenideTestForHabr() {
return Stream.of(
        Arguments.of(HabrEnum.Support,List.of("Specify the subject:","Your email adress:","Message:")),
        Arguments.of(HabrEnum.Design,List.of("ARTICLES","POSTS","NEWS","HUBS","AUTHORS"))
);}


@MethodSource
@ParameterizedTest
void selenideTestForHabr(HabrEnum habrEnum, List<String> expectedButtons){
    open("https://habr.com/en");
//$$(".tm-footer__link").(withText(String.valueOf(habrEnum))).click();
//$$(".Send").shouldHave(text(expectedButtons));

}
}

