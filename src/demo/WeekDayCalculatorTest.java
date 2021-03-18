package demo;


import org.junit.Test;

import java.time.LocalDate;

import static demo.WeekDayCalculator.calcDay;

class WeekDayCalculatorTest {

    @Test
    public void calcDayTest() {
        for (int k = 1998; k < 1002010; k++) {
            if (!calcDay(k, 5, 31).equals(LocalDate.of(k, 5, 31).getDayOfWeek().toString())) {
                System.out.println(k);
            }
        }

        System.out.println(calcDay(1999, 3, 13));
        System.out.println(LocalDate.of(1999, 3, 13).getDayOfWeek());
    }
}