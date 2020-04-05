package bin;
import java.util.Scanner;
/**
 * @author 刘佳航
 * @date 2020/3/30  7:37
 */
public class yunsuan{
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("输入你的算式");
        String formula = user_input.next();
        for (int i=0;i<formula.length()-1;i++){//遍历运算符
            char operator = formula.charAt(i);
            if (operator == '+'){
                Run input = new Jia();

                String number1 = formula.substring(0,i);//截取运算数字
                String number2 = formula.substring(i+1,formula.length());
                Shu numb = new Shu();
                input.setNumber1(numb.tijiao(number1));//将运算数字转型为float
                input.setNumber2(numb.tijiao2(number2));
                System.out.println(input.getNumber3());
                break;
            }else {
                if (operator == '-'){
                    Run input2 = new Jian();
                    String subtracted = formula.substring(0,i);
                    String minus = formula.substring(i+1,formula.length());
                    Shu numb2 = new Shu();
                    input2.setNumber1(numb2.tijiao(subtracted));
                    input2.setNumber2(numb2.tijiao2(minus));
                    System.out.println(input2.getNumber3());

                    break;
                }else{
                    if (operator == '*'){
                        Run input3 = new Cheng();
                        String multiplier1 = formula.substring(0,i);
                        String multiplier2 = formula.substring(i+1,formula.length());
                        Shu numb3 = new Shu();
                        input3.setNumber1(numb3.tijiao(multiplier1));
                        input3.setNumber2(numb3.tijiao2(multiplier2));
                        System.out.println(input3.getNumber3());
                    }else{
                        if (operator == '/'){
                            Run input4 = new Chu();
                            String dividend = formula.substring(0,i);
                            String divisor = formula.substring(i+1,formula.length());
                            Shu numb4 = new Shu();
                            input4.setNumber1(numb4.tijiao(dividend));
                            input4.setNumber2(numb4.tijiao2(divisor));
                            System.out.println(input4.getNumber3());
                        }
                    }
                }
            }
        }
    }
}
abstract class Run {
    double number1;
    double number2;
    double number3;
    public abstract double getNumber3();//运算的方法
    public abstract void setNumber1(float number1);
    public abstract void setNumber2(float number2);
}
class Jia extends Run {
    @Override//加法方法
    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    @Override
    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    @Override
    public double getNumber3() {
        number3 = number1 + number2;
        return number3;
    }
}
class Jian extends Run{
    @Override//减法方法
    public void setNumber1(float number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(float number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        number3 = number1 - number2;
        return number3;
    }
}
class Cheng extends Run{
    @Override//乘法方法
    public void setNumber1(float number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(float number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        number3 = number1*number2;
        return number3;
    }
}
class Chu extends Run{
    @Override//除法方法
    public void setNumber1(float number1){
        this.number1 = number1;
    }
    @Override
    public void setNumber2(float number2){
        this.number2 = number2;
    }
    @Override
    public double getNumber3(){
        number3 = number1/number2;
        return number3;
    }
}
class Shu {
    float num;//运算数字转型方法
    float num2;
    public float tijiao(String number1) {
        num = Float.parseFloat(number1);
        return num;
    }
    public float tijiao2(String number2){
        num2 = Float.parseFloat(number2);
        return num2;
    }
}
