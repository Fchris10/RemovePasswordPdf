import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.FileOutputStream;
import java.io.IOException;

public class PasswordRemover {
    public static void main(String[] args)  {

        String pdfSource = "C:\\Users\\comet\\IdeaProjects\\RemovePasswordPdf\\src\\main\\resources\\IS-3-protetto.pdf";
        String pdfDestination = "C:\\Users\\comet\\Desktop\\unprotectedFile.pdf";
        String password = "24ISpassword24!";

        try {
            //lettura del file
            PdfReader reader = new PdfReader(pdfSource, password.getBytes());

            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(pdfDestination));

            stamper.close();
            reader.close();
        } catch (DocumentException | IOException e){
            System.out.println("Error");
        }
    }

}
