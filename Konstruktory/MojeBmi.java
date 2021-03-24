class MojeBmi{
    private int wzrost = 0;
    private int waga = 0;

    public MojeBmi(int wzrost, int waga){
        this.wzrost = wzrost;
        this.waga = waga;
    }
    
    public double mojeBmi(){
        return waga/((double)wzrost/100*(double)waga/100);
    }

    public void setWzrost(int wzrost){
        this.wzrost = wzrost;
    }

    public void setWaga(int waga){
        this.waga = waga;
    }
}