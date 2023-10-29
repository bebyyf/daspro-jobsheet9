import java.util.Scanner;
public class LinearSearch21 {
    public static void main(String[] args) {
        Scanner input21= new Scanner (System.in);
        System.out.println("Masukkan jumlah elemen array :");
        int bilangan = input21.nextInt();
        int[] arrayInt = new int [bilangan];
        
        for (int i=0; i< bilangan; i++){
            System.out.println("Masukkan elemen array ke-"+ i +":");
            arrayInt[i]=input21.nextInt();
       }
       System.out.println(" Masukkan key yang ingin dicari : ");
       int key = input21.nextInt();
       int hasil = -1;
       for (int i = 0; i< bilangan; i++){
        if(arrayInt[i] == key){
            hasil=i;
            break;
        }
       }
       if (hasil != -1){
        System.out.println("Key ada diposisi index ke-" + hasil);
       }else{
        System.out.println("Key tidak ditemukan");
       }
        }
      
    }
    
 
