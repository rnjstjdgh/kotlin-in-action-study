package java_code;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static class Hello {
        private String str;

        public String getStr() {
            return this.str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    public static void main(String[] args) {
        String hello = "hello";
        hello = "fsd";
        List<String> list = Arrays.asList("Hello", "hello");
        list.stream()
                .map(s -> s.equals(hello));
    }
}
