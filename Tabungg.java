public class Tabungg {
    private double r,t;

    public double getR (){
        return r;
    }
    public void setR (double r) {
        this.r = r;
    }
    public double getT () {
        return t;
    }
    public void setT (double t) {
        this.t = t;
    }
    public Tabungg(double r, double t){
        this.r = r;
        this.t = t;
    }
    public double volume () {
        return Math.PI*r*r*t;
    }
    public double luasPermukaan () {
        return  (Math.PI *2*r*t) + (2*Math.PI*r*r);
    }
}
