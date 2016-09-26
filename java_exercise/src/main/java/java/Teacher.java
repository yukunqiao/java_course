/**
 * Created by Administrator on 2016/9/12.
 */
public class Teacher {
    String name;
    String major;
    String course;
    int school_age;
    void show(){
        System.out.println("名字：" + name +"\n" + "专业方向：" + major +"\n"+ "教授课程：" +course+"\n"+ "教龄：" + school_age);
    }
    public static void main(String[] args){
        Teacher teacher1 = new Teacher();
        teacher1.name = "王老师";
        teacher1.major = "计算机";
        teacher1.course = "使用JAVA语言理解程序逻辑";
        teacher1.school_age = 5;
        teacher1.show();
    }
}
