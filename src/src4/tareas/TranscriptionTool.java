package src4.tareas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TranscriptionTool {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://reportingdev.ealumni.com/default.aspx?page=OPRATranscriptionEditingTool&debug=Y");
		
		WebElement loginLink = driver.findElement(By.xpath("//td[@headers=\"login\"]"));
		WebElement usernameField = driver.findElement(By.id("R1_ctl02_txtUserName"));
		WebElement passwordField = driver.findElement(By.id("R1_ctl02_txtPassword"));
		WebElement loginButton = driver.findElement(By.id("R1_ctl02_btnSubmit"));
		
		usernameField.sendKeys("arobledo");
		passwordField.sendKeys("Aimee1s1t");
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		String projectName = "Cowboys Testing(0009)";
		WebElement loggedInMessage = driver.findElement(By.xpath("//label[text()='"+ projectName +"']"));
		if (loggedInMessage.getText().equals("Cowboys Testing(0009)"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		driver.close();



	}

}
