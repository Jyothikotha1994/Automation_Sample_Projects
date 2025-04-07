package listener;

import org.testng.annotations.Test;

public class Dataprovideroutsideclass {

	@Test(dataProvider = "login data",dataProviderClass = DataProviderExampleinsameclass.class)

	public void loginTest(String username , String Password) {
		System.out.println("login with:"+username+"and"+Password);
		
	}

	
}
