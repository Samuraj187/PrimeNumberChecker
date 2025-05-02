import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не является простым числом");
        }
    }
    
    public static boolean isPrime(int num) {
        // 1 не считается простым числом
        if (num <= 1) {
            return false;
        }
        
        // Проверяем делители от 2 до квадратного корня из числа
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Найден делитель - число не простое
            }
        }
        return true; // Делителей не найдено - число простое
    }
}