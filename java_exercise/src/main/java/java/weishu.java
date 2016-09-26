/**
 * Created by Administrator on 2016/9/9.
 */
import java.util.Scanner;
public class weishu {
    public static void main(String[] args){
        Scanner digit= new Scanner(System.in);
        System.out.print("输入任意整数：");
        long number = digit.nextLong();
        int index = 1;
        double consult=number/10;
        if(consult<1){
            System.out.println("输入的数字是1位数");
        }
        else if(consult>1&&consult<10){
            System.out.println("输入的数字是2位数");}
        else {
            index=index+1;
            while(consult>=10){
                consult=consult/10;
                index++;
            }
            System.out.println("输入的数字是"+index+"位数");
        }
    }
}
