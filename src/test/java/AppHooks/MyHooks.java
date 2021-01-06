package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverfactory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.*;

public class MyHooks {

	private ConfigReader ConfigR;
	private Properties prop;
	private DriverFactory Dfac;
	private WebDriver driver;

	@Before(order = 0)
	public void get_properties() {
		ConfigR = new ConfigReader();
		prop = ConfigR.get_prop();
	}

	@Before(order = 1)
	public void Start_Browser() {
		String browserName = prop.getProperty("browser");
		Dfac = new DriverFactory();
		driver = Dfac.init_driver(browserName);
	}

	@After(order = 0)
	public void tearDown() {
		Dfac.getDriver().quit();
	}

	@After(order = 1)
	public void TakeScree(Scenario scenario) {
		if (scenario.isFailed()) {
			String ScreenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/jpeg", ScreenshotName);
		}

	}

}
