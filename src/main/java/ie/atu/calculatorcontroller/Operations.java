package ie.atu.calculatorcontroller;

import java.util.Scanner;

public class Operations {

    int num1, num2, total;
    String operation;

    public Operations(int num1, int num2, String operation)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public String getOperation(){
        return operation;
    }



    //addition function
    public int add()
    {
        total = num1+num2;
        return total;
    }

    //division function
    public float divide()
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
