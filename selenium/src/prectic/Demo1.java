package prectic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
			//System.setProperty("webdriver.chrome.driver",
			//"./driver/chromedriver.exe");
			ChromeDriver c= new ChromeDriver();
			c.get("https://www.google.com"); // open
			String title = c.getTitle(); // google
			System.out.println(title);
			//Thread.sleep(4000);// slow the closing process
			c.close(); // close
	}

}
