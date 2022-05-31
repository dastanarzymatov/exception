public class Porelelepiped {
    private int dlina;
    private int shirinaa;
    private int vysota;

    public Porelelepiped(int dlina, int shirinaa, int vysota) {
        this.dlina = dlina;
        this.shirinaa = shirinaa;
        this.vysota = vysota;
    }

    public void parallelepipedVolume() {
        System.out.println("Parallelepiped volume is: " + (dlina + shirinaa + vysota) + " cm");
    }

    public void parallelepipedArea() {
        System.out.println("Parallelepiped area is: " + (2 * (vysota * shirinaa + shirinaa * dlina + vysota * dlina)) + " cm");
    }
}