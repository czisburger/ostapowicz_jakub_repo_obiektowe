
class CwiczenieObiektowe{
    public static void main(String[] args){
        MojeDane md = new MojeDane("Jakub", "Ostapowicz", "2PTN");
        Logowanie l = new Logowanie("akronim", "123ASDlo9");
        Kolo k1 = new Kolo(3.1415, 4);
        Kolo k2 = new Kolo(3.1415, 20);


        System.out.println("Imie: "+md.imie);
        System.out.println("Nazwisko: "+md.nazwisko);
        System.out.println("Klasa: "+md.klasa);

        System.out.println(l.toString());

        System.out.println("Pierwsze pole kola: "+k1.poleKola());
        System.out.println("Pierwszy obwod kola: "+k1.obwodKola());

        System.out.println("Drugie pole kola: "+k2.poleKola());
        System.out.println("Drugi obwod kola: "+k2.obwodKola());
    }
}