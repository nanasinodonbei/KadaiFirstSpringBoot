package com.techacademy;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{time}")
    public String dispTime(@PathVariable String time) {
        int a = Integer.parseInt(time.substring(0, 4));
        int b = Integer.parseInt(time.substring(5, 6));
        int c = Integer.parseInt(time.substring(7, 8));

        LocalDate date = LocalDate.of(a, b, c);
        String dayOfWeek = date.getDayOfWeek().toString();
        return dayOfWeek;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int plus = 0;
        plus = val1 + val2;
        return "計算結果：" + plus;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int min = 0;
        min = val1 - val2;
        return "計算結果：" + min;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int time = 0;
        time = val1 * val2;
        return "計算結果：" + time;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int div = 0;
        div = val1 / val2;
        return "計算結果：" + div;
    }

}
