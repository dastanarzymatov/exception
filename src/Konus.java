public class Konus {
    private int radius;

    private int vysota;




    public Konus(int radius, int vysota) {
        this.radius = radius;
        this.vysota = vysota;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getVysota() {
        return vysota;
    }

    public void setVysota(int vysota) {
        this.vysota = vysota;
    }

    public void method() {
        System.out.println(Math.PI*Math.pow(this.radius,2)+(Math.PI*this.radius*this.vysota));



    }


}
