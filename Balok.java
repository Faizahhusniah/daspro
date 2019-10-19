public class Balok {
    private double r;
    double phi = Math.PI;

    public double getPhi() {
        return phi;
    }

    public void setPhi(double Phi ) {
        this.phi = phi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public Balok (double r){
        this.r = r;
    }

    public double luas () {
        return phi*r*r;
    }

    public double keliling() {
        return 2*phi*r;
    }
}
