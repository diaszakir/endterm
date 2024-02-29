import java.util.Scanner;

public class Euro implements MoneyExchange{
    private String currencyTo;

    public Euro(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @Override
    public void exchangeTo(Scanner scanner) {
        System.out.println("Введите сумму в евро:");
        double amount = scanner.nextDouble();
        switch (currencyTo) {
            case "Тенге":
                System.out.println("Сумма в тенге: " + amount * 520);
                break;
            case "Доллар":
                System.out.println("Сумма в долларах: " + amount / 0.93);
                break;
            case "Рубли":
                System.out.println("Сумма в рублях: " + amount / 99);
                break;
            default:
                System.out.println("Неизвестная валюта");
                break;
        }
    }
}
