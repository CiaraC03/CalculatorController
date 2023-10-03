package ie.atu.calculatorcontroller;

import lombok.Getter;
import lombok.Setter;

public class Operations {

    private int total;
    private String operation;

    public Operations(int total, String operation) {
        this.total = total;
        this.operation = operation;
    }

    //public Operations(String operationChose, int sum) {
    //}

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    // constructor








}
