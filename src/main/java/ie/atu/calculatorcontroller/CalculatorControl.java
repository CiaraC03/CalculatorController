package ie.atu.calculatorcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorControl {


    //create calculate to enter two numbers and operation to get request from website
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        return "Operation" + operation + ", your total is ";
    }
}
