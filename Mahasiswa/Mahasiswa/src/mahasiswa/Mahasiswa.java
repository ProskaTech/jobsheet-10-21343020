package mahasiswa;

public class Mahasiswa {
    String nama, smt;
    int nim;
    public static double ip = 3.5;
    
    public static void main(String[]args){
        Mahasiswa smtv = new Mahasiswa();
        
        smtv.nama = "Joni";
        smtv.nim = 12345;
        smtv.smt = "V";

        System.out.println("Nama Mahasiswa : "+ smtv.nama);
        System.out.println("NIM : "+ smtv.nim);
        System.out.println("Semester : "+ smtv.smt);
        System.out.println("IP Semester Ini : "+ ip);
        
        if(ip >= 3.5){
            System.out.println("Anda Berhak Mengontrak 24 SKS Pad Semester V");
        }
        
        else if(ip >= 3.0){
            System.out.println("Anda Berhak Mengontrak 22 SKS Pad Semester V");
        }
        
        else if(ip >= 2.5){
            System.out.println("Anda Berhak Mengontrak 20 SKS Pad Semester V");
        }
        
        else if(ip >= 2.0){
            System.out.println("Anda Berhak Mengontrak 18 SKS Pad Semester V");
        }
        
        else if(ip < 2.0){
        System.out.println("Anda Berhak Mengontrak 15 SKS Pad Semester V");
    }
    }
}