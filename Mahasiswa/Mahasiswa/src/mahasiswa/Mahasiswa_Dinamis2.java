// Budi Prasetyo 21343020
// Menggunakan JOptionPane
package mahasiswa;

import javax.swing.JOptionPane;

public class Mahasiswa_Dinamis2 {
        public void inputData(){
            String inputNama  = JOptionPane.showInputDialog("Masukan Nama");
            String a = JOptionPane.showInputDialog("Masukan NIM");
            int inputNim = Integer.parseInt(a);
            String inputSmt = JOptionPane.showInputDialog("Masukan Semester Saat ini");
            String b = JOptionPane.showInputDialog("Masukan IP Semester ini");
            double inputIp = Double.parseDouble(b);
            
            System.out.println("Nama \t : "+ inputNama);
            System.out.println("NIM \t : "+ inputNim);
            System.out.println("Semester : "+ inputSmt);
            System.out.println("IP \t : "+ inputIp);

            if(inputIp >= 3.5){
                System.out.println("Anda Berhak Mengontrak 24 SKS Pada Semester ini");
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Anda Berhak Mengontrak 24 SKS Pada Semester ini");  
            }
            
            else if(inputIp >= 3.0){
                System.out.println("Anda Berhak Mengontrak 22 SKS Pada Semester ini");
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Anda Berhak Mengontrak 22 SKS Pada Semester ini");           
            }
            
            else if(inputIp >= 2.5){
                System.out.println("Anda Berhak Mengontrak 20 SKS Pada Semester ini");
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Anda Berhak Mengontrak 20 SKS Pada Semester ini");            
            }
            
            else if(inputIp >= 2.0){
                System.out.println("Anda Berhak Mengontrak 18 SKS Pada Semester ini");
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Anda Berhak Mengontrak 18 SKS Pada Semester ini");  
            }
            
            else if(inputIp < 2.0){
                System.out.println("Anda Berhak Mengontrak 15 SKS Pada Semester ini");
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Anda Berhak Mengontrak 15 SKS Pada Semester ini");          
            }
        }

        public static void main(String[]args) {
            Mahasiswa_Dinamis2 smtv = new Mahasiswa_Dinamis2();
            smtv.inputData();          
        }       
}  