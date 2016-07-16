package program;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class NumberComparer {

    public String compare(String systemInput, String userInput)
    {
//        String s="A0B";

        int numberOfA=getNumberOfA(systemInput,userInput);

//       return numberOfA+s;


        int numberOfB=getNumberOfB(systemInput,userInput);
        return numberOfA+"A"+numberOfB+"B";
    }

    private int getNumberOfB(String systemInput, String userInput) {
        int numberOfB=0;
        if(systemInput.charAt(0)==userInput.charAt(1))
            numberOfB=1;
        return numberOfB;

    }

    private int getNumberOfA(String systemInput,String userInput){
    int numberOfA=0;
    if(systemInput.charAt(0)==userInput.charAt(0)){
//            numberOfA= "1";
        numberOfA=1;
        if(systemInput.charAt(1)==userInput.charAt(1))
        {
//                numberOfA= "2";
            numberOfA=2;
            if(systemInput.charAt(2)==userInput.charAt(2)){
//                    numberOfA= "3";
                numberOfA=3;
                if(systemInput.charAt(3)==userInput.charAt(3)){
//                        numberOfA= "4";
                    numberOfA=4;
                }

            }
        }
    }
    return numberOfA;
}
}
