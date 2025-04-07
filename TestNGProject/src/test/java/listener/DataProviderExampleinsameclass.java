package listener;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExampleinsameclass {
@DataProvider(name="login data")
public Object[][] getdata(){
	return new Object[][] {
		{"User1","pass1"},
		{"User2","pass2"},
		{"user3","pass3"}
	};
	
}

@Test(dataProvider = "login data")

public void loginTest(String username , String Password) {
	System.out.println("login with:"+username+"and"+Password);
	
}

}
