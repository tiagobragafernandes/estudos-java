package onde.dio.operadores.relacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "x";

        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(c1 > i2);
        System.out.println(f1 == f2);
        System.out.println(f1 >= f2);
        System.out.println(f1 == d1);
        System.out.println(c1 == c2);

        //Isso não funciona devido a tipos diferentes, então logicamente não faz sentido.
        //System.out.println(c1 == s1);

    }
}
