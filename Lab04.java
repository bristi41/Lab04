public class Lab04 {
    static void method1(){

        System.out.println("Static Method");

    }
    void method2(){
        System.out.println("Non-String Method");

    }
    public static void main(String[] args){
        method1();
        Lab04 obj= new Lab04();
        obj.method2();
    }
}


