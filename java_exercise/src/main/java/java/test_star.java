/**
 * Created by Administrator on 2016/9/9.
 */
/**型图形练习*/
import java.util.Scanner;
public class test_star {
    public static void main(String[] args){
        String star = "*";
        String space = " ";
        String str = "";
        Scanner index = new Scanner (System.in);
        System.out.print("输入菱形的行：");
        int line = index.nextInt();
        if(line % 2==0){
            System.out.println("偶数行无法画出菱形！");
        }
        else{
            int midline=(int)Math.ceil(line/2);//中间行
            for (int a=0;a<=midline;a++){
                String spacetemp = "";
                int num_space = (line-1)/2;//起始空格数
                String startemp = "";
                int num_star;//*数
                for(num_space=(line-1)/2-a;num_space>0;num_space--){
                    spacetemp = spacetemp+space;
                }
                for(num_star= 2*a+1;num_star>0;num_star--){
                    startemp = startemp+star;
                }
                str = str+spacetemp+startemp+"\n";
            }
            for(int b=1;b<=line-midline-1;b++){
                String spacetemp = "";
                int num_space =1;//起始空格数
                String startemp = "";
                int num_star;//*数
                for(num_space=1;num_space<=b;num_space++){
                    spacetemp = spacetemp+space;
                }
                for(num_star= (line-b*2);num_star>0;num_star--){
                    startemp = startemp+star;
                }
                str = str+spacetemp+startemp+"\n";
            }
            System.out.println(str);
        }

        /**型直角*/
        Scanner side = new Scanner (System.in);
        System.out.print("输入直角三角形的行：");
        int sideline = side.nextInt();
        String startemp = "";
        int num_star;//*数
        str="";
        for(num_star=1;num_star<=sideline;num_star++){
            startemp = startemp+star;
            str = str+startemp+"\n";
        }
        System.out.println(str);
    }
}
