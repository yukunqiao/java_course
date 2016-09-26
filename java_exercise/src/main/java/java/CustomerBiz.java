/**
 * Created by Administrator on 2016/9/13.
 */
import java.util.Scanner;
public class CustomerBiz {
    String customName = "";
    void addName(String name){
        customName = customName + "  "+ name;
    }
    void showNames(){

        System.out.println(customName);
    }
    public static void main(String[] args){
        CustomerBiz customerName = new CustomerBiz();
        for(int i = 1; ; i++){
            Scanner Cname = new Scanner(System.in);
            System.out.print("请输入客户姓名：");
            String newName = Cname.next();
            System.out.print("继续输入吗？（y/n）");
            Scanner judge = new Scanner (System.in);
            String isin = judge.next();
            customerName.addName(newName);

            if (isin.equals("n")){
                break;
            }
        }
        System.out.println("*****************************");
        System.out.println("      客户姓名列表    ");
        System.out.println("*****************************");
        customerName.showNames();
    }
}
