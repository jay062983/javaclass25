package Interface;

public class webDriverTest {
    public static void main(String[] args) {

   WebDriver[]WD={new ChromeDriver(),new FirefoxDriver()};
   for(WebDriver Web:WD){
       Web.closeBrowser();
       Web.findElement();
       Web.openBrowser();
       Web.maximizeWindow();
   }
    }
}
