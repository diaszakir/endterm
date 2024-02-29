import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valueInput = false;
        MoneyExchange m = null;
        String money = null;
        String money2 = null;
        while (!valueInput) {
            try {
                System.out.println("Добро пожаловать!\nВведите что вы хотите сделать:\n1.Выбрать валюту\n" +
                        "2.Рассчитать\nЧтобы выйти нажмите 0");
                int n = scan.nextInt();
                switch (n) {
                    case 1:
                        money = chooseCurrency();
                        money2 = chooseCurrency();
                        break;
                    case 2:
                        if (money != null && money2 != null) {
                            m = createMoneyOperation(money, money2);
                            if (m != null) {
                                m.exchangeTo(scan);
                            }
                        } else {
                            System.out.println("Вы не выбрали валюту!!!");
                        }
                        break;
                    case 0:
                        valueInput = true;
                        break;
                    default:
                        System.out.println("Введите номер!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите цифру!!!");
                scan.nextLine(); // clear the buffer
            }
        }

    }
    private static String chooseCurrency() {
        Scanner scan = new Scanner(System.in);
        String currency = null;
        System.out.println("Нажмите цифру чтобы выбрать валюту:\n1.Тенге\n2.Доллар\n3.Евро\n4.Рубли");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                currency = "Тенге";
                break;
            case 2:
                currency = "Доллар";
                break;
            case 3:
                currency = "Евро";
                break;
            case 4:
                currency = "Рубли";
                break;
            default:
                System.out.println("Введите цифру!");
                break;
        }
        return currency;
    }
    private static MoneyExchange createMoneyOperation(String currencyFrom, String currencyTo) {
        switch (currencyFrom) {
            case "Тенге":
                return new Tenge(currencyTo);
            case "Доллар":
                return new Dollar(currencyTo);
            case "Евро":
                return new Euro(currencyTo);
            case "Рубли":
                return new Ruble(currencyTo);
            default:
                System.out.println("Выбранная валюта не поддерживается");
                return null;
        }
    }
}
