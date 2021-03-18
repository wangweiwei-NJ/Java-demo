package test;

import demo.WeekDayCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * WeekDayCalculator测试类
 *
 * @author great
 * @since 2021-03-10
 */

public class WeekDayCalculatorTest {

    @Test
    public void calcDayTestBetweenYears() {
        for (int k = 1998; k < 1002010; k++) {
            Assert.assertEquals(WeekDayCalculator.getInstance().calcDay(k, 5, 31), LocalDate.of(k, 5, 31).getDayOfWeek().toString());
        }
    }

    @Test
    public void calcDayTestByDay() {
        int[] dayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            for (int j = 1; j <= dayOfMonth[i]; j++) {
                Assert.assertEquals(WeekDayCalculator.getInstance().calcDay(2020, i+1, j), LocalDate.of(2020, i+1, j).getDayOfWeek().toString());
            }
        }
    }
}