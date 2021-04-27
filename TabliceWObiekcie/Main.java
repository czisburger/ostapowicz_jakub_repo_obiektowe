class Main{
    public static void main(String[] args){
        MyObject mo = new MyObject(10,0);

        int tab [] = mo.getTab();
        for(int i=0;1<tab.length;i++){
            System.out.println(tab[i]);
        }

        System.out.println(mo);
    }
}