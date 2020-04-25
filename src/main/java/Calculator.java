import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;

public class Calculator {
    public int calc(int a, int b, char op){
        int result = 0;
        switch(op){
            case '+':
                result= a+b;
                break;
            case '-':
                result= a-b;
                break;
            case '*':
                result= a*b;
                break;
            case '/':
                result= a/b;
                break;
        }
        return result;
    }
}
