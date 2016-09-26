/**
 * Created by Administrator on 2016/9/8.
 */
/*计算100以内（包括100）的偶数之和*/
public class sum100 {
    public static void main(String[] args){
        int num=0;
        int sum=0;
        while(num<=100){
            sum=sum+num;
            num=num+2;
        }
        System.out.println("100以内（包括100）的偶数之和："+ sum);
    }
}
