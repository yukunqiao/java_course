/**
 * Created by Administrator on 2016/9/18.
 */
import java.util.Scanner;
public class StuMain {
    public static  void main(String [] args){
        System.out.print("输入学生姓名：");
        Scanner name = new Scanner(System.in);
        String stuName = name.next();

        System.out.print("输入学生年龄：");
        Scanner age = new Scanner(System.in);
        int stuAge = age.nextInt();
        Stu student = new Stu(stuName,stuAge);
    }
}
