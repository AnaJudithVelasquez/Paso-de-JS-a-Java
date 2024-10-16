var edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0, 
contadorPersonas = 0, acomuladorEdad = 0, acomuladorEstatura = 0, cantidadPersonas = 2;

for (let numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
    edad = parseFloat(prompt("Ingrese la edad de la persona " + numeroPersona));
    estadoCivil = parseFloat (prompt("Ingrese el estado civil de la persona " + numeroPersona + " 1. Soltero   2. Casado"));
    estatura = parseFloat (prompt("Ingrese la estatura de la persona " + numeroPersona + " en cms"));
    sexo = parseFloat (prompt("Ingrese el sexo de la persona " + numeroPersona + " 1. Hombre     2. Mujer"));

    if ((edad >= 18)&&(estadoCivil==1)&&(estatura>170)&&(sexo=1)){
    contadorPersonas = contadorPersonas + 1;
    acomuladorEdad = acomuladorEdad + edad;
    acomuladorEstatura = acomuladorEstatura + estatura;
    }
}

promedioEdad = acomuladorEdad / contadorPersonas;
promedioEstatura = acomuladorEstatura / contadorPersonas;
porcentajePersonas = (contadorPersonas/cantidadPersonas)*100;

alert("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años ");
alert("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + "centimetros");
alert("El porcentaje de personas que cumplen con la condición es del: " + porcentajePersonas + "%");