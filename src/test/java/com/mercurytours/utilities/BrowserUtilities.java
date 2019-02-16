package com.mercurytours.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {

	public static void waitForPageToLoad() {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input[name='login']")));
		
	}
	//this method receives string parameter of url piece
	public static void switchTabs(String url) {
		String defaultTab = Driver.getInstance().getWindowHandle();
		for (String windowHandle : Driver.getInstance().getWindowHandles()) {
			Driver.getInstance().switchTo().window(windowHandle);
			if (Driver.getInstance().getCurrentUrl().contains(url)) {
				return;
			}
		}
		Driver.getInstance().switchTo().window(defaultTab);
	}
}
