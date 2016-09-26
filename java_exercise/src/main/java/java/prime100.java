/**
 * Created by Administrator on 2016/9/8.
 */
/*计算100以内（包括100）的素数之和*/
import java.util.Scanner;
public class prime100 {
    public static void main(String[] args){
        int num=2;
        int sum=2;
        int index=2;
        for(num=3;num<=100;num++) {
            boolean a=true;
            for(index=2;index<=(num-1); index++){
                if(num % index==0){
                    a=false;
                    break;
                }
            }
            if(a==true){
                sum=sum+num;}
        }
        System.out.println("100以内（包括100）的素数之和："+ sum);

    }
}
