import java.util.Scanner;
import java.util.Objects;

public class Main2<T extends Comparable<T>> {

    private final T first;
    private final T second;
    private final T third;

    public Main2(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean contains(T element) {
        return Objects.equals(first, element) || Objects.equals(second, element) || Objects.equals(third, element);
    }

    public T min() {
        T min = first;
        if (second.compareTo(min) < 0) min = second;
        if (third.compareTo(min) < 0) min = third;
        return min;
    }

    public String sum() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            double total = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
            return String.valueOf(total);
        } else {
            return first + " " + second + " " + third;
        }
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа:");
        try {
            System.out.print("Первое число: ");
            Integer num1 = scanner.nextInt();
            System.out.print("Второе число: ");
            Integer num2 = scanner.nextInt();
            System.out.print("Третье число: ");
            Integer num3 = scanner.nextInt();

            Main2<Integer> numberTriplet = new Main2<>(num1, num2, num3);
            System.out.println("\nКортеж: " + numberTriplet);
            System.out.print("Введите число для проверки наличия в кортеже: ");
            Integer checkNum = scanner.nextInt();
            System.out.println("Содержит? " + numberTriplet.contains(checkNum));
            System.out.println("Наименьший элемент: " + numberTriplet.min());
            System.out.println("Сумма элементов: " + numberTriplet.sum());
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Введите корректное целое число.");
            scanner.nextLine(); // Очистка буфера
        }

        System.out.println("\nВведите три строки:");
        try {
            System.out.print("Первая строка: ");
            String str1 = scanner.next();
            System.out.print("Вторая строка: ");
            String str2 = scanner.next();
            System.out.print("Третья строка: ");
            String str3 = scanner.next();

            Main2<String> stringTriplet = new Main2<>(str1, str2, str3);
            System.out.println("\nКортеж: " + stringTriplet);
            System.out.print("Введите строку для проверки наличия в кортеже: ");
            String checkStr = scanner.next();
            System.out.println("Содержит? " + stringTriplet.contains(checkStr));
            System.out.println("Наименьший элемент: " + stringTriplet.min());
            System.out.println("Сложение элементов: " + stringTriplet.sum());
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Введите корректную строку.");
        }

        scanner.close();
    }
}
