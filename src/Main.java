import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int check = 100;     // Остаток на счету
        int replenishment = 1190;    // сумма пополнения
        int bonus = replenishment / 100;   // бонус

        if (replenishment >= 1000) {
            int positive = check + replenishment + bonus;
            System.out.println("Ваша сумма на счету составляет: ");
            System.out.println(positive + " руб.");

        } else {
            int negative = check + replenishment;
            System.out.println("Ваша сумма на счету составляет: ");
            System.out.println(negative + " руб.");

        }


    }
}