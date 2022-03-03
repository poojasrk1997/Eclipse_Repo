package applicationhooks;

import java.util.Properties;

import io.cucumber.java8.Before;
import org.openqa.selenium.WebDriver;

import driverfactory.DriverFactory;
import util.ConfigReader;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before
	public void launchBrowser() {

		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);
	}

}
