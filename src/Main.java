import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException{

        try (PDDocument document = PDDocument.load(new File("C:/Users/Minde/Desktop/MT_github/fastReader/Urban-Mythic.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()){
                PDFTextStripperByArea stripperByArea = new PDFTextStripperByArea();
                stripperByArea.setSortByPosition(true);

                PDFTextStripper textStripper = new PDFTextStripper();

                String pdfFileInText = textStripper.getText(document);

                String words[] = pdfFileInText.split("\\s");

                PrintOnScreen.printOnScreen(words);
            }
        }
	}
}
