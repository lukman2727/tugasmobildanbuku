package EntriAalamat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class menu
{
    public static void main( String[] args ){
    databuku namaRecord = new databuku();
    BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
    String [] Nama =new String[100];
    String [] Alamat =new String[100];
    String [] Telepon =new String[100];
    String [] Email =new String[100];
    String pilih="";
    String N="";
    String yesno="";
    int no;
    int jumlah=0;

             do {
                try {
    System.out.println("MENU");
    System.out.println("1. MASUKAN DATA");
    System.out.println("2. HAPUS DATA");
    System.out.println("3. TAMPILKAN DATA");
    System.out.println("4. UBAH DATA");
    System.out.println("5. KELUAR");
    System.out.println();
    System.out.print("MASUKAN PILIHAN ANDA :");
               try{
                pilih=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
    switch(Integer.parseInt(pilih)){
      case 1:
        System.out.print("Masukkan Jumlah Data Baru :");
               try{
               N=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        jumlah=Integer.parseInt(N);
        for(int i=0; i<jumlah; i++ ){
        System.out.println("Data ke: "+(i+1));
        System.out.print("Masukan Nama: ");
            try{
                Nama[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        System.out.print("Masukan Alamat: ");
            try{
                Alamat[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        System.out.print("Masukan Telepon: ");
            try{
                Telepon[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Masukan Email: ");
            try{
                Email[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        }
        for(int i=0; i<jumlah; i++ ){
        namaRecord.setNamas(Nama[i],i,Alamat[i],Telepon[i],Email[i]);
        System.out.println("Nama       :"+namaRecord.getNamas(i) );
        System.out.println("Alamat     :"+namaRecord.getAlamats(i) );
        System.out.println("Telepon    :"+namaRecord.getTelepons(i) );
        System.out.println("Email      :"+namaRecord.getEmails(i) );
        System.out.println();
        }
        System.out.println("Data Telah Di Input");
        break;
    
    case 2:
        System.out.println("HAPUS DATA");
        System.out.print("Masukan Nomor Siswa yang akan di hapus: Input [1-"+jumlah+"]: ");
               try{
               N=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        no=Integer.parseInt(N);
        System.out.println("Data Ke- "+no);
        no=no-1;
        namaRecord.setNamas(Nama[no],no,Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama        :"+namaRecord.getNamas(no) );
        System.out.println("Alamat      :"+namaRecord.getAlamats(no) );
        System.out.println("Telepon     :"+namaRecord.getTelepons(no) );
        System.out.println("Email       :"+namaRecord.getEmails(no) );
        System.out.println();
        System.out.print("Apakah akan dihapus? y/t :");
        System.out.println();
               try{
               yesno=dataIn.readLine();
               }catch(IOException e){
               System.out.println("salah!");
               }
        if ((yesno=="tidak")||(yesno=="t")||(yesno=="T")){
            System.out.println("Data Tidak Jadi di hapus");
        }else{
            Nama[no]="";
            Alamat[no]="";
            Telepon[no]="";
            Email[no]="";
        namaRecord.setNamas(Nama[no],no,Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama        :"+namaRecord.getNamas(no) );
        System.out.println("Alamat      :"+namaRecord.getAlamats(no) );
        System.out.println("Telepon     :"+namaRecord.getTelepons(no) );
        System.out.println("Email       :"+namaRecord.getEmails(no) );
        System.out.println("Data Berhasil Dihapus");
        System.out.println();
        }
        break;
    case 3:
            System.out.println("Semua Data");
            for(int i=0; i<jumlah; i++ ){
                namaRecord.setNamas(Nama[i],i,Alamat[i],Telepon[i],Email[i]);
                System.out.println("Nama       :"+namaRecord.getNamas(i) );
                System.out.println("Alamat     :"+namaRecord.getAlamats(i) );
                System.out.println("Telepon    :"+namaRecord.getTelepons(i) );
                System.out.println("Email      :"+namaRecord.getEmails(i) );
                System.out.println();
                System.out.println("Data Keseluruhan");
           }
            break;
    case 4:
                System.out.println("Ubah Data");
        System.out.print("Masukan Nomor Yang Akan di Ubah: Input [1-"+jumlah+"]: ");
        System.out.println();
               try{
               N=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        no=Integer.parseInt(N);
        System.out.println("Ditemukan Data ke- "+no);
        System.out.println();
        no=no-1;
        namaRecord.setNamas(Nama[no],no,Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama        :"+namaRecord.getNamas(no) );
        System.out.println("Alamat      :"+namaRecord.getAlamats(no) );
        System.out.println("Telepon     :"+namaRecord.getTelepons(no) );
        System.out.println("Email       :"+namaRecord.getEmails(no) );
        System.out.println();
        System.out.print("Yakin Akan Di Ubah? y/t] :");
        System.out.println();
               try{
               yesno=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        if ((yesno=="tidak")||(yesno=="t")||(yesno=="T")){
            System.out.println("Data Tidak Jadi di ubah");
        }else{
     System.out.println("Proses Ubah Data ke: "+(no+1));
        System.out.print("Input Nama: ");
               try{
                Nama[no]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input Alamat: ");
               try{
                Alamat[no]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input telpon: ");
               try{
                Telepon[no]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input Email: ");
               try{
                Email[no]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        namaRecord.setNamas(Nama[no],no,Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama        :"+namaRecord.getNamas(no) );
        System.out.println("Alamat      :"+namaRecord.getAlamats(no) );
        System.out.println("Telepon     :"+namaRecord.getTelepons(no) );
        System.out.println("Email       :"+namaRecord.getEmails(no) );
        System.out.println();
        System.out.println("Data Berhasil Diubah");
        System.out.println();
        }
        break;
    default:
        System.out.println("Terima Kasih");
    }
           } catch (Exception e) {
                    System.out.println("tidak sesuai!");
             }
         } while (Integer.parseInt(pilih) != 5);
    }
}
