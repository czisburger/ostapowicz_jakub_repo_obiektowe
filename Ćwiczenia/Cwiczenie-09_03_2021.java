class Rekurencja2{
    public static void main(String [] args){
        //int liczba = obliczanieSilni(3);
        //System.out.println(liczba);
        System.out.println(wyswietlanieWyrazu("Anna"));
    }

    private static String wyswietlanieWyrazu(String wyraz){
        if(wyraz.length() > 1){
            return wyraz + "\n" + wyswietlanieWyrazu(wyraz.substring(0, wyraz.length()-1)) ;
        }
        return wyraz;
    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba > 0){
            System.out.println(liczba);
            return liczba + sumaKolejnychLiczb(liczba-1);
        }
        return 0;
    }

    private static int obliczanieSilni(int liczba){
        if(liczba > 1){
            return liczba + obliczanieSilni(liczba-1);
        }
        return 1;
    }
}