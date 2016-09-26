/**
 * Created by Administrator on 2016/9/8.
 */
import java.util.Scanner;
public class switch_text {
    public static void main(String[] args){
        /*韩嫣参加计算机编程大赛
        如果获得第一名，将参加麻省理工大学组织的1个月夏令营
        如果获得第二名，将奖励惠普笔记本电脑一部
        如果获得第三名，将奖励移动硬盘一个
        否则，不给任何奖励*/
        int mingci =1;
        switch (mingci){
            case 1:System.out.println("获得第一名，奖励参加麻省理工大学组织的一个月夏令营");
                break;
            case 2:System.out.println("获得第二名，奖励惠普笔记本电脑一部");
                break;
            case 3:System.out.println("获得第三名，奖励移动硬盘一个");
                break;
            default:System.out.println("没有名次，没有奖励");
        }

        /*张三为他的手机设定了自动拨号
        按1：拨爸爸的号
        按2：拨妈妈的号
        按3：拨爷爷的号
        按4：拨奶奶的号*/
        System.out.println("按1：拨爸爸的号");
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
        }
    }
}
