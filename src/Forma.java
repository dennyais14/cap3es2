public class Forma {
    protected int base;
    protected int altezza;

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int calcolaArea(int base, int altezza){
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
