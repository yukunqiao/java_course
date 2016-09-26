import java.math.BigInteger;

/**
 * Created by Administrator on 2016/9/8.
 */
public class count10000 {
    public static void main (String[] args){
        /*计算10000以内（含10000）的奇数、偶数、质数、合数的和、积、平均值*/
        int num=0;
        int index;//计数
        /*求10000内的奇数和、积、平均值*/
        int sum_odd=0;//奇数和
        BigInteger product_odd = BigInteger.valueOf(1);//奇数积
        double aver_odd;//奇数平均值
        index=0;
        for(num=1;num<=10000;num=num+2){
            sum_odd+=num;
            product_odd=product_odd.multiply(BigInteger.valueOf(num));
            index++;
        }
        aver_odd=sum_odd/index;
        System.out.println("10000以内（包括10000）的奇数和="+ sum_odd+"，\n奇数积="+product_odd.toString()+"，\n奇数平均值="+aver_odd);
        /*求10000内的偶数和、积、平均值(不包括0)*/
        int sum_even=0;//偶数和
        BigInteger product_even = BigInteger.valueOf(1);//偶数积
        double aver_even;//偶数平均值
        index=0;
        for(num=2;num<=10000;num=num+2){
            sum_even+=num;
            product_even = product_even.multiply(BigInteger.valueOf(num));
            index++;
        }
        aver_even=sum_even/index;
        System.out.println("10000以内（包括10000）的偶数和="+ sum_even+"，\n偶数积="+product_even.toString()+"，\n偶数平均值="+aver_even);
        /*求10000内的质数和、积、平均值*/
        int sum_prime=2;//质数和
        BigInteger product_prime = BigInteger.valueOf(1);//质数积
        double aver_prime;//质数平均值
        index=1;
        for(num=3;num<=10000;num++) {
            boolean a=true;
            for(int divid=2;divid<num; divid++){
                if(num % divid==0){
                    a=false;
                    break;
                }
            }
            if(a==true){
                sum_prime=sum_prime+num;
                product_prime=product_prime.multiply(BigInteger.valueOf(num));
                index++;}
        }
        aver_prime=sum_prime/(index);
        System.out.println("10000以内（包括10000）的质数和="+ sum_prime+"，\n质数积="+product_prime.toString()+"，\n质数平均值="+aver_prime);
        /*求10000内的合数和、积、平均值*/
        /*合数积出现错误*/
        int sum_composite=0;//合数和
        BigInteger product_composite = BigInteger.valueOf(1);//合数积
        double aver_composite;//和数平均值
        index=0;
        for(num=4;num<=10000;num++) {
            boolean a=false;
            for(int divid=2;divid<num; divid++){
                if(num % divid==0){
                    a=true;
                    break;
                }
            }
            if(a==true){
                sum_composite=sum_composite+num;
                product_composite=product_composite.multiply(BigInteger.valueOf(num));
                index++;}
        }
        aver_composite=sum_composite/index;
        System.out.println("10000以内（包括10000）的合数和="+ sum_composite+"，\n合数积="+product_composite.toString()+"，\n合数平均值="+aver_composite);
        /*求10000内能被137整除的奇数、偶数的和*/
        int sum_odd137=0;//奇数和
        int sum_even137=0;//偶数和
        for(num=1;num<=10000;num++){
                if(num % 137==0){
                    if(num%2!=0){
                        sum_odd137=sum_odd137+num;}
                    else{
                        sum_even137=sum_even137+num;}
                }
        }
        System.out.println("10000以内（包括10000）中能被137整除的奇数和="+ sum_odd137+"，\n偶数和="+sum_even137);
        /*求10000内能被13、15同时整除的数字和*/
        int sum_1315=0;//数字和
        for(num = 1; num <= 10000; num++){
            if((num % 13 == 0) && (num % 15 == 0)){
                sum_1315  = sum_1315 + num;
            }
        }
        System.out.println("10000以内（包括10000）中能被13、15同时整除的数字和" + sum_1315);
    }
}
