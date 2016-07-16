package program;

import java.util.ArrayList;

/**
 * Created by xiaojing on 2016/7/9.
 */
public class Randomstub {
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    public void add(int i) {
        numbers.add(i);
    }
    public Integer next() {

        return numbers.remove(0);
    }
}
