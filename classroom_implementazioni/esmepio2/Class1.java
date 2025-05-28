package classroom_implementazioni.esmepio2;

public class Class1 implements Interface1 {
    private Class2 c2;
    
    public Class1(){
        this.c2 = new Class2(this);
    }
    public int IntMethod1(){
        return 1;
    }

    public void method1(){
        c2.method2();
    }
}
