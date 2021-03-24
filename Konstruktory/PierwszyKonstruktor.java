import java.util.Scanner;
import java.util.InputMismatchException;

class PierwszyKonstruktor{

    public static void main(String[] args){
        obliczanieBmi();
    }

    private void testowanie(){
        MojeBmi mb = new MojeBmi(190, 86);
        ImieNazwisko in = new ImieNazwisko("Jakub", "Ostapowicz");
        //System.out.println(mb.waga+" "+mb.wzrost);
        in.welcomeMessage();
        double wynik = mb.mojeBmi();
        System.out.println("BMI = "+wynik);

        mb.setWaga(65);
        mb.setWzrost(178);
        System.out.println("BMI = "+mb.mojeBmi());
    }

    private static void obliczanieBmi(){
        int wzrost = 0;
        int waga = 0;

        int zakoncz = 0;
        boolean flag = true;
        while(flag){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n"
                        +"0 - zakończ\n"
                        +"1 - oblicz");
                zakoncz = sc.nextInt();
                while(zakoncz != 0){
                    System.out.print("Wprowadź wzrost w cm: ");
                    wzrost = sc.nextInt();

                    System.out.print("Wprowadź wagę w kg: ");
                    waga = sc.nextInt();
                    System.out.print("\n");

                    MojeBmi mb = new MojeBmi(wzrost, waga);
                    System.out.println("BMI = "+mb.mojeBmi());
                    System.out.print("\n");

                    System.out.println("0 - zakończ\nDowolna inna cyfra - oblicz ponownie");
                    zakoncz = sc.nextInt();
                
                }
                flag = false;
            }catch(InputMismatchException ex){
                System.out.println("Wpisuj tylko LICZBY CALKOWITE");
            }
        }
    }
}