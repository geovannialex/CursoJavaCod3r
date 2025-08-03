package fundamentos;

public class AreaCircuferencia {

    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.println("O valor da area é de: " + area);

        raio = 10;
        area = PI * raio *raio;
        System.out.println("O valor da area é de: " + area);
    }

}
