package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\AutomationFremWork\\src\\test\\resources\\configfile\\config.properties");
		Properties p=new Properties();
		p.load(fr);
		String browser = p.getProperty("browser");
		String url=p.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	}

	
}
