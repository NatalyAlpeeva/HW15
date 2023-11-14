package pages.upload;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.MyFilesUtils;

import java.io.File;
import java.io.IOException;


public class UploadFilePage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedMessage;

    public UploadFilePage() {

        super();
    }

    public UploadFilePage uploadFile(File file) throws IOException {
        chooseFileButton.sendKeys(file.getAbsolutePath());
        uploadButton.click();
        return new UploadFilePage();
    }


    public String getSuccessUploadFileMessage() {
        return uploadedMessage.getText();
    }
}






