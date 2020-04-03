package first;
import java.util.Scanner;
/**
 * @author 刘佳航
 * @date 2020/3/31  9:55
 */
public class jisuan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("计算器");
        System.out.println("1/加 2/减 3/乘 4/除");
        System.out.println("请选择你的运算方法");
        int xuan = input.nextInt();
        if (xuan == 1){
            System.out.println("请输入第一个数字");
            double number1 = input.nextDouble();
            System.out.println("请输入第二个数字");
            double number2 = input.nextDouble();
            System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
        }else{
            if (xuan == 2){
                System.out.println("请输入第一个数字");
                double number3 = input.nextDouble();
                System.out.println("请输入第二个数字");
                double number4 = input.nextDouble();
                double number5 = number3-number4;
                System.out.println(number3 + "-" + number4 + "=" + number5);
            }else {
                if (xuan == 3){
                    System.out.println("请输入第一个数字");
                    double number6 = input.nextDouble();
                    System.out.println("请输入第二个数字");
                    double number7 = input.nextDouble();
                    System.out.println(number6 + "×" + number7 + "=" + (number6*number7));
                }else {
                    if (xuan == 4){
                        System.out.println("请输入第一个数字");
                        double number8 = input.nextDouble();
                        System.out.println("请输入第二个数字");
                        double number9 = input.nextDouble();
                        System.out.println(number8 + "÷" + number9 + "=" + (number8/number9));
                    }
                }
            }
        }
    }
}
