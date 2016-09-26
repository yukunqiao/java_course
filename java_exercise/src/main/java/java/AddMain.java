/**
 * Created by Administrator on 2016/9/18.
 */
import java.util.Scanner;
public class AddMain {
    public static void main(String[] args) {
        /*int num1 = 11;
        int num2 = 22;
        double num3 = 11.00;
        double num4 = 22.00;
        String num5 = "11";
        String num6 = "22";
        AddSum sum = new AddSum(num1,num2);
        AddSum sum1 = new AddSum(num3,num4);
        AddSum sum2 = new AddSum(num5,num6);*/


        System.out.print("输入的类型是：1、int  2、double  3、String");
        Scanner index = new Scanner(System.in);
        int choose = index.nextInt();

        System.out.print("请输入两个相加的数字或字符：");
        Scanner index1 = new Scanner(System.in);
        Scanner index2 = new Scanner(System.in);
        switch (choose){
            case 1:
                int num1 = index1.nextInt();
                int num2 = index2.nextInt();
                AddSum sum1 = new AddSum(num1,num2);
                break;
            case 2:
                double num3 = index1.nextDouble();
                double num4 = index2.nextDouble();
                AddSum sum2 = new AddSum(num3,num4);
                break;
            case 3:
                String num5 = index1.next();
                String num6 = index2.next();
                AddSum sum3 = new AddSum(num5,num6);
        }
    }
}
