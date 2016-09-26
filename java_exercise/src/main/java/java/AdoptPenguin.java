/**
 * Created by Administrator on 2016/9/18.
 */
public class AdoptPenguin {
    String name;
    String sex;
    int health;
    int love = 0;

    void print(){
        if(health > 100 || health < 0){
            health = 60;
            System.out.println("健康值应该在0~100之间，默认值是" + health);
        }
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫"+ name +"，我的健康值是"+ health +"，我和主人的亲密程度是"+ love +"，我的性别是"+ sex);
    }
}
