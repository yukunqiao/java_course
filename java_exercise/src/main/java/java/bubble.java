/**
 * Created by Administrator on 2016/9/12.
 */
/*冒泡排序*/
public class bubble {
    public static  void main(String[] args){
        int[] intArray = {1,5,8,4,6,2};
        int temp;
        for(int i = 0; i < intArray.length; i ++){
            for(int j = i+1; j < intArray.length; j ++){
                if(intArray[i] > intArray[j]){
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
            System.out.print(intArray[i]+" ");
        }
    }
}
