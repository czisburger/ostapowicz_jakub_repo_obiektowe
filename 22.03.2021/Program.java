class Program{
    static Samochody samochody;
    static Klient klient;

    public static void main (String[] args){
        init();
        System.out.println(1);
        System.out.println(samochody.toString());
        System.out.println(2);
        System.out.println(samochody1.toString());
    }
    private static void init(){
        klient = new Klient();
        klient.nr_klienta = 10;
        samochody = new Samochody();
        samochody.marka = "Ford";
        samochody.model = "S-Max";
        samochody.rodzaj_silnika = "Diesel";
        samochody.moc = 150;
        samochody.mo_obrotowy = 246;
        samochody.pojemnosc = 1980;

        samochody1 = new Samochody();
        samochody1.marka = "Audi";
        samochody1.model = "Q5";
        samochody1.rodzaj_silnika = "Diesel";
        samochody1.moc = 190;
        samochody1.mo_obrotowy = 320;
        samochody1.pojemnosc = 1980;
    }
}