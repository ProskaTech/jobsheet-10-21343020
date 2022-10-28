package latihan;

public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n, int u){
        nama = n;
        umur = u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : "+nama);
        System.out.println("Umurku : "+umur+" Tahun");
    }
    
    public static void main(String args[]){
        Aktor a;
        
        a = new Aktor("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("===============");
        
        a = new Aktor ("Messi", 32);
        a.tampilAktor();
        System.out.println("===============");
    }   
}
