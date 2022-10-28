package latihan;

import java.util.Scanner;

public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int bb, tb;
    
    public void inputdata(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Lengkap\t: ");
            nama = input.nextLine();
            System.out.print("Masukkan Tempat Lahir\t: ");
            tempat_lahir = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir\t: ");
            tgl_lahir = input.nextLine();
            System.out.print("Masukkan Berat Badan\t: ");
            bb = input.nextInt();
            System.out.print("Masukkan Tinggi badan\t: ");
            tb = input.nextInt();
        }
    }
    
    public void identitas(){
        System.out.println("Nama saya\t: "+ nama);
        System.out.println("Tempat Lahir\t: "+ tempat_lahir);
        System.out.println("Tanggal Lahir\t: "+ tgl_lahir);
        System.out.println("Berat Badan\t: "+ bb +" Kg");
        System.out.println("Tinggi Badan\t: "+ tb +" Cm");   
    }
    
    public static void main(String[]args){
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}
