package sample;

public class Ember {
    private String nev;
    private int eletKor;

    public Ember(String nev, int eletKor) {
        this.nev = nev;
        this.eletKor = eletKor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletKor() {
        return eletKor;
    }

    public void setEletKor(int eletKor) {
        this.eletKor = eletKor;
    }

    @Override
    public String toString() {
        return String.format("%-20s %3d év", this.nev, this.eletKor);
    }
}
