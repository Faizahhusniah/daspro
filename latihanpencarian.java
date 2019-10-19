public class latihanpencarian {
        private double a, t, s;

    public double getAlas() {
        return a;
    }

    public void setAlas(double a) {
        this.a = a;
    }

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public double getSisi() {
        return s;
    }

    public void setSisi(double s) {
        this.s = s;
    }

    public latihanpencarian (double a, double t, double s ){
    this.a = a;
    this.t = t;
    this.s = s;
    }

    public double luas ()  {
        return a*t;
    }
    public double keliling () {
        return s+s+a;
    }
}

