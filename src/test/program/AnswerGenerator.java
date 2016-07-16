package program;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class AnswerGenerator {


    private Randomstub randomNumber;

    public AnswerGenerator(Randomstub randomNumber) {

        this.randomNumber = randomNumber;
    }

    public String getNumber() {
        String numbers="";

        while(true){
            Integer next = randomNumber.next();
            boolean contains = numbers.contains("" + next);
            if(contains){

            }

           else{
//                Integer next = randomNumber.next();

                numbers+= next;
                if(numbers.length()==4)
                    break;
            }
        }

        return numbers;
    }
}
