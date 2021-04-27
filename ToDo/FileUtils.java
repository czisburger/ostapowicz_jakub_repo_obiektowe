import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class FileUtils{
    private DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void saveToFile(ToDo td){
        try{
            File f = new File("notatki.txt");
            FileWriter fw = new FileWriter(f, true);
            String title = td.getTitle();
            fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()+";"+dtf.format(td.getAdd_Date()));
            fw.close();
        }catch(IOException ex){
            System.out.println("UPS! "+ex.toString());
        }
    }

    public ArrayList<ToDo> readFromFile(){
        ArrayList<ToDo> list = new ArrayList<>();
        try{
            File f = new File("notatki.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String temp = sc.nextLine();
                String[] ttemp = temp.split(";");
                ToDo td = new ToDo(ttemp[0], ttemp[1], ttemp[2], LocalDateTime.parse(ttemp[3], dtf));
                list.add(td);
            }
        }catch(FileNotFoundException ex){
            System.out.println("UPS! "+ex.toString());
        }
        return list;
    }
}