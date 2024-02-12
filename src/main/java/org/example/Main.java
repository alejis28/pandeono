package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          String cedula;
          String nombreCliente;
          String nombreEmpleado;
          String contrasenaEmpleado;
          String nombreEmpleadoBD="ale";
          String contrasenaEmpledoBD="123";

          Integer opcion;

        Scanner lea = new Scanner(System.in);

        System.out.println("*****Pandebonos nairo");
        System.out.println("**********************");
        System.out.println("Apreciado empleado, inicie sesión por favor: ");
        boolean contrasenaBuena=false;



        while (contrasenaBuena==false) {


            System.out.println("digite tu usuario: ");
            nombreEmpleado = lea.nextLine();
            System.out.println("digite su contraseña: ");
            contrasenaEmpleado = lea.nextLine();

            //login

            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpledoBD)) {
                System.out.println("cargando sistema......");
                contrasenaBuena = true;

            } else {
                System.out.println("usuario incorrecto");
            }

            LocalDate fecha = LocalDate.now();

            System.out.println(fecha);
        }

        System.out.println("\n......PandeSoftware.....");
        System.out.println("1. Registrar compra");
        System.out.println("2. Calcular total");
        System.out.println("3. modificae compra");
        System.out.println("4. SALIR");

        do {
            System.out.println("Selecione una opcion:  ");
            opcion=lea.nextInt();
            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQuesos=0;
            Integer cantidadBebidas=0;

            Integer productosSelecionado;
            switch (opcion){


                case 1:
                     System.out.println("1. Pandebono Tradicional ($8000)");
                     System.out.println("2. Pandebono Guayaba ($9500)");
                     System.out.println("3. Pandebono Arequipe ($12000)");
                     System.out.println("4. Pandebono 7 quesos ($20000)");
                     System.out.println("5. Bebida (9500)");
                     System.out.println("6. terminar pedido");
                     System.out.println("......................................");
                  do{
                     System.out.println("Digite producto deseado");
                     productosSelecionado=lea.nextInt();

                     switch (productosSelecionado){
                         case 1:
                             System.out.println("digita cuantos pandeonos tradicionales se desan:");
                             cantidadTradicional=lea.nextInt();
                             break;
                         case 2:
                             System.out.println("digita cuantos pandeonos de guayaba se desea: ");
                             cantidadGuayaba=lea.nextInt();
                             break;
                         case 3:
                             System.out.println("digita cuantos pandeonos de arequipe se desea:  " );
                             cantidadArequipe=lea.nextInt();

                             break;
                         case 4:
                             System.out.println("digita cuantos pandeonos de 7 quesos se desea: ");
                             cantidadQuesos=lea.nextInt();
                             break;
                         case 5:
                             System.out.println("digita cuantas bebidas se desea: ");
                             cantidadBebidas=lea.nextInt();
                             break;
                         case 6:
                             System.out.println("orden terminada");
                             break;
                         default:
                             System.out.println("producto no encontrado");
                             break;
                     }

                  }while (productosSelecionado !=6);

                    break;
                case 2:
                  Integer totalSinPropina=((cantidadTradicional*8000)+(cantidadGuayaba*9500)+
                          (cantidadArequipe*12000)+(cantidadQuesos*20000)+(cantidadBebidas*9500));

                    Double totalConPropina=((totalSinPropina) + (totalSinPropina*0.1));
                    //rutina para mostar un mensaje con propina o sin propina
                    break;
                case 3:
                    //que volver a mostrar el menu
                    // en que estan asignados los contadores
                    System.out.println("1. Pandebono Tradicional ($8000)");
                    System.out.println("2. Pandebono Guayaba ($9500)");
                    System.out.println("3. Pandebono Arequipe ($12000)");
                    System.out.println("4. Pandebono 7 quesos ($20000)");
                    System.out.println("5. Bebida (9500)");
                    System.out.println("6. terminar pedido");
                    System.out.println("......................................");
                    
                    break;
                case 4:
                    System.out.println("termino");
                    break;
                default:
                    break;

            }
        }while (opcion !=4);


    }
}