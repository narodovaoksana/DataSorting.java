package commands;
import lb5.Students;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Exit {
    public static void Exit (List<Students> students)throws IOException {
        //Gson gson = new Gson();
       // FileWriter files = new FileWriter("src/commands/Gson.json");
       // gson.toJson(contact,files);
       // files.close();
        System.exit(0);
    }
}
