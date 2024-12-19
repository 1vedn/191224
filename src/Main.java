import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
                int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.print("Введите целое число от 1 до 12 (или 0 для выхода): ");

                    try {
                        int monthIndex = scanner.nextInt();

                        if (monthIndex == 0) {
                            System.out.println("Выход из программы. До свидания!");
                            break;
                        }

                        System.out.println("Месяц: " + months[monthIndex - 1] + ", Количество дней: " + dom[monthIndex - 1]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Недопустимое число. Введите число от 1 до 12.");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Ошибка ввода. Введите целое число.");
                        scanner.next();
                    }
                }
                scanner.close();
            }
        }
