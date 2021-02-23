import java.util.Random;
import java.util.*;

class Tablice{
    public static void main(String[] a){
        tablicaInt();
		
    }

    private static void tablicaInt(){
        Random r = new Random();
        int tab1[] = new int[10];

        for(int i=0;i<tab1.length;i++){
            tab1[i] = r.nextInt(6)+1;
        }
		
		FileReader fr = new FileReader("uczniowie.txt");
        BufferedReader br = new BufferedReader(fr);
		String textLine = br.readLine();
        do{
            System.out.println(textLine);
			textLine = br.readLine();
        }while (textLine != null);

        br.close();
    }
}