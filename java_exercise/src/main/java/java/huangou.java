/**
 * Created by Administrator on 2016/9/8.
 */
//java_3_31 综合运用嵌套if选择结构、switch选择结构、多重if选择结构进行实现商品换购功能
import java.util.Scanner;
public class huangou {
    public static void main(String[] args){
        Scanner money=new Scanner(System.in);
        Scanner huodong=new Scanner(System.in);
        System.out.print("请输入消费金额（元）：");
        double number =money.nextDouble();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50元，加2元可换购百事可乐饮料1瓶");
        System.out.println("2：满100元，加3元可换购500ml可乐1瓶");
        System.out.println("3：满100元，加10元可换购5公斤面粉");
        System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5：满200元，加20元可换购欧莱雅爽肤水1瓶");
        System.out.println("0：不换购");
        System.out.print("请选择：");
        int index =huodong.nextInt();
        switch (index){
            case 0:System.out.println("本次消费总金额：" +number +"\n不参加换购活动。");
                break;
            case 1:
                if(number>=50){
                    System.out.println("本次消费总金额：" +(number+2)+"\n成功换购：百事可乐一瓶");}
                else {
                    System.out.println("您当前消费金额不能参加该项换购活动。");}
                break;
            case 2:
                if(number>=100){
                    System.out.println("本次消费总金额：" +(number+3)+"\n成功换购：500ml可乐一瓶");}
                else {
                    System.out.println("您当前消费金额不能参加该项换购活动。");}
                break;
            case 3:
                if(number>=100){
                    System.out.println("本次消费总金额：" +(number+10)+"\n成功换购：5公斤面粉");}
                else {
                    System.out.println("您当前消费金额不能参加该项换购活动。");}
                break;
            case 4:
                if(number>=200){
                    System.out.println("本次消费总金额：" +(number+10)+"\n成功换购：苏泊尔炒菜锅一个");}
                else {
                    System.out.println("您当前消费金额不能参加该项换购活动。");}
                break;
            case 5:
                if(number>=200){
                    System.out.println("本次消费总金额：" +(number+20)+"\n成功换购：欧莱雅爽肤水一瓶");}
                else {
                    System.out.println("您当前消费金额不能参加该项换购活动。");}
                break;
            default:System.out.println("尚未开始其他换购活动");
        }
    }
}
