import java.util.Scanner;

public class Dollar implements MoneyExchange{
    private String currencyTo;

    public Dollar(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @Override
    public void exchangeTo(Scanner scanner) {
        System.out.println("Введите сумму в долларах:");
        double amount = scanner.nextDouble();
        switch (currencyTo) {
            case "Тенге":
                System.out.println("Сумма в тенге: " + amount * 450);
                break;
            case "Евро":
                System.out.println("Сумма в евро: " + amount * 0.93);
                break;
            case "Рубли":
                System.out.println("Сумма в рублях: " + amount * 92);
                break;
            default:
                System.out.println("Неизвестная валюта");
                break;
        }
    }
}
