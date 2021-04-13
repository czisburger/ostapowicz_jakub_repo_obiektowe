

class Triangle{

    //Kon - pole trójkąta z wysokością i podstawą
    public Triangle(int wysokosc, int podstawa){
        System.out.println("Pierwsze pole trojkata: "+wysokosc*podstawa/2);
    }

    //Kon - pole trójkąta z dwoma bokami i sinusem
    public Triangle(int bok1, int bok2, int sin){
        System.out.println("Drugie pole trojkata: "+bok1/2*bok2*sin);
    }
}