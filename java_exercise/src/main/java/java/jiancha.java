/**
 * Created by Administrator on 2016/9/8.
 */
/*为了帮助张浩尽快提高成绩，老师给他安排了每天的学习任务，其中上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
老师每天检查学习成果。如果不合格，则继续进行*/
/*检查合格--今天任务结束
检查不合格--继续今天任务
每天任务-上午、下午*/
import java.util.Date;
import java.util.Scanner;
public class jiancha {
    public static void main(String[] args){
        String task_am="阅读教材，学习理论知识";
        String task_pm="上机编程，掌握代码部分";
        System.out.println(new Date());
        Scanner a= new Scanner(System.in);
        System.out.print("今天检查结果：0 不合格 1 合格");
        int resault = a.nextInt();
        while(resault==0) {
            System.out.println(task_am + task_pm);
            System.out.print("今天检查结果：0 不合格 1 合格");
            resault = a.nextInt();
        }
        System.out.println("今天任务完成");
    }
}
