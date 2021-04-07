import java.util.Random;

class Tablica{
    public int tab[];

    public Tablica(int tab_length){
        tab = new int[tab_length];
        fillTab();
    }

    public int fillTab(){
        Random r = new Random();
        for(int i=0;i<tab.length;i++){
            tab[i] = r.nextInt(20)-10;
        }
        return 1;
    }

    public int[] getTab(){
        return tab;
    }
}