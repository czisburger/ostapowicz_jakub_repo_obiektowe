class TablicaDwuwymiarowa{
    public static void main(String [] args){
        tablicaTabliczkaMnozenia();
    }

    public static void tablicaTabliczkaMnozenia(){
        int [][] tab = new int[10][10];
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j] = (i+1)*(j+1);
            }
        }
        
        System.out.println("Tabliczka Mnozenia: ");
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void tablica2x2(){
        int [][] tab2x2 = new int[2][2];
        tab2x2[0][0] = 1;
        tab2x2[1][0] = 2;
        tab2x2[0][1] = 3;
        tab2x2[1][1] = 4;
        for(int i=0;i<tab2x2.length;i++){
            for(int j=0;j<tab2x2[i].length;j++){
                System.out.println(tab2x2[i][j]);
            }
        }
    }
}