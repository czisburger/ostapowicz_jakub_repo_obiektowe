class PolaPrywatnePublicznie{
    static DaneOsobowe dos;

    public static void main (String[] args){
        dos = new DaneOsobowe();
        System.out.println("1 os BMI: "dos.mybmi;
        System.out.println(dos.miasto);
        dos.wzrost = 192;
        dos.waga = 94;
        dos.miasto = "Warszawa";
        System.out.println("2 os BMI: "dos.mybmi;
        System.out.println(dos.miasto);
    }
}