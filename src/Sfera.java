public class Sfera {
    private int raduusS;

    public Sfera(int raduusS) {
        this.raduusS = raduusS;
    }

   // public Sfera() {



    public int getRaduusS() {
        return raduusS;
    }

    public void setRaduusS(int raduusS) {
        this.raduusS = raduusS;
    }

    public void assus(){
        System.out.println(4*Math.PI*Math.pow(this.raduusS,2));
    }
    public void hp(){
        System.out.println((4/3)*Math.PI*Math.pow(this.raduusS,3));
    }
}
