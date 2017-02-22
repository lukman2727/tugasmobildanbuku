/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntriAalamat;

/**
 *
 * @author zenix
 */
public class databuku {
    private String[] Name=new String [100];
    private String[] Addres=new String [100];
    private String[] Telp=new String [100];
    private String[] Mail=new String [100];

    private static int perhitungan;
    private static int index;

    public databuku(){
    perhitungan=0;
    }
    public String getNamas(int index){
    return Name[index];
    }
    public String getAlamats(int index){
    return Addres[index];
    }
    public String getTelepons(int index){
    return Telp[index];
    }
    public String getEmails(int index){
    return Mail[index];
    }
    public void setNamas( String nama, int index,String alamat,String telpon,String email){
    Name[index] = nama;
    Addres[index] = alamat;
    Telp[index] = telpon;
    Mail[index] = email;
    perhitungan++;
    }

    public static int getPerhitungan(){
    return perhitungan;
    }
}
