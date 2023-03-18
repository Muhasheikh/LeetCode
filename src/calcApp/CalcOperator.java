package calcApp;

public class CalcOperator implements Calculator{
    @Override
    public int calculate(int num1, int num2, char operator) {

        while (operator=='+'||operator=='-'){

            if(operator=='+'){
                return num1+num2;
            }

            if(operator=='-'){
                return num1- num2;
            }
        }

        return -1;
    }
}
