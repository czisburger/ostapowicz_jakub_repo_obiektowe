class PierwszeObiektowe{
    public static void main(String[] arg){
        ObiektPudelko op = new ObiektPudelko();
        System.out.println("Domyslna wartosc: "+op.wysokosc);

        op.wysokosc = 100;
        System.out.println("Po zmodyfikowaniu: "+op.wysokosc);

        Osoba os = new Osoba();
        System.out.println("Imie: "+os.imie);
        System.out.println("Nazwisko: "+os.nazwisko);
    }
}