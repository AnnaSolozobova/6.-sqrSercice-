package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void RangeThatReturnsNumbers() {
        SQRService service = new SQRService();

        int actual = service.countSqr(300, 500);

        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RangeThatIsNotReturnsNumbers() {
        SQRService service = new SQRService();

        int actual = service.countSqr(10000, 15000);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RangeOfNegativeNumbers() {
        SQRService service = new SQRService();

        int actual = service.countSqr(-1000, -100);

        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void RangeWithPositiveLimitValues() {
        SQRService service = new SQRService();

        int actual = service.countSqr(100, 9801);

        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void RangeWithNegativeLimitValues() {
        SQRService service = new SQRService();

        int actual = service.countSqr(99, 9802);

        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

}
