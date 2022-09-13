package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class AddOperator extends Operator{
    @Override
    public int priority(){
        return 1;
    } //return 2
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo){
        Operand total = new Operand(operandOne.getValue() + operandTwo.getValue());
        return total;
    }
}