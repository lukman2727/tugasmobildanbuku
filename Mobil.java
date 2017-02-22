/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package getset;

/**
 *
 * @author Lukman
 */
public class Mobil {
    private int kecMax;
    private int percepetan;
    private int kecActual;
    private boolean started;

    public Mobil() {
    }

    public Mobil(int kecMax, int percepetan, int kecActual) {
        this.kecMax = kecMax;
        this.percepetan = percepetan;
        this.kecActual = kecActual;
        this.started = false;
    }

    public void setKecActual(int kecActual) {
        this.kecActual = kecActual;
    }

    public void setKecMax(int kecMax) {
        this.kecMax = kecMax;
    }

    public void setPercepetan(int percepetan) {
        this.percepetan = percepetan;
    }
     public void setStarted(boolean started) {
        this.started = started;
    }

    public int getKecActual() {
        return kecActual;
    }

    public boolean isStarted() {
        return started;
    }


    public int getKecMax() {
        return kecMax;
    }

    public int getPercepetan() {
        return percepetan;
    }
public void startt(){
       if(!started){
        this.setKecActual(0);
        }
    }
public void stop(){
    this.setKecActual(0);
    this.started = true;
    System.out.println("Mobil Sudah Berhenti.");
}
public void rem(){
    this.setKecActual(this.getKecActual()/2);
}
public void gantiGigi(int Gigi){
    this.setPercepetan(percepetan);
    switch(Gigi){
        case 0:
            this.setPercepetan(0);
            break;
        case 1:
            this.setPercepetan(10);
            break;
        case 2:
            this.setPercepetan(20);
            break;
        case 3:
            this.setPercepetan(30);
            break;
        case 4:
            this.setPercepetan(40);
            break;
    }

}
public void Gas(){
    if(this.getKecActual()+this.getPercepetan()<this.getKecMax()){
        this.setKecActual(this.getKecActual()+this.getPercepetan());
    }else this.setKecActual(this.getKecMax());
}
}
