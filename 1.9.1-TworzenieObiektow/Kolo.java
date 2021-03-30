
class Kolo{
    private double pi = 3.1415;
    private int promien = 0;

    public Kolo(double pi, int promien){
        this.pi = pi;
        this.promien = promien;
    }

    public double poleKola(){
        return promien*promien*pi;
    }

    public double obwodKola(){
        return 2*pi*promien;
    }
}