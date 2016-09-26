/**
 * Created by Administrator on 2016/9/9.
 */
/*九九乘法表*/
public class timestables {
    public static void main(String[] args){
        int factor1=1;
        int factor2=1;
        for(factor1=1;factor1<=9;factor1++){
            for(factor2=1;factor2<=factor1;factor2++){
                System.out.print(factor2+"*"+factor1+"="+factor1*factor2+"   ");
            }
            System.out.print("\n");
        }
    }
}
