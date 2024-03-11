package co.edu.sena.miscelanea;

public class Ejercicios {

    // Operadores

    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double numeroElevado(double numero) {
        return Math.pow(numero, 2);
    }

    public double conversor(double euros) {
        return euros * 1.0846;
    }

    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double perimetroCuadrado(double lado) {
        return lado * 4;
    }

    public double areaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double VolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public double areaCircunferencia(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double areaCirculoInscrito(double radio) {
        return Math.PI * Math.pow(radio, 2) / 2;
    }

    public double promedioSuma(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Condicionales

    public String positivoNegativo(double numero) {
        if (numero >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }

    public String mayorOMenor(double num1, double num2) {
        if (num1 > num2) {
            return "el número mayor es: " + num1 + " y el número menor es: " + num2;
        } else if (num1 < num2) {
            return "el número mayor es: " + num2 + " y el número menor es: " + num1;
        } else {
            return "ambos números son iguales.";
        }
    }

    public String menorOmayor1(double num1, double num2, double num3) {
        double mayor = num1;
        double menor = num1;
        if (num2 > mayor) {
            mayor = num2;
        } else if (num2 < menor) {
            menor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        } else if (num3 < menor) {
            menor = num3;
        }
        return "El mayor de los tres números es: " + mayor + ", y el menor es: " + menor;
    }

    public String sumress(double dato1, double dato2, double suma, double resta) {
        if (dato1 < dato2) {
            return "una suma de ambos números y da: " + suma;
        } else if (dato1 > dato2) {
            return "una resta de ambos números y da: " + resta;
        } else {
            return "Ambos números son iguales.";
        }
    }

    public double sumnum(double dato1, double dato2) {
        return dato1 + dato2;
    }

    public double resnum(double dato1, double dato2) {
        return dato1 - dato2;
    }

    public String cociente(double dato1, double dato2) {
        if (dato2 != 0) {
            return "El cociente de " + dato1 + " entre " + dato2 + " es: " + (dato1 / dato2);
        } else {
            return "La división por cero no está definida.";
        }
    }

    public double operacionSumaMultiplicacion(double dato1, double dato2) {
        if (dato1 < 0 || dato2 < 0) {
            return dato1 + dato2;
        } else {
            return dato1 * dato2;
        }
    }

    public boolean añoBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
