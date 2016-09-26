/**
 * Created by Administrator on 2016/9/12.
 */
public class Student {
        String name;
        int age;
        String grade;
        String hobby;
        void show(){
            System.out.println("名字：" + name +"\n"+ "年龄：" + age+"\n" + "就读于：" + grade +"\n"+ "爱好：" + hobby);
        }
        public static void main(String[] args){
            Student zhanghao = new Student();
            zhanghao.name = "张浩";
            zhanghao.age = 10;
            zhanghao.grade = "s1班";
            zhanghao.hobby = "篮球";
            zhanghao.show();
        }
    }
