public class Silindr extends Konus{
    public Silindr(int radius,int vysota) {
        super(radius, vysota);

    }


    public void method1() {
        System.out.println( 2*Math.PI* getRadius() *(this.getVysota()+ this.getRadius()));

    }
    public void  area(){
        System.out.println(Math.PI*this.getRadius()*this.getRadius()*this.getVysota());

    }
}