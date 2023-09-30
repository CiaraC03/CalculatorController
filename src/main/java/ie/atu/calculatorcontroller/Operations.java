package ie.atu.calculatorcontroller;

public class Operations {

    int total;

    //addition function
    public int add(int num1, int num2)
    {
        total = num1+num2;
        return total;
    }

    //division function
    public float divide(int num1, int num2)
    {
        total = num1/num2;
        return total;
    }

    //subtract function
    public int subtract(int num1, int num2)
    {
        total = num1 - num2;
        return total;
    }

    //multiply function
    public int multiply(int num1, int num2)
    {
        total = num1 * num2;
        return total;
    }


}
