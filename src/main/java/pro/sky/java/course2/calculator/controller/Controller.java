package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculateService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculateService calculateService;

    public Controller(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String sayHello() {
        return ("Добро пожаловать в калькулятор!");
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam int num1,
                         @RequestParam int num2) {
        return (num1 + " + " + num2 + " = " + calculateService.getSum(num1, num2));

    }

    @GetMapping("/minus")
    public String getDifference(@RequestParam int num1,
                                @RequestParam int num2) {
        return (num1 + " - " + num2 + " = " + calculateService.getDifference(num1, num2));

    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam int num1,
                              @RequestParam int num2) {
        int multiply = num1 * num2;
        return (num1 + " * " + num2 + " = " + calculateService.getMultiply(num1, num2));

    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam int num1,
                            @RequestParam int num2) {
        if (num2 != 0) {
            return (num1 + " / " + num2 + " = " + calculateService.getDivide(num1, num2));
        } else return "Деление на ноль запрещено";

    }


}
