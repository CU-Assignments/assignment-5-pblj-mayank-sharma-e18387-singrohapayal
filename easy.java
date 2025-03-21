import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] numbers = input.split(" ");
        List<Integer> intList = new ArrayList<>();
        
        for (String num : numbers) {
            intList.add(Integer.parseInt(num)); // Autoboxing
        }
        
        int sum = 0;
        for (Integer num : intList) {
            sum += num; // Unboxing
        }
        
        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
