
package kata4;

import java.util.ArrayList;
import java.io.*;

public class MailListReader {
    
    public static ArrayList<String> read(String name) throws FileNotFoundException, IOException {
        ArrayList<String> mailList = new ArrayList <>();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        String mail;
        while((mail= reader.readLine()) != null) {
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        reader.close();
        return mailList;
    }
}
