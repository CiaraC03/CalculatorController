package ie.atu.calculatorcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorControl {


    //create calculate to enter two numbers and operation to get request from website
    @GetMapping("/calculate")
    public Operations calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
       // Operations operations = new Operations(num1, num2, operation);

        String operationChose = "";
        int sum = 0;

        switch(operation)
        {
            case "add":
                sum = num1 + num2;
                operationChose = "add";
                break;
            case "divide":
                sum = num1/num2;
                operationChose = "divide";
                break;
            case "subtract":
                sum = num1-num2;
                operationChose = "subtract";
                break;
            case "multiply":
                sum = num1*num2;
                operationChose = "multiply";
                break;

        }
        return  new Operations(operationChose,sum);
    }

    //return new Operations(operation, total);
}
