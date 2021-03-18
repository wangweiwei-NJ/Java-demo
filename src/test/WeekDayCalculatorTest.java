package test;

import demo.WeekDayCalculator;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;


public class WeekDayCalculatorTest {

    @Test
    public void calcDayTest() {
        for (int k = 1998; k < 1002010; k++) {
            Assert.assertEquals(WeekDayCalculator.getInstance().calcDay(k, 5, 31), LocalDate.of(k, 5, 31).getDayOfWeek().toString());
        }

//        System.out.println(WeekDayCalculator.getInstance().calcDay(1999, 3, 13));
//        System.out.println(LocalDate.of(1999, 3, 13).getDayOfWeek());
    }
}