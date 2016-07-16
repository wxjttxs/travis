package program;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class AnserGeneratorTest {
    @Test
    public void should_return_1234_given_sequences_1_2_3_4_5(){

        Randomstub randomNumber = new Randomstub();
        randomNumber.add(1);
        randomNumber.add(2);
        randomNumber.add(3);
        randomNumber.add(4);
        randomNumber.add(5);

        String number=new AnswerGenerator(randomNumber).getNumber();

        assertEquals("1234",number);
    }

    @Test
    public void should_return_1234_given_sequences_1_1_2_3_4_5(){

        Randomstub randomNumber = new Randomstub();
        randomNumber.add(1);
        randomNumber.add(1);
        randomNumber.add(2);
        randomNumber.add(3);
        randomNumber.add(4);
        randomNumber.add(5);

        String number=new AnswerGenerator(randomNumber).getNumber();

        assertEquals("1234",number);
    }
}
