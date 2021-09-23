public class App {
    public static void main(String[] args) throws Exception {
        
        int a = 1;
        int b = 2;
        int Sum = 0;
        int c = 0;
        
        System.out.println("Se imprimira la siguente serie de numeros");

        System.out.println(a);
        System.out.println(b);

        while(c < 10){
            Sum = a + b;

            System.out.println(Sum);

            a = b;
            b = Sum;
            c++;
        }
    }
}
