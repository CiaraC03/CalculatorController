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
        Operations operations = new Operations(num1, num2, operation);

        switch(operation)
        {
            case "add":
                operations.add();
                break;
            case "divide":
                operations.divide();
                break;
            case "subtract":
                operations.subtract();
                break;
            case "multiply":
                operations.multiply();
                break;

        }
        return  operation + ", your total is ";
    }

    //return new Operations();
}
