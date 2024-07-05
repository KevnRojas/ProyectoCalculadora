
import java.util.Scanner;

public class AtributoCalculadora {

    private int operadorUno;
    private int operadorDos;


    public AtributoCalculadora() {
    }

    public int ingresarNumeroUno (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.operadorUno = entrada.nextInt();
        return operadorUno;
    }

    public int ingresarNumeroDos (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        this.operadorDos = entrada.nextInt();
        return operadorDos;
    }

    public int suma (){
        int resultado = getOperadorUno() + getOperadorDos();
        System.out.println("La suma es: " + resultado);
        System.out.println("*******************************");
        return resultado;
    }

    public int resta (){
        int resultado = getOperadorUno() - getOperadorDos();
        System.out.println("La resta es: " + resultado);
        System.out.println("*******************************");
        return resultado;
    }

    public int multiplicar (){
        int resultado = getOperadorUno() * getOperadorDos();
        System.out.println("La multiplicacion es: " + resultado);
        System.out.println("*******************************");
        return resultado;
    }

    public int division (){
        int resultado = getOperadorUno() / getOperadorDos();
        System.out.println("La division es: " + resultado);
        System.out.println("*******************************");
        return resultado;
    }
    public int getOperadorUno() {
        return operadorUno;
    }

    public int getOperadorDos() {
        return operadorDos;
    }

}
