package studyDemo.string;

import org.junit.Test;

import javax.xml.ws.Holder;

/**
 * @Author StringDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class StringDemo {
    public static void main(String[] args) {
        String name1 = "hello";
        String name2 = "hello";
        final String s = name1.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aa").append("bb");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("cc").append("dd");

        name2.indexOf('3');
        boolean equals = name1.equals(name2);
        System.out.println("equals = " + equals);
    }

    @Test
    public void test(){
        String name2 = "hello";
        int indexOf = name2.indexOf('e');
        System.out.println("indexOf = " + indexOf);
    }
}
