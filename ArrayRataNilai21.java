import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input21.nextInt();
        int [] nilaiMhs = new int[jumlahMahasiswa];
        int banyaklulus = 0;
        double total = 0;
        double rata2;

        for (int i =0; i< nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]= input21.nextInt();
            total+= nilaiMhs[i];
            rata2= total/nilaiMhs.length;
            if(nilaiMhs[i] > 70){
                banyaklulus++;
            }else if (nilaiMhs[i]<70){
            System.out.println("Rata-rata nilai= "+rata2);
            System.out.println("Rata-rata nilai tidak lulus = "+rata2);
        }}

    }
    
}
