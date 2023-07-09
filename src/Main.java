import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lab = new int[3];
        for (int iterators = 0; iterators < 3; iterators++) {
            lab[iterators] = scanner.nextInt();
        }
        int noofstudent = scanner.nextInt();
        int[] check = new int[3];
        int min = 2147483647;
        for (int iterators = 0; iterators < 3; iterators++) {
            check[iterators] = noofstudent < lab[iterators] ? 1 : 0;
            if (check[iterators] == 1 && min > lab[iterators]) {
                min = lab[iterators];
            }
        }
        String result = (min == lab[0]) ? "L1" : (min == lab[1]) ? "L2" : "L3";
        System.out.println(result);
    }
}