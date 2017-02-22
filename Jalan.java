/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package getset;
import java.util.Scanner;
/**
 *
 * @author Lukman
 */
public class Jalan {
    private static int pilih;
    private static int a;
    public static void main(String[] args){
        Mobil go = new Mobil(180,0,0);
        Scanner in = new Scanner(System.in);
        while(!go.isStarted()){
        System.out.println("1. Start");
        System.out.println("2. Stop");
        System.out.println("3. Rem");
        System.out.println("4. Ganti Gigi");
        System.out.println("5. Gas");
        System.out.println("");
        System.out.println("Kecepatan Mobil "+go.getKecActual());
        System.out.println("Pilihan:");
        pilih = in.nextInt();
        switch (pilih){
            case 1 :
                go.startt();
                break;
            case 2 :
                go.stop();
                break;
            case 3 :
                go.rem();
                break;
            case 4 :
                System.out.println("Pindah Gigi");
                int Gigi = in.nextInt();
                go.gantiGigi(Gigi);
                break;
            case 5 :
                go.Gas();
                break;
        }
        }
        /*start.setKecMax(180);
        start.setPercepetan(10);
        start.setKecActual(20);

        Mobil start1 = new Mobil(220,20,40);

        System.out.println("Kecepatan Mobil 1 : " + start.getKecMax());
        System.out.println("Percepatan Mobil 1 : " + start.getPercepetan());
        System.out.println("Kecepatan Actual 1 : " + start.getKecActual());
        System.out.println();
        System.out.println("Kecepatan Mobil 2 : " + start1.getKecMax());
        System.out.println("Percepatan Mobil 2 : " + start1.getPercepetan());
        System.out.println("Kecepatan Actual 2 : " + start1.getKecActual());*/
    }
}
