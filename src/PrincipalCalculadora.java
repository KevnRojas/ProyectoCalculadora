

import java.util.Scanner;
public class PrincipalCalculadora {
    public static void main(String[] args) {
        int opcion;
        String menu = """
                1.sumar
                2.restar
                3.multpilicar
                4.dividir
                5.Salir
                """;
        System.out.println(menu);
        Scanner lectura = new Scanner(System.in);

        try {
            System.out.println("Ingrese la opcion");
             opcion = Integer.valueOf(lectura.nextLine());

            while(opcion <5){
                System.out.println(menu);
                System.out.println("************************************");

                AtributoCalculadora datosIngresados = new AtributoCalculadora();

                switch (opcion){
                    case 1:  datosIngresados.ingresarNumeroUno();
                             datosIngresados.ingresarNumeroDos();
                             datosIngresados.suma();
                             System.out.println("Ingrese la opcion");
                             opcion = Integer.valueOf(lectura.nextLine());
                             break;

                    case 2: datosIngresados.ingresarNumeroUno();
                            datosIngresados.ingresarNumeroDos();
                            datosIngresados.resta();
                            System.out.println("Ingrese la opcion");
                            opcion = Integer.valueOf(lectura.nextLine());
                            break;


                    case 3: datosIngresados.ingresarNumeroUno();
                            datosIngresados.ingresarNumeroDos();
                            datosIngresados.multiplicar();
                            System.out.println("Ingrese la opcion");
                            opcion = Integer.valueOf(lectura.nextLine());
                            break;

                    case 4: datosIngresados.ingresarNumeroUno();
                            datosIngresados.ingresarNumeroDos();
                            datosIngresados.division();
                            System.out.println("Ingrese la opcion");
                            opcion = Integer.valueOf(lectura.nextLine());
                            break;

                    default:
                        System.out.println("Fin de la aplicacion");
                        break;
                }

            }

        }catch (NumberFormatException e){
            System.out.println("Intentelo nuevamente: " + menu);
            opcion = Integer.valueOf(lectura.nextLine());
        }



    }


}






