import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int watermelon = scanner.nextInt();
        if (watermelon % 2 == 0 && watermelon >2){ // because the boys want even number after divide if it get 2 the part will be 1 and 1 and thats odd. else 4 = 2 2 ,6 = 2 4
            System.out.println("Yes");

        }
        else {
            System.out.println("No");
        }


    }

}
