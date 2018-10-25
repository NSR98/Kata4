package kata4.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        List<Mail> mailList = new ArrayList<>();
        
        try {
            mailList = new MailListReader().read("email.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el fichero");
        }
        
        new HistogramDisplay(new MailHistogramBuilder().build(mailList)).execute();
    }
}