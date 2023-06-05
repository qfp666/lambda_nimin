package niminneibulei.nimin1;

public class Test {
    public static void main(String[] args) {
        new Animal(){
            @Override
            public void eat() {
                System.out.println("猫吃饭");
            }
        }.eat();

        String name="qfp";
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println(name+"爱吃肉");
            }
        };
    }
}
