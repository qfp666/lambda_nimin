package niminneibulei.nimin2;

public class Test2 {
    public static void main(String[] args) {
        function(new Inner() {
            @Override
            public void method() {
                System.out.println("qfp66666666");
            }
        });
    }




    public static void function(Inner i){
        i.method();
    }


}
