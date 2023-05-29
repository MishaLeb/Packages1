package ru.netology.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class RestScheduleServiceParaTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void test(int income, int expenses, int threshold, int expected) {
        RestScheduleService service = new RestScheduleService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
