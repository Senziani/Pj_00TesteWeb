package com.example.testeweb.testeweb.teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class GoogleTeste {

    private WebDriver driver;

    private final String url = "https://google.com";

    private final String driverRoad = "src/test/java/com/example/testeweb/testeweb/resource/chromedriver.exe";


    private void init(){
    System.setProperty("webdriver.chrome.driver",driverRoad);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    }


    @Test
    public void openAndSearchOnGoogle(){
    init();

    // Arrange-- preparação --
    WebElement inputPesquisa = driver.findElement(By.id("APjFqb"));
    // ação
    inputPesquisa.sendKeys("LOL"+ Keys.ENTER);

    // confirmação
    String resultado = driver.findElement(By.id("result-stats")).getText();

    assertTrue(resultado,resultado.contains(("Aproximadamente")));


    driver.close();


    }




}
