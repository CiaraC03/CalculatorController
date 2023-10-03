package ie.atu.calculatorcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter

public class Operations {

    int num1, num2, total;
    String operation;

    public Operations(int total) {
        this.total = total;
    }

    // constructor
    public Operations(int num1, int num2, String operation)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }



    //addition function
    public int add()
    {
        //how to return two different variables
        //operation = add;
        total = num1+num2;

        return total;
    }

    //division function
    public int divide()
    {
        total = num1/num2;
        return total;
    }

    //subtract function
    public int subtract()
    {
        total = num1 - num2;
        return total;
    }

    //multiply function
    public int multiply()
    {
        total = num1 * num2;
        return total;
    }




}
