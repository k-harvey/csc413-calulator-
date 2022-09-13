package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

    @Override
    public int priority(){
        return 3;
    } //return 4

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo){
        Operand total = new Operand(power(operandOne.getValue(),operandTwo.getValue()));
        return total;
    }
    public int power(int i, int j){
        int total =i;
        for(int count =2; count <=j; count++){
            total = total *i;
        }
        return total;
    }
}