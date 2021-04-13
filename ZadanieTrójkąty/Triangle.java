

class Triangle{

    //Kon - pole trójkąta z wysokością i podstawą
    public Triangle(int wysokosc, int podstawa){
        System.out.println("Pierwsze pole trojkata: "+wysokosc*podstawa/2);
    }

    //Kon - pole trójkąta z dwoma bokami i kątem pomiędzy bokami
    public Triangle(int bok1, int bok2, int sin){
        System.out.println("Drugie pole trojkata: "+(bok1/2)*bok2*sin);
    }

    //Kon - pole trójkąta z jednym bokiem i trzema sinusami
    public Triangle(int bok1, int sin1, int sin2, int sin3){
        System.out.println("Trzecie pole trojkata: "+((bok1/2)*(bok1/2))*(sin1*sin2)/sin3);
    }

    //Kon - pole trójkąta z trzema bokami i promieniem
    public Triangle(int bok1, int bok2, int bok3, int promien,int pusty){
        System.out.println("Czwarte pole trojkata: "+(bok1*bok2*bok3)/promien);
    }

    
}