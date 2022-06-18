package extra.static_code;

public class Test {
    public static void main(String[] args) {
        //outerClass 의 인스턴스를 통해 inner class 인스턴스 생성
        OuterClassFactory factory = new OuterClassFactory();
        OuterClassFactory.InnerClass innerClass1 = factory.createInnerClass();
        OuterClassFactory.StaticInnerClass staticInnerClass1 = factory.createStaticInnerClass();

//        //outerClass 의 인스턴스를 없이 inner class 인스턴스 생성
//        OuterClassFactory.InnerClass innerClass2 = new OuterClassFactory.InnerClass("InnerClass");
        OuterClassFactory.StaticInnerClass staticInnerClass = new OuterClassFactory.StaticInnerClass("StaticInnerClass");
    }
}
