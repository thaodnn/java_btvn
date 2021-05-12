import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int thang = keyboard.nextInt();
        Switchcase sw = new Switchcase();
        sw.thangsw(thang);
        sw.thangie(thang);
    }
}
