import java.util.Scanner;
public class TugasIndividu01{
    public static void main(String []args){
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan jarak :");
        int jarak = input09.nextInt();

        if (jarak < 1000){
            System.out.println("Menggunakan Melee weapon");
        }
        else{
            System.out.println("Menggunakan Ranged Weapon");
        }
    }
}