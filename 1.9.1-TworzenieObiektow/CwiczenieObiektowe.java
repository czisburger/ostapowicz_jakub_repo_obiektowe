
class CwiczenieObiektowe{
    public static void main(String[] args){
        MojeDane md = new MojeDane("Jakub", "Ostapowicz", "2PTN");
        Logowanie l = new Logowanie("akronim", "123ASDlo9");

        System.out.println("Imie: "+md.imie);
        System.out.println("Nazwisko: "+md.nazwisko);
        System.out.println("Klasa: "+md.klasa);

        System.out.println(l.toString());
    }
}