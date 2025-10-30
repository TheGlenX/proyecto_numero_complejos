public class Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(4, 8);
        System.out.println("Número complejo creado: " + cn1);

        ComplexNumber cn2 = new ComplexNumber(1, 2);
        System.out.println("Número complejo 2: " + cn2);

        ComplexNumber suma = cn1.plus(cn2);
        System.out.println("La suma es: " + suma);

        ComplexNumber resta = cn1.sub(cn2);
        System.out.println("La resta es: " + resta);

        ComplexNumber multiplicacion = cn1.times(cn2);
        System.out.println("La multiplicacion es: " + multiplicacion);

        ComplexNumber division = cn1.div(cn2);
        System.out.println("La divison es: " + division);
    }
}