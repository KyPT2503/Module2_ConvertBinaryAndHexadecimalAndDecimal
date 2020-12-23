import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Number number=new Number(171);
        System.out.println(number.decimalToBinary());
        System.out.println(number.decimalToHexadecimal());
    }
}

class Number {
    Stack<Character> digits = new Stack<Character>();
    private int number;

    public Number(int number) {
        this.number = number;
        while (number != 0) {
            digits.push((char) (number % 10 + 48));
            number /= 10;
        }
    }

    public String decimalToBinary() {
        Stack<Character> digits = new Stack<Character>();
        int number=this.number;
        while(number!=0){
            digits.push((char)(number%2+48));
            number/=2;
        }
        String result="";
        while(!digits.isEmpty()){
            result+=digits.pop();
        }
        return result;
    }

    public String decimalToHexadecimal() {
        Stack<Character> digits = new Stack<Character>();
        int number=this.number;
        while(number!=0){
            int ch=number%16;
            digits.push(ch<10?(char)(ch+48):(char)(ch+55));
            number/=16;
        }
        String result="";
        while(!digits.isEmpty()){
            result+=digits.pop();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Number{" +
                "digits=" + digits +
                '}';
    }
}