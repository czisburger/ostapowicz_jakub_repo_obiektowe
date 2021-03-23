class Samochody{
    public String marka = "";
    public String model = "";
    public String rodzaj_silnika = "";
    public int pojemnosc = 0;
    public int moc = 0;
    public int mo_obrotowy = 0;

    @Override
    public String toString(){
        return "Samochód:\n"
        +"Marka:"+samochody.marka+"\n"
        +"Model:"+samochody.model+"\n"
        +"Rodzaj Silnika:"+samochody.rodzaj_silnika+"\n"
        +"Moc:"+samochody.moc+"\n"
        +"Moment Obrotowy:"+samochody.mo_obrotowy+"\n"
        +"Pojemnosc:"+samochody.pojemnosc+"\n";
    }
}