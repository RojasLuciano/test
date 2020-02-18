package other;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.accounts.samplePage;

public class sampleTest2 extends BaseTest {
	 
	@Test
	public void login_ok2() {
		samplePage sp = new samplePage(driver);
	//	assertEquals(sp.login_ok("mgr123", "mgr!23"), "http://demo.guru99.com/V4/manager/Managerhomepage.php");
		assertEquals("http://demo.guru99.com/V4/manager/Managerhomepage.php",sp.login_ok("mgr123", "mgr!23"));
		
	  
	}  
	
	@Test
	public void login_fail2() {
		samplePage sp = new samplePage(driver);
		assertEquals(sp.login_fail("----", "----"), "http://demo.guru99.com/V4/index.php");
	}
	

}
