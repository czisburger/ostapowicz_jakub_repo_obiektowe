import java.util.ArrayList;

public class ArrayListvsTable{
    public static void arrayListvsTable(){
        int tab[] = new int[10];
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0;i<10;i++){
            tab[i] = i+10;
        }
        System.out.println(tab);

        for(int i=0;i<10;i++){
            lista.add(i);
        }
        System.out.println(lista);
        lista.add(100);
        for(int i=0;i<lista.size();i++){
            System.out.println("lista["+i+"] = "+lista.get(i));
        }
    }
}