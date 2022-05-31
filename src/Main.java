import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true)
            try {
                System.out.println(" forma jazynyz ");
                System.out.println("    Parallelepiped , konus , sfera , silindr");
                Scanner sc = new Scanner(System.in);
                String c = sc.nextLine();
                switch (c) {
                    case "konus": {
                        System.out.println(" vyvedite vysota  ");
                        int konus = sc.nextInt();
                        if (konus < 0) {
                            throw new MyExeption("-san jazsa bolboit");
                        }
                        System.out.println("Radius jaz");
                        int rad = sc.nextInt();
                        if (rad > 20) {
                            throw new MyExeption("excuse me chyragym");
                        }
                        Konus konus1 = new Konus(rad, konus);
                        konus1.method();
                        break;

                    }
                    case "Silindr": {
                        System.out.println(" vyvedite vysota ");
                        int kon = sc.nextInt();
                        if (kon < 0) {
                            throw new MyExeption("-san jazbanyz");
                        }
                        System.out.println("radius jazynyz ");
                        int rd = sc.nextInt();
                        if (rd > 20) {
                            throw new MyExeption(" chon san jazbanyz");
                        }
                        Silindr silindr = new Silindr(kon, rd);
                        silindr.method1();
                        silindr.area();
                        break;
                    }
                    case "Porelelepiped": {
                        System.out.println(" vyvedite dlina ");
                        int dl = sc.nextInt();
                        if (dl < 0) {
                            throw new MyExeption(" -san jazbanyz");

                        }
                        if (dl > 20) {
                            throw new MyExeption("20 dan chon san jazbanyz");

                        }
                        System.out.println(" vyvedite shirina ");
                        int sh = sc.nextInt();
                        if (sh < 0) {
                            throw new MyExeption("- san jazbanyz");

                        }
                        if (sh > 20) {
                            throw new MyExeption("20 dan chon san jazbanyz");
                        }
                        System.out.println("vyvedite vysota ");
                        int vs = sc.nextInt();
                        if (vs < 0) {
                            throw new MyExeption("- san jazbanyz");

                        }
                        if (vs > 20) {
                            throw new MyExeption(" 20 dan chon san jazbanyz ");
                        }
                        Porelelepiped porelelepiped = new Porelelepiped(dl, sh, vs);
                        porelelepiped.parallelepipedArea();
                        porelelepiped.parallelepipedVolume();
                    }
                    break;
                    case "Sfera": {
                        System.out.println(" vyvedite radius ");
                        int sf = sc.nextInt();
                        if (sf < 0) {
                            throw new MyExeption(" - san jazbanyz ");
                        }
                        if (sf > 20) {
                            throw new MyExeption(" 20 dan chon san jazba ");

                        }
                        Sfera sfera = new Sfera(sf);
                        sfera.assus();
                        sfera.hp();

                    }
                    break;
                    default: {
                        System.out.println("tuura emes bashynan jazynyz ");
                    }
                }

            } catch (MyExeption e) {
                System.out.println(e.getMessage());

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("text jazsa bolboit");
            }


    }
}






