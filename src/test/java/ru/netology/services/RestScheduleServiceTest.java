package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestScheduleServiceTest {

    @Test
    public void test () {
        RestScheduleService service = new RestScheduleService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2 () {
        RestScheduleService service = new RestScheduleService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }



}
