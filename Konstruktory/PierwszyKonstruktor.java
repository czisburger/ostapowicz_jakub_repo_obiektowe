class PierwszyKonstruktor{
    public static void main(String[] args){

        MojeBmi mb = new MojeBmi(160, 86);
        //System.out.println(mb.waga+" "+mb.wzrost);
        double wynik = mb.mojeBmi();
        System.out.println("BMI = "+wynik);

        ImieNazwisko in = new ImieNazwisko("Jakub", "Ostapowicz");
    }
}