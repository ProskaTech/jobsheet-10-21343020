// Budi Prasetyo 21343020
// Program Statis
package mahasiswa;

public class Mahasiswa_Statis {
    String nama, smt;
    int nim;
    public static double ip = 3.5;
    public void data(){
        Mahasiswa_Statis smtv = new Mahasiswa_Statis();
        
        smtv.nama = "Joni";
        smtv.nim = 12345;
        smtv.smt = "V";

        System.out.println("Nama Mahasiswa  : "+ smtv.nama);
        System.out.println("NIM \t\t: "+ smtv.nim);
        System.out.println("Semester \t: "+ smtv.smt);
        System.out.println("IP Semester Ini : "+ ip);
        System.out.println("===============================================");
        
    }

    public void method() {
        if(ip >= 3.5){
            System.out.println("Anda Berhak Mengontrak 24 SKS Pada Semester ini");
            System.out.println("");
        }
        
        else if(ip >= 3.0){
            System.out.println("Anda Berhak Mengontrak 22 SKS Pada Semester ini");
            System.out.println("");
        }
        
        else if(ip >= 2.5){
            System.out.println("Anda Berhak Mengontrak 20 SKS Pada Semester ini");
            System.out.println("");
        }
        
        else if(ip >= 2.0){
            System.out.println("Anda Berhak Mengontrak 18 SKS Pada Semester ini");
            System.out.println("");
        }
        
        else if(ip < 2.0){
        System.out.println("Anda Berhak Mengontrak 15 SKS Pada Semester ini");
        System.out.println("");
        }    
    }   
    public static void main(String[]args){
        Mahasiswa_Statis smtv = new Mahasiswa_Statis();
        smtv.data();
        smtv.method();
    }
}