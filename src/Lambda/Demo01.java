package Lambda;

public class Demo01 {
    public static void main(String[] args) {

        invokecook(new Cook(){

            @Override
            public void makefood() {
                System.out.println("aaaaa");
            }
        });
        System.out.println("----------------");
        invokecook(()->{
            System.out.println("bbbbbbbb");
        });
    }

    public static void invokecook (Cook cook){
           cook.makefood();

    }
}
