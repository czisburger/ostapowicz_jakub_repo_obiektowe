class OstapowiczJakub{
    public static void main(String[] args){
        Sprawdzian s = new Sprawdzian("2021-04-07", 6, "PROGRAMOWANIE OBIEKTOWE");
        Dane d = new Dane("Jakub","Ostapowicz","2005-10-04");
        Tablica t = new Tablica(10);

        System.out.println(s.data);
        System.out.println(s.ocena);
        System.out.println(s.przedmiot+"\n");

        System.out.println(d.toString()+"\n");

        int tab [] = t.getTab();
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+", ");
        }
        
    }
}