package uitests;


import driver.WebDriverHolder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.upload.UploadFilePage;
import utils.MyFilesUtils;

import java.io.File;
import java.io.IOException;

public class UploadTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        goToPart("upload");
    }

    @Test
    public void successfullUploadFile() throws IOException {
        File file = MyFilesUtils.generateLoremFile();
        UploadFilePage uploadFilePage = new UploadFilePage()
                .uploadFile(file);

        String actual = uploadFilePage.getSuccessUploadFileMessage().trim();
        String expected = file.getName();

        Assert.assertEquals(actual, expected);
    }
}
