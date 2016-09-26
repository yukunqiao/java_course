/**
 * Created by Administrator on 2016/9/12.
 */
public class shulie {
    public static  void main(String[] args){
        int intArray [] = new int [150];
        intArray [0] = 1;
        intArray [1] = 1;
        for(int i = 2; i < intArray.length; i ++){
            intArray[i] = intArray[i-2] + intArray[i-1];
        }
        System.out.println("输出数组的第137位：" + intArray[136]);
    }
}
