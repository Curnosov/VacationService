package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {

    @Test
    void shouldCalculateRestMonthsForFirstExample() {
        VacationService service = new VacationService();

        // Подготавливаем данные
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3; // Ожидаемый результат: 3 месяца отдыха

        // Вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // Проверяем результат
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRestMonthsForSecondExample() {
        VacationService service = new VacationService();

        // Подготавливаем данные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2; // Ожидаемый результат: 2 месяца отдыха

        // Вызываем метод
        int actual = service.calculate(income, expenses, threshold);

        // Проверяем результат
        Assertions.assertEquals(expected, actual);
    }
}