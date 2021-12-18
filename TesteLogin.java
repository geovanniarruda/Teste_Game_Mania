package br.senai.sp.testegamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
private WebDriver driver;
	
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void TesteNavegar() {	
		driver.get("http://localhost:4200/login");
		
		//Teste de Login com erro
		WebElement input = driver.findElement(By.name("email"));
		input.sendKeys("geovanni@email.com");
		
		WebElement senha = driver.findElement(By.name("senha"));
		senha.sendKeys("senhaerrada");
		senha.sendKeys(Keys.ENTER);
		
		WebElement mensagem = driver.findElement(By.id("msg"));
		System.out.println(mensagem.getText());
		
		
		input.clear();
		senha.clear();
		
		
		
		//Teste com login sendo feito com sucesso
		
		/*WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("geovanni@email.com");
		
		WebElement pass = driver.findElement(By.name("senha"));
		pass.sendKeys("poseidon");
		pass.sendKeys(Keys.ENTER);*/
		
	}
	
}



