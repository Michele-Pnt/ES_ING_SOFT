package classroom_implementazioni.esmepio2;

public class Class2 {
    private Class3 c3;

    public Class2(Interface1 i1){
        c3 = new Class3(i1);
    }

    public void method2(){
        c3.method3();
    }
}
