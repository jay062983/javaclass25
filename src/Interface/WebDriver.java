package Interface;

public interface WebDriver {
    /* Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

void openBrowser();

void closeBrowser();
void maximizeWindow();
void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finds an Element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finds an Element");
    }
}