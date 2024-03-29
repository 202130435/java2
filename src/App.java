import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하시오 : ");
        int month = scanner.nextlnt();

        if(3 <= month && month <= 5) {
            System.out.println("봄");
        }
        else if(6 <= month && month <= 8) {
            System.out.println("여름");
        }
        else if(9 <= month && month <= 11) {
            System.out.println("가을");
        }

        else{
            System.out.println("겨울");
        }
            scanner.close();
    }
}
