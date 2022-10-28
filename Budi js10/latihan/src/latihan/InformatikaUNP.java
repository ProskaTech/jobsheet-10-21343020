package latihan;

public class InformatikaUNP {
    public static void main(String[]args){
        Mahasiswa Informatika = new Mahasiswa();
        Mahasiswa Elektronika = new Mahasiswa();
        
        Informatika.nama = "Budi Prasetyo";
        Informatika.nim = 21343020;
        Informatika.jur = "S1 Informatika";
        Informatika.univ = "UNIVERSITAS NEGERI PADANG";
        
        Elektronika.nama = "Wilson";
        Elektronika.nim = 2;
        Elektronika.jur = "S1 Elektronika";
        Elektronika.univ = "UNIVERSITAS NEGERI PADANG";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama : "+ Informatika.nama);
        System.out.println("NIM : "+ Informatika.nim);
        System.out.println("Jurusan : "+ Informatika.jur);
        System.out.println("Status : "+ Informatika.univ);
        
        System.out.println("=============================");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama : "+ Elektronika.nama);
        System.out.println("NIM : "+ Elektronika.nim);
        System.out.println("Jurusan : "+ Elektronika.jur);
        System.out.println("Status : "+ Elektronika.univ);      
    }
    
}
