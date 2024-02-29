import java.util.Scanner;

public class Ruble implements MoneyExchange{
    private String currencyTo;

    public Ruble(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @Override
    public void exchangeTo(Scanner scanner) {
        System.out.println("Введите сумму в рублях:");
        double amount = scanner.nextDouble();
        switch (currencyTo) {
            case "Тенге":
                System.out.println("Сумма в тенге: " + amount / 5);
                break;
            case "Доллар":
                System.out.println("Сумма в долларах: " + amount / 92);
                break;
            case "Евро":
                System.out.println("Сумма в евро: " + amount * 99);
                break;
            default:
                System.out.println("Неизвестная валюта");
                break;
        }
    }
}
