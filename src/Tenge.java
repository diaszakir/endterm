import java.util.Scanner;

public class Tenge implements MoneyExchange{
    private String currencyTo;

    public Tenge(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @Override
    public void exchangeTo(Scanner scanner) {
        System.out.println("Введите сумму в тенге:");
        double amount = scanner.nextDouble();
        switch (currencyTo) {
            case "Доллар":
                System.out.println("Сумма в долларах: " + amount / 450);
                break;
            case "Евро":
                System.out.println("Сумма в евро: " + amount / 480);
                break;
            case "Рубли":
                System.out.println("Сумма в рублях: " + amount / 5);
                break;
            default:
                System.out.println("Неизвестная валюта");
                break;
        }
    }
}
