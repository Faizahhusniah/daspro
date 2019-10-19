public class Balokkk {
    private double p, l, t;

    public double getPanjang() {
        return p;
    }

    public void setPanjang(double p) {
        this.p = p;
    }

    public double getLebar() {
        return l;
    }

    public void setLebar(double l) {
        this.l = l;
    }

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public Balokkk(double p, double l, double t) {
        this.p = p;
        this.t = t;
        this.l = l;
    }

    public double Volume() {
        return p * l * t;
    }

    public double luaspermukaan() {
        return (2 * p * l) + (2 * p * t) + (2 * l * t);
    }
}