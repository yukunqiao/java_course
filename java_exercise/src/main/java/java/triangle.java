/**
 * Created by Administrator on 2016/9/13.
 */
import java.util.Scanner;
public class triangle {
    void star(int high, String sign){
        int num_star;//*数
        String startemp = "";
        String str = "";
        for (num_star = 1; num_star <= high; num_star ++) {
            startemp = startemp + sign;
            str = str + startemp + "\n";
        }
        System.out.println(str);
    }
    public static  void main(String[] args) {
        triangle newtriangle = new triangle();
        System.out.print("输入行高：");
        Scanner side = new Scanner(System.in);
        int high = side.nextInt();
        System.out.print("输入打印的字符：");
        Scanner character = new Scanner(System.in);
        String sign = character.next();
        newtriangle.star(high,sign);

    }
}
