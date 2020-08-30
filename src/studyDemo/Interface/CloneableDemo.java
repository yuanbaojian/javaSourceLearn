package studyDemo.Interface;

import java.io.Serializable;

/**z
 * @Author CloneableDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class CloneableDemo{

    public static void main(String[] args) {
        CloneableDemo cloneableDemo = new CloneableDemo();
        Object clone = null;
        try {
            clone = cloneableDemo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("clone = " + clone);
    }
}
