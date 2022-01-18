package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {
    @Before
    public void start(){
        openBrowserAndLaunch();
    }
    @After
    public void end(){
        closeBrowser();
    }
}
