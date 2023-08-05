import java.util.Scanner;

public class sumTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum += num;
            } else if (sc.next().equals("x")) {
                break;
            } else {
                System.out.println("Enter a valid input");
            }
        }

        System.out.println(sum);
        sc.close();
    }
}

