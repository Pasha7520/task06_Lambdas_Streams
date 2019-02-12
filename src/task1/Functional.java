package task1;

public class Functional {
    public static void main(String[] args) {
        MyLambda lambda = (a, b, c) -> {
            if(a>=b && a>=c){
                return a;
            }else if(b>=a && b>=c){
                return b;
            }else {
                return c;
            }
        };
        MyLambda lambda1 = (a, b, c) -> (a+b+c)/3;
        System.out.println(lambda.func1(3,4,3));
        System.out.println(lambda1.func1(800,200,100));
    }

}
