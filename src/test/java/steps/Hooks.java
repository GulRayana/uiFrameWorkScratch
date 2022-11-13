package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDown(Scenario scenario){
//       try {
//           if(scenario.isFailed()){ //если сценарий провалился то скрин надо сделать
//               final byte[]screenshot = ((TakesScreenshot).Driver.getDriver().getScreenshotAs(OutputType.BYTES));
//
//           }
//       }
    }
}
