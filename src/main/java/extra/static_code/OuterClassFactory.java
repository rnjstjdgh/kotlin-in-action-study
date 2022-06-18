package extra.static_code;

public class OuterClassFactory {
    class InnerClass {
        private String val;
        InnerClass(String val){
            this.val = val;
        }
    }
    static class StaticInnerClass {
        private String val;
        StaticInnerClass(String val){
            this.val = val;
        }
    }
    public InnerClass createInnerClass(){
        return new InnerClass("InnerClass");
    }
    public StaticInnerClass createStaticInnerClass(){
        return new StaticInnerClass("StaticInnerClass");
    }
}
