package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {
    @FindBy(id = "dashboard-h1")
    public WebElement dashboardMessage;
    @FindBy(css = "[id='dashboard-p1']")
    public WebElement welcomeMessage;

    @FindBy(xpath = "(//*[.='Director'])[2]")
    public WebElement jobTitle;
    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfileBtn;
    @FindBy(xpath = "//div[@id='dashboard-edit-container']/a")
    public List<WebElement> editMenu;

    public String getTitle(String title) {
        return Driver.get().findElement(By.xpath("//td[.='" + title + "']")).getText();
    }

    public String getCompany(String company) {
        return Driver.get().findElement(By.xpath("//td[.='" + company + "']")).getText();
    }

    public String getHeadersMenu(String header) {
        return Driver.get().findElement(By.xpath("//*[.='" + header + "']")).getText();
    }


}
