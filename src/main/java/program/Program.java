package program;


import java.util.Random;

public class Program {
//    public static void print(int[] array){
//        for(int i=0;i<4;i++){
//            System.out.println(array[i]);
//        }
//    }
//    public static int[] getRandom4Numbers(){
//        int[] hashtable=new int[10];
//
//
//        Random random=new Random();
////        random.setSeed(1);
//        for(int i=0;i<4;i++){
//            int num=random.nextInt(10);
//            while(hashtable[num]>0){
//                num=random.nextInt(10);
//            }
//
//            output[i]=num;
//            hashtable[num]=1;
//        }
//        return output;
//    }
    public static void main(String[] args) {
//        int []array=GetRandom4Numbers();
//        print(array);
        Random random=new Random();
        random.setSeed(1);
        int num=random.nextInt(10);
//        System.out.println(num);
    }
}
