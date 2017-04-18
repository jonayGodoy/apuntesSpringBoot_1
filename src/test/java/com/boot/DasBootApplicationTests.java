package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DasBootApplicationTests {

	@Test
	public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reporting for duty");
	}

}
