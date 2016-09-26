/**
 * Created by Administrator on 2016/9/7.
 */
import java.util.Scanner;
public class java3 {
    public static void main(String[] args){
        /*Scanner java = new Scanner (System.in);
        Scanner music = new Scanner (System.in);
        System.out.print("输入张浩的JAVA成绩：");
        int score_java=java.nextInt();
        System.out.print("输入张浩的MUSIC成绩：");
        int score_music=music.nextInt();
        if((score_java>98&&score_music>80)||(score_java==100&&score_music>70)){
            System.out.println("老师说：不错，奖励一个MP4");
        }*/

        /*Scanner number1 = new Scanner (System.in);
        Scanner number2 = new Scanner (System.in);
        System.out.print("输入数字a：");
        int a=number1.nextInt();
        System.out.print("输入数字b：");
        int b=number2.nextInt();
        if((a%b==0)||(a+b>1000)){
            System.out.println("输出数字a:" +a);
        }
        else{
            System.out.println("输出数字b：" +b);
        }*/

        /*int age = 10;
        if(age==20){
            System.out.printf("q");
        }*/

        /*Scanner number1 = new Scanner (System.in);
        Scanner number2 = new Scanner (System.in);
        System.out.print("输入年龄：");
        int age=number1.nextInt();
        System.out.print("输入性别：");
        String sex=number2.next();
        if((age>=7)||(age>=5&&(sex=="男"))){
            System.out.println("他能够搬动桌子");
        }*/

        /*Scanner index = new Scanner (System.in);
        System.out.print("输入坏鸡蛋数量：");
        int number=index.nextInt();
        if(number < 5){
            System.out.println("忍了！吃掉算了！");
        }
        else{
            System.out.println("退货");
        }*/

        /*Scanner number = new Scanner (System.in);
        System.out.print("输入任意整数：");
        int index=number.nextInt();
        if((index%3==0)||(index%5==0)){
            System.out.println("该数是3或5的倍数");
        }
        else{
            System.out.println("该数不能被3或5中的任何一个数整除");
        }*/

        /*Scanner number1 = new Scanner (System.in);
        Scanner number2 = new Scanner (System.in);
        System.out.print("输入数字a：");
        int a=number1.nextInt();
        System.out.print("输入数字b：");
        int b=number2.nextInt();
        System.out.println(((a%b==0)||(a+b>100))?("输出数字a:" +a): ("输出数字b：" +b));*/

        /*Scanner grade = new Scanner (System.in);
        System.out.print("输入结业考试成绩");
        int score = grade.nextInt();
        if(score>=90){
            System.out.println("优秀");
        }
        else if(score>=80){
            System.out.println("良好");
        }
        else if(score>=60){
            System.out.println("中等");
        }
        else {
            System.out.println("差");
        }*/

        /*Scanner money = new Scanner (System.in);
        System.out.print("输入银行存款(万)：");
        int number = money.nextInt();
        if(number>500){
            System.out.println("买凯迪拉克");
        }
        else if(number>100){
            System.out.println("买帕萨特");
        }
        else if(number>50){
            System.out.println("买依兰特");
        }
        else if(number>10){
            System.out.println("买奥托");
        }
        else {
            System.out.println("买捷安特");
        }*/

        /*Scanner money = new Scanner (System.in);
        System.out.print("输入压岁钱数目(元)：");
        int number = money.nextInt();
        if(number>=1000){
            System.out.println("捐助失学儿童");
        }
        else if(number>=500){
            System.out.println("购买航模");
        }
        else{
            System.out.println("购买百科全书");
        }*/

        /*Scanner grade = new Scanner (System.in);
        System.out.print("输入考试成绩");
        int score = grade.nextInt();
        if(score>=90){
            System.out.println("父亲给小明买辆车");
        }
        else if(score>=80){
            System.out.println("母亲给小明买台笔记本电脑");
        }
        else if(score>=60){
            System.out.println("母亲给小明买部手机");
        }
        else {
            System.out.println("没有礼物");
        }*/

        /*Scanner money = new Scanner (System.in);
        Scanner VIP =new Scanner(System.in);
        System.out.print("请输入消费金额(元)：");
        double number=money.nextDouble();
        System.out.println("请选择：（1）是会员 （2）不是会员");
        int vip=VIP.nextInt();
        if(vip==1) {
            if (number >= 200) {
                System.out.println("打折后的消费金额为：" + number * 0.75);
            }
            else if (number >= 100) {
                System.out.println("打折后的消费金额为：" + number * 0.80);
            }
            else {
                System.out.println("消费金额不足100元，不予以打折。消费金额为："+ number);
            }
        }
        else{
            if (number >= 100) {
                    System.out.println("打折后的消费金额为：" + number * 0.90);
                }
            else {
                    System.out.println("消费金额不足100元，不予以打折。消费金额为：" + number);
                }
        }*/

        /*Scanner money = new Scanner (System.in);
        Scanner VIP =new Scanner(System.in);
        Scanner integral =new Scanner(System.in);
        System.out.print("请输入购买商品的价格(元)：");
        double number=money.nextDouble();
        System.out.println("请选择：（1）会员 （2）非会员");
        int vip=VIP.nextInt();
        if(vip==1) {
            System.out.print("请输入会员积分：");
            int index =integral.nextInt();
            if (index>=8000) {
                System.out.println("您所购买的商品打6折，折扣后的商品价格为：" + number * 0.60);
            }
            else if (index>=4000) {
                System.out.println("您所购买的商品打7折，折扣后的商品价格为：" + number * 0.70);
            }
            else if (index>=2000) {
                System.out.println("您所购买的商品打8折，折扣后的商品价格为：" + number * 0.80);
            }
            else {
                System.out.println("您所购买的商品打9折，折扣后的商品价格为：" + number * 0.90);
            }
        }
        else{
            System.out.println("您所购买的商品打9.5折，折扣后的商品价格为：" + number * 0.95);
        }*/
        /*Scanner money = new Scanner (System.in);
        Scanner VIP =new Scanner(System.in);
        Scanner integral =new Scanner(System.in);
        System.out.print("请输入购买商品的价格(元)：");
        double number=money.nextDouble();
        System.out.println("请选择：（1）会员 （2）非会员");
        int vip=VIP.nextInt();
        if(vip==1) {
            System.out.print("请输入会员积分：");
            int index = integral.nextInt() / 2000;
            switch (index) {
                case 0:
                    System.out.println("您所购买的商品打9折，折扣后的商品价格为：" + number * 0.90);
                    break;
                case 1:
                    System.out.println("您所购买的商品打8折，折扣后的商品价格为：" + number * 0.80);
                    break;
                case 2:
                case 3:
                    System.out.println("您所购买的商品打7折，折扣后的商品价格为：" + number * 0.70);
                    break;
                default:
                    System.out.println("您所购买的商品打6折，折扣后的商品价格为：" + number * 0.60);
            }
        }
        else{
            System.out.println("您所购买的商品打9.5折，折扣后的商品价格为：" + number * 0.95);
        }*/

        /*int mingci =1;
        switch (mingci){
            case 1:System.out.println("获得第一名，奖励参加麻省理工大学组织的一个月夏令营");
                break;
            case 2:System.out.println("获得第二名，奖励惠普笔记本电脑一部");
                break;
            case 3:System.out.println("获得第三名，奖励移动硬盘一个");
                break;
            default:System.out.println("没有名次，没有奖励");
        }*/

        /*System.out.println("按1：拨爸爸的号");
        System.out.println("按2：拨妈妈的号");
        System.out.println("按3：拨爷爷的号");
        System.out.println("按4：拨奶奶的号");
        Scanner phone= new Scanner(System.in);
        System.out.println("请输入：");
        int number = phone.nextInt();
        switch(number){
            case 1:System.out.println("正在拨出爸爸的号");
                break;
            case 2:System.out.println("正在拨出妈妈的号");
                break;
            case 3:System.out.println("正在拨出爷爷的号");
                break;
            case 4:System.out.println("正在拨出奶奶的号");
                break;
            default:System.out.println("该数字未设置自动拨号");
        }*/

        /*Scanner money=new Scanner(System.in);
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
        }*/

        //int index=1;
        /*for(;index<=100;index++){
            System.out.println("第" +index +"遍写：好好学习，天天向上！");
        }*/
        /*while(index<=100){
            System.out.println("第" +index +"遍写：好好学习，天天向上！");
            index++;
        }*/

    }
}
