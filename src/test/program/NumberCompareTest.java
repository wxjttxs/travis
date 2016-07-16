package program;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class NumberCompareTest {
    @Test  // annotation
    public  void should_return_0A0B_given_1234_and_5678(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","5678");

        assertEquals("0A0B",result);
    }
    @Test  // annotation
    public  void should_return_1A0B_given_1234_and_1567(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","1567");

        assertEquals("1A0B",result);
    }

    @Test  // annotation
    public  void should_return_2A0B_given_1234_and_1256(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","1256");

        assertEquals("2A0B",result);
    }

    @Test  // annotation
    public  void should_return_3A0B_given_1234_and_1236(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","1236");

        assertEquals("3A0B",result);
    }

    @Test  // annotation
    public  void should_return_4A0B_given_1234_and_1234(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","1234");

        assertEquals("4A0B",result);
    }

    @Test  // annotation
    public  void should_return_0A1B_given_1234_and_5647(){
        NumberComparer compare=new NumberComparer();
        String result=compare.compare("1234","5178");

        assertEquals("0A1B",result);
    }
}
