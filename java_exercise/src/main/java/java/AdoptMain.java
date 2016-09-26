/**
 * Created by Administrator on 2016/9/18.
 */
import  java.util.Scanner;
public class AdoptMain {
    public static void main(String[] args) {
        System.out.println("欢迎来到宠物店");

        Scanner name = new Scanner(System.in);
        System.out.print("请输入要领养宠物的名字：");
        String petName = name.next();

        Scanner number = new Scanner(System.in);
        System.out.print("请选择要领养的宠物类型（1.狗狗    2.企鹅）：");
        int index = number.nextInt();

        if(index == 1){
            AdoptDog dog = new AdoptDog();
            dog.name = petName;
            Scanner varity = new Scanner(System.in);
            System.out.print("请选择狗的品种（1.聪明的拉布拉多犬    2.酷酷的雪纳瑞）：");
            int strain = varity.nextInt();

            if(strain == 1){
                dog.strain = "聪明的拉布拉多犬";
            }
            else{
                dog.strain = "酷酷的雪纳瑞";
            }
            System.out.println("请输入狗狗的健康值（1~100之间）：");
            Scanner health = new Scanner(System.in);
            int petHealth = health.nextInt();
            dog.health = petHealth;

            dog.print();
        }

        else{
            AdoptPenguin penguin = new AdoptPenguin();
            penguin.name = petName;
            Scanner sex = new Scanner(System.in);
            System.out.print("请选择企鹅性别（1.Q仔    2.Q妹）：");
            int petsex = sex.nextInt();

            if(petsex == 1){
                penguin.sex = "Q仔";
            }
            else{
                penguin.sex = "Q妹";
            }

            System.out.println("请输入企鹅的健康值（1~100之间）：");
            Scanner health = new Scanner(System.in);
            int petHealth = health.nextInt();
            penguin.health = petHealth;

            penguin.print();
        }
    }
}
