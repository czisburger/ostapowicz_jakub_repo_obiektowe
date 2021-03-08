class Rekurencja{
    public static void main(String [] args){
        //rekurencja(5);
        //System.out.println(zwracamJedynke());
        //System.out.println(zwracamTekst());
        //System.out.println(zwracamPotegeWprowadzonejLiczby(4));
        int wartosc = sumaDwochNajwiekszychLiczb(5,6,3);
        System.out.println(wartosc);
        wartosc = sumaDwochNajwiekszychLiczb(8,7,6);
        System.out.println(wartosc);
        wartosc = sumaDwochNajwiekszychLiczb(1,9,4);
        System.out.println(wartosc);
    }

    private static int sumaDwochNajwiekszychLiczb(int a, int b, int c){
        int suma = 0;
        if(a>c && b>c){
            suma = a+b;
        }else if(b>a && c>a){
            suma = b+c;
        }else if(c>b && a>b){
            suma = c+a;
        }
        return suma;
    }

    private static int zwracamPotegeWprowadzonejLiczby(int liczba){
        return liczba*liczba;
    }

    private static int zwracamJedynke(){
        return 1;
    }

    private static String zwracamTekst(){
        return "Zwracam String";
    }

    private static int rekurencja(int i){
        if(i>0){
            System.out.println("rekurencja "+i);
            i--;
        }else{
            return 0;
        }
        rekurencja(i);
        return -1;
    }
}