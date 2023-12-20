import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {
    // 6 задание
    @Test
    public void testGoogle() throws InterruptedException {
        open("https://www.google.ru/");
        $(By.tagName("textarea")).setValue("Шамавов Адлан Халидович").pressEnter();
        Thread.sleep(8000);
    }

    // 7 задание
    //1
    @Test
    public void openCatalog() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
    }

    //2
    @Test
    public void addItemInCart() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
    }

    //3
    @Test
    public void openCart() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
    }

    //4
    @Test
    public void deleteItemInCart() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        Thread.sleep(3000);
        $(By.className("basket-delete")).click();
        Thread.sleep(3000);
    }

    //5
    @Test
    public void enterPromokod() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"basket-root\"]/div[3]/div/div/div[1]/div/input")).setValue("123456");
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"basket-root\"]/div[3]/div/div/div[1]/div/input")).pressEnter();
        Thread.sleep(3000);
    }

    //6
    @Test
    public void plusItem() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        Thread.sleep(3000);
        $(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/div/div/span[2]")).click();
        Thread.sleep(3000);
    }

    //7
    @Test
    public void checkoutWithError() throws InterruptedException {

        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"basket-root\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"bx-soa-total\"]/div[2]/a")).click();
        Thread.sleep(3000);
    }

    //8
    @Test
    public void checkoutSuccess() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"basket-root\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"soa-property-1\"]")).setValue("asd");
        $(By.xpath("//*[@id=\"soa-property-3\"]")).setValue("123");
        $(By.xpath("//*[@id=\"soa-property-2\"]")).setValue("asd@asd.ru");
        $(By.xpath("//*[@id=\"soa-property-7\"]")).setValue("asd");
        $(By.xpath("//*[@id=\"bx-soa-orderSave\"]/div[2]/label/input")).click();
        $(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/span[1]")).click();
        $(By.xpath("//*[@id=\"bx-soa-total\"]/div[2]/a")).click();
        Thread.sleep(3000);
    }

    //9
    @Test
    public void registerWithError() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[2]/a")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"REGISTER[LOGIN]\"]")).pressEnter();
        Thread.sleep(2000);
    }

    //10
    @Test
    public void registerSuccess() throws InterruptedException {
        Configuration.pageLoadTimeout = 100000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[2]/a")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"REGISTER[LOGIN]\"]")).setValue("asd5");
        $(By.xpath("//*[@id=\"REGISTER[EMAIL]\"]")).setValue("asd5@asd.ru");
        $(By.xpath("/html/body/div[5]/div[2]/form/div[3]/input")).setValue("asdasd123");
        $(By.xpath("/html/body/div[5]/div[2]/form/div[4]/input")).setValue("asdasd123");
        $(By.xpath("//*[@id=\"REGISTER[NAME]\"]")).setValue("asd");
        $(By.xpath("//*[@id=\"confidence\"]")).click();
        $(By.xpath("//*[@id=\"REGISTER[PERSONAL_PHONE]\"]")).pressEnter();
        Thread.sleep(2000);
    }

    //11
    @Test
    public void loginWithError() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[2]/button")).click();
        Thread.sleep(2000);
    }

    //12
    @Test
    public void loginSuccess() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[1]/input")).setValue("asd@asd.ru");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).setValue("asdasd123");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).pressEnter();
        Thread.sleep(3000);
    }

    //13
    @Test
    public void checkInfoItem() throws InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("//*[@id=\"bx_3966226736_579_7e1b8e3524755c391129a9d7e6f2d206\"]/a")).click();
        Thread.sleep(3000);
    }

    //14
    @Test
    public void openPersonalArea() throws InterruptedException {
        Configuration.pageLoadTimeout = 60000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[1]/input")).setValue("asd@asd.ru");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).setValue("asdasd123");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).pressEnter();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[4]/div[1]/a[1]")).click();
        Thread.sleep(3000);
    }

    //15
    @Test
    public void openHistory() throws InterruptedException {
        Configuration.pageLoadTimeout = 60000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[1]/input")).setValue("asd@asd.ru");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).setValue("asdasd123");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).pressEnter();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[4]/div[1]/a[2]")).click();
        Thread.sleep(3000);
    }

    //16
    @Test
    public void signOut() throws InterruptedException {
        Configuration.pageLoadTimeout = 60000;
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/div[1]/a[2]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[1]/input")).setValue("asd@asd.ru");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).setValue("asdasd123");
        $(By.xpath("//*[@id=\"login_form\"]/div[1]/div[2]/input")).pressEnter();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[4]/div[1]/a[4]")).click();
        Thread.sleep(3000);
    }

    //17
    @Test
    public void addOneItemFromCurt() throws  InterruptedException {
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        open("https://davayte-poedim.ru/food/ready-meals/goryachee/?action=ADD2BASKET&id=569");
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"bx_basketFKauiI\"]/a")).click();
        $(By.xpath("//*[@id=\"basket-root\"]/div[3]/div/div/div[1]/a")).click();
        Thread.sleep(2000);
    }

    //18
    @Test
    public void openLinkDelicious() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        Configuration.browserSize = "1920x1080";
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[2]/div/ul/li[3]/a")).click();
        Thread.sleep(3000);
    }

    //19
    @Test
    public void openLinkDelivery() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        Configuration.browserSize = "1920x1080";
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
        Thread.sleep(3000);
    }

    //20
    @Test
    public void openLinkRecipes() throws InterruptedException {
        Configuration.pageLoadTimeout = 50000;
        Configuration.browserSize = "1920x1080";
        open("https://davayte-poedim.ru/");
        $(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
        $(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
    }
}