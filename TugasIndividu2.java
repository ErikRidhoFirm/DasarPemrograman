import java.util.Scanner;
public class TugasIndividu2 {
    public static void main(String[] args) {
              Scanner input09 = new Scanner(System.in);
        String username = "Polinema";
        String password = "12345";
        String inUser, inPassword;

        System.out.println("    Selamat datang di Polinema      ");
        System.out.print("Masukkan Username anda   : ");
        inUser = input09.next();
        System.out.print("Masukkan Password Anda   : ");
        inPassword = input09.next();

        if (username.equals(inUser) && password.equals(inPassword)) {
            System.out.println("Username dan Password anda benar ");
        } else {
            System.out.println("Username dan Password anda salah");
        }
    }
}