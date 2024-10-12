import java.util.Scanner;


public class MainFor {
    
    public static void main(String[] args) {
       
        Scanner Per = new Scanner(System.in);
        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, contadorPersonas = 0, acomuladorEdad = 0, acomuladorEstatura = 0,  cantidadPersonas = 0;
        System.out.println("Ingrese el número de personas que deseas registar");
        cantidadPersonas = Per.nextInt();

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.println("Ingrese la edad de la persona " + numeroPersona);
            edad = Per.nextInt();
            System.out.println("Ingrese el estado civil de la persona " + numeroPersona + " 1. Soltero   2. Casado");
            estadoCivil = Per.nextInt();
            System.out.println("Ingrese la estatura de la persona " + numeroPersona + " en cms");
            estatura = Per.nextInt();
            System.out.println("Ingrese el sexo de la persona " + numeroPersona + " 1. Hombre     2. Mujer");
            sexo = Per.nextInt();

            if ((edad >= 18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)){
                contadorPersonas = contadorPersonas + 1;
                acomuladorEdad = acomuladorEdad + edad;
                acomuladorEstatura = acomuladorEstatura + estatura;
                }

        
        }
        LogicaFor prueba1 = new LogicaFor(edad, estadoCivil, estatura, sexo, contadorPersonas, acomuladorEdad, acomuladorEstatura, acomuladorEstatura, cantidadPersonas);
        prueba1.calcularPromedio();
        Per.close();

    }
}
