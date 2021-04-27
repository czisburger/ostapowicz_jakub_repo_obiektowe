import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        ToDoUtils.showNotes();
    }

    public static void readFromFile(){
        FileUtils fu = new FileUtils();
        fu.readFromFile();
    }

    private static void testingDateTimeFormatter(){
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        LocalDateTime lDT1 = LocalDateTime.now();
        System.out.println(dTF.format(lDT1));
        //LocalDateTime lDT2 = LocalDateTime.parse("2021-04-26T09:30:42.826682289");
        //System.out.println(lDT2);
        dTF = DateTimeFormatter.ofPattern("YYYY LLLL dd");
        System.out.println(dTF.format(lDT1));
    }

    public static void testSaveToFile(){
        FileUtils fu = new FileUtils();
        fu.saveToFile(new ToDo("Drugi wpis", "Drugi wiersz???"));
        fu.saveToFile(new ToDo("",""));
        fu.readFromFile();
    }

    private static void testReadFromKeyboard(){
        ReadFromKeyboard rfk = new ReadFromKeyboard();
        ToDo td = rfk.readOneToDo();
        System.out.println(td);
    }

    private static void test(){
        ToDo td1 = new ToDo("Pierwsza", "To jest pierwsza notatka");
        ToDo td2 = new ToDo("Druga", "To jest druga notatka z autorem", "John Doe");

        System.out.println(td1);
        System.out.println(td2);
    }
}