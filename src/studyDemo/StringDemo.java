package studyDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author StringDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class StringDemo {
    public static void main(String[] args) {
        String test = "##33####T55####";
        String[] split = test.split("#");
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : split) {
            if(s != ""){
                stringBuffer.append(s);
            }
        }
    }
}
