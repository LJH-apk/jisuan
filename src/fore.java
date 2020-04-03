import java.nio.charset.IllegalCharsetNameException;

/**
 * @author 刘佳航
 * @date 2020/3/31  20:40
 */
public class fore {
    public static void main(String[] args){
        WYZ input = new WYZ();
        System.out.println(input.setNumber(4));

    }
}
class WYZ{
    private int number;
    public int setNumber(int number){
        this.number = number;
        return number;
    }
}
