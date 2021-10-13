import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @Test
    void shouldCalculateRegisteredAndBonusUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        // подготавлваем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate (amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
      assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndBonusOverLimit() {
        BonusMilesService service = new BonusMilesService();

        // подготавлваем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate (amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndBonusUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        // подготавлваем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate (amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndBonusOverLimit() {
        BonusMilesService service = new BonusMilesService();

        // подготавлваем данные:
        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate (amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}