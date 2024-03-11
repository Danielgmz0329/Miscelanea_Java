package co.edu.sena.miscelanea;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        double dato5;
        String Producto;
        int mis;

        Ejercicios ejercicios =  new Ejercicios();

        Scanner src = new Scanner(System.in);
        
        System.out.println("Seleccione un Submenu" );
        System.out.println("Menu Miscelanea de Ejercicios Java");
        System.out.println("1 Operadores");
        System.out.println("2 Condicionales");
        System.out.println("3 Ciclos");
        System.out.println("4 Arreglos");
        System.out.println("99 Salir");
        

        mis= src.nextInt();
        switch (mis) {

            //1. Operadores
            case 1:

                //Ejercicio 1

                System.out.println("1.1. Calcular el área de un triángulo");

                System.out.println("Ingrese la base del triángulo");
                dato1 = src.nextDouble();
                System.out.println("Ingrese la altura del triángulo");
                dato2 = src.nextDouble();
                dato3 = ejercicios.areaTriangulo(dato1, dato2);

                System.out.println("El área del triángulo es: " + dato3);
                
                //Ejercicio 2

                System.out.println("1.2. Sumatoria de dos números");

                System.out.println("Ingrese el primer número: ");
                Scanner sum = new Scanner(System.in);
                double d1 = sum.nextDouble();

                System.out.println("Ingrese el segundo número: ");
                double d2= sum.nextDouble();
                double resultado = (d1+d2);
                System.out.println("La sumatoria de los números es: " + resultado);
                
                //Ejercicio 3

                System.out.println("1.3. Número elevado al cuadrado");
                Scanner elv = new Scanner(System.in);

                System.out.println("Ingrese el número que desea elevar al cuadrado: ");
                dato1 = elv.nextDouble();
                dato3 = ejercicios.numeroElevado(dato1);

                System.out.println("El resultado del número es: "+dato3);
                
                //Ejercicio 4

                System.out.println("1.4. Conversor de euros a dolares");

                System.out.println("Ingrese la cantidad de euros: ");
                Scanner con = new Scanner(System.in);

                dato1 = con.nextDouble();
                dato3 = ejercicios.conversor(dato1);

                System.out.println("El valor en dolares es: "+dato3);
                
                //Ejercicio 5

                System.out.println("1.5. Área y perímetro de un cuadrado:");

                System.out.println("Ingrese un valor para un lado del cuadrado: ");
                Scanner valor = new Scanner(System.in);

                dato1 = valor.nextDouble();
                dato3 = ejercicios.areaCuadrado(dato1);
                dato4 = ejercicios.perimetroCuadrado(dato1);

                System.out.println("El área del cuadrado es: "+dato3);
                System.out.println("El perímetro del cuadrado es: "+dato4);
                
                //Ejercicio 6

                System.out.println("1.6. Cálculo del área y volumen de un cilindro");

                System.out.println("Ingrese el radio del cilindro:");
                Scanner cil = new Scanner(System.in);

                dato1 = cil.nextDouble();
                System.out.println("Ingrese la altura del cilindro:");
                dato2 = src.nextDouble();
                dato3 = ejercicios.areaCilindro(dato1, dato2);
                dato4 = ejercicios.VolumenCilindro(dato1, dato2);
                System.out.println("El área total del cilindro es: " + dato3);

                System.out.println("El volumen del cilindro es: " + dato4);
                
                //Ejercicio 7

                System.out.println("1.7. Cálculo de la longitud, área de una circunferencia y área de un círculo");

                System.out.println("Ingrese el radio de la circunferencia:");
                Scanner cir = new Scanner(System.in);

                dato1 = cir.nextDouble();
                dato3 = ejercicios.longitudCircunferencia(dato1);
                dato4 = ejercicios.areaCircunferencia(dato1);
                dato5 = ejercicios.areaCirculoInscrito(dato1);

                System.out.println("La longitud de la circunferencia es: " + dato3);
                System.out.println("El área de la circunferencia es: " + dato4);
                System.out.println("El área del círculo inscrito es: " + dato5);
                
                //Ejercicio 8

                System.out.println("1.8. Cálculo del promedio de tres números");

                System.out.println("Ingrese el primer número:");
                Scanner pro = new Scanner(System.in);

                dato1 = pro.nextDouble();
                System.out.println("Ingrese el segundo número:");
                dato2 = src.nextDouble();
                System.out.println("Ingrese el tercer número:");
                dato3 = src.nextDouble();
                dato4 = ejercicios.promedioSuma(dato1, dato2, dato3);

                System.out.println("El promedio de los tres números es: " + dato4);
                break;
                
            case 2:

                //2. Condicionales

                //Ejercicio 1

                System.out.println("2.1 Determine si el número ingresado es positivo o negativo");

                System.out.println("Ingrese un numero");
                d1 = src.nextDouble();

                Producto = ejercicios.positivoNegativo(d1);

                System.out.println("Su numero es " + Producto);
                
                //Ejercicio 2

                System.out.println("2.2 Determine si el número ingresado es mayor o es menor");

                System.out.println("ingrese el primer número");
                d1 = src.nextDouble();

                System.out.println("ingrese el segundo número");
                d2 = src.nextDouble();

                Producto = ejercicios.mayorOMenor(d1,d2);

                System.out.println(" " + Producto);
                
                //Ejercicio 3

                Scanner nument = new Scanner(System.in);
                System.out.println("2.3 Determinar de tres numeros el mayor y el menor");

                System.out.print("Ingrese el primer numero: ");
                dato1 = nument.nextDouble();

                System.out.print("Ingrese el segundo numero: ");
                dato2 = nument.nextDouble();

                System.out.print("Ingrese el 3 numero: ");
                dato3 = nument.nextDouble();

                String tresNumerosEnteros = ejercicios.menorOmayor1(dato1, dato2, dato3);

                System.out.println(tresNumerosEnteros);
                
                //Ejercicio 4

                System.out.println("2.4. Suma y resta de valores.");
                Scanner sumaores = new Scanner(System.in);

                System.out.println("Ingrese el primer número:");
                dato1 = sumaores.nextDouble();

                System.out.println("Ingrese el segundo número:");
                dato2 = sumaores.nextDouble();


                Ejercicios ejerciciosObj = new Ejercicios();
                double suma = ejerciciosObj.sumnum(dato1, dato2);
                double resta = ejerciciosObj.resnum(dato1, dato2);
                String resultadoSumaResta = ejerciciosObj.sumress(dato1, dato2, suma, resta);

                System.out.println("El resultado es " + resultadoSumaResta);
                
                //Ejercicio 5

                System.out.println("2.5. Hallar cociente entre dos numeros");
                Scanner cociente = new Scanner(System.in);

                System.out.println("Ingrese el primer número:");
                dato1 = cociente.nextDouble();

                System.out.println("Ingrese el segundo número:");
                dato2 = cociente.nextDouble();

                String resultadoCociente = ejercicios.cociente(dato1, dato2);
                System.out.println(resultadoCociente);
                
                //Ejercicio 6

                System.out.println("2.6. Suma o multiplicación dependiendo de si los datos son negativos o positivos");
                Scanner summul = new Scanner(System.in);
                
                System.out.println("Ingrese el primer número:");
                dato1 = summul.nextDouble();
                
                System.out.println("Ingrese el segundo número:");
                dato2 = summul.nextDouble();

                double resultadoSuma = ejercicios.operacionSumaMultiplicacion(dato1, dato2);

                System.out.println("El resultado es: " + resultadoSuma);
                
                //Ejercicio 7

                System.out.println("2.7. Determine si el año ingresado es bisiesto");
                System.out.println("Ingrese el año:");
                int anio = src.nextInt();


                boolean esBisiesto = ejerciciosObj.añoBisiesto(anio);
                if (esBisiesto) {
                    System.out.println(anio + " es un año bisiesto.");
                } else {
                    System.out.println(anio + " no es un año bisiesto.");
                }


                break;
        }
    }
}
