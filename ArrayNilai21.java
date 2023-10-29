import java.util.Scanner;
public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int[] nilaiAkhir = new int[10];
        for (int i=0; i < nilaiAkhir.length; i++){
            System.out.println("Masukkan nilai akhir ke-"+i+ ":");
            nilaiAkhir[i]= input21.nextInt();
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            }else if (nilaiAkhir[i] <70){
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }

    }
    
}
