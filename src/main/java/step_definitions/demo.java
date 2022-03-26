package step_definitions;

import cucumber.api.java.zh_cn.假如;
import org.junit.Assert;

public class demo {

    @假如("today is Sunday")
    public void todayIsSunday(){
        Assert.assertTrue(true);
    }
}
