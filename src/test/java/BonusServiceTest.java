import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit () {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimit () {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 5000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}

