// Budi Prasetyo 21343020
// Menggunakan Scanner
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa_Dinamis{
    String nama, smt;
    int nim;
    double ip;

    public void inputData(){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan Nama \t\t\t: ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM \t\t\t: ");
            nim = input.nextInt();
            System.out.print("Masukkan Semester Saat ini \t: ");
            smt = input.next();
            System.out.print("Masukkan IP Semester ini \t: ");
            ip = input.nextDouble();
            System.out.println("=================================");
        }
    }

    public void dataMahasiswa(){
        System.out.println("Nama \t\t: "+ nama);
        System.out.println("NIM \t\t: "+ nim);
        System.out.println("Semester\t: "+ smt);
        System.out.println("IP \t\t: "+ ip);

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
    
    public static void main(String[]args) {
        Mahasiswa_Dinamis smtv = new Mahasiswa_Dinamis();
        smtv.inputData();
        smtv.dataMahasiswa();   
    }  
}