/**
 * Created by Administrator on 2016/9/12.
 */
import java.util.Scanner;
public class shuzu {
    public static  void main(String[] args){
        int intArray [] = {3,8,9,10,4,6,25,48};
        boolean a = false;
        Scanner num = new Scanner(System.in);
        System.out.println("请输入需要查找的数字：");
        int number = num.nextInt();
        for (int i = 0;i < intArray.length;i++){
            if(intArray[i]==number) {
                a = true;
                System.out.println(i);
            }
        }
        if(a == false){
            System.out.println("该数组内没有查找到您输入的数字");
        }
    }
}
