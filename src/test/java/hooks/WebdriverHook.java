package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Webdriverinstance;

public class WebdriverHook {

    @Before
    public void initializeWebdriver(){
        Webdriverinstance.initialize();
    }

    @After
    public void quitWebdriver(){
        Webdriverinstance.quit();
    }
}
