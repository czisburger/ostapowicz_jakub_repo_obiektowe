import java.util.Random;

class Tablice{
    public static void main(String[] a){
        tablicaInt();
    }

    private static void tablicaInt(){
        Random r = new Random();
        int [] tab1 = new int [10];

        for(int i=0;i<tab1.length;i++){
            tab1[i] = r.nextInt(6)+1;
        }

        for(int i=0;i<tab1.length;i++){
            System.out.println(i+1+" -> "+tab1[i]);
        }  
    }

}