package program;

import org.junit.Test;

import java.util.Random;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class RandomNumberTest {
    public static void print(int[] array){
        for(int i=0;i<4;i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getRandom4Numbers(){
        int[] hashtable=new int[4];
        int[] output=new int[4];

        Random random=new Random();
        random.setSeed(1);
        for(int i=0;i<4;i++){
            int num=random.nextInt(10);
            while(hashtable[num]>0){
                num=random.nextInt(10);
            }

            output[i]=num;
            hashtable[num]=1;
        }
        return output;
    }


}
