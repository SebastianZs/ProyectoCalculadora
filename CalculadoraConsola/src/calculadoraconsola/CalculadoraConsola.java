/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconsola;

import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class CalculadoraConsola {

    /**
     * @param args the command line arguments
     */
    double numero1;
    double numero2;
    double resultado;
    public static void main(String[] args) {
    
    
        int opc;
        CalculadoraConsola calc = new CalculadoraConsola();
        System.out.println("BIENVENIDO A LA CALCULADORA POR CONSOLA");
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*           OPERACIONES             *");
        System.out.println("*                                   *");
        System.out.println("*          1. SUMA                  *");
        System.out.println("*          2. RESTA                 *");
        System.out.println("*          3. MULTIPLICACION        *");
        System.out.println("*          4. DIVISION              *");
        System.out.println("*          5. SENO                  *");
        System.out.println("*          6. COSENO                *");
        System.out.println("*          7. TANGENTE              *");
        System.out.println("*          8. RAIZ N-ESIMA          *");
        System.out.println("*          9. POTENCIA N-ESIMA      *");
        System.out.println("*          10.IVA                   *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.print("\nIngrese la opcion que desea realizar: ");
        Scanner entrada = new Scanner(System.in);
        opc = entrada.nextInt();
        switch(opc){
            case 1:
                System.out.print("Ingrese el numero 1: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el numero 2: ");
                calc.numero2 = entrada.nextDouble();
                System.out.println("La suma de los numeros es: "+OperacionSuma(calc.numero1,calc.numero2));
                break;
            case 2:
                System.out.print("Ingrese el numero 1: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el numero 2: ");
                calc.numero2 = entrada.nextDouble();
                System.out.println("La resta de los numeros es: "+OperacionResta(calc.numero1,calc.numero2));
                break;
             case 3:
                System.out.print("Ingrese el numero 1: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el numero 2: ");
                calc.numero2 = entrada.nextDouble();
                System.out.println("La multiplicacion de los numeros ingresados es: "+OperacionMultiplicacion(calc.numero1,calc.numero2));
                break;
            case 4:
                System.out.print("Ingrese el numero 1: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el numero 2: ");
                calc.numero2 = entrada.nextDouble();
                while(calc.numero2 == 0){
                    System.out.print("No se puede dividir entre cero. Digite el numero 2 distinto de cero: ");
                    calc.numero2 = entrada.nextDouble();
                }
                System.out.println("La division de "+calc.numero1+"entre "+calc.numero2+" es: "+OperacionDivision(calc.numero1,calc.numero2));
                break;
            case 5:
                System.out.print("Ingrese el angulo(En Grados): ");
                calc.numero1 = entrada.nextDouble();
                System.out.println("El seno de "+calc.numero1+" es: "+OperacionSeno(Math.toRadians(calc.numero1)));
                break;   
             case 6:
                System.out.print("Ingrese el angulo(En Grados): ");
                calc.numero1 = entrada.nextDouble();
                System.out.println("El coseno de "+calc.numero1+" es: "+OperacionCoseno(Math.toRadians(calc.numero1)));
                break;
             case 7:
                 int x=0;
                System.out.print("Ingrese el angulo(En Grados): ");
                calc.numero1 = entrada.nextDouble();
                for(int i=0;i<=1000;i++){
                    if(calc.numero1 == 90+180*i){
                       x=1;
                    }
                }
                if(x==1)
                    System.out.println("Error de calculo.");
                else
                     System.out.println("La tangente de "+calc.numero1+" es: "+OperacionTangente(Math.toRadians(calc.numero1)));
                break; 
             case 8:
                System.out.print("Ingrese el numero: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el indice de la raiz: ");
                calc.numero2 = entrada.nextDouble();
                while(calc.numero1<0 && calc.numero2%2==0){
                    System.out.print("No existe raiz par de un numero negativo. Digite el indice de la raiz PAR: "); 
                    calc.numero2 = entrada.nextDouble();
                }
                if(calc.numero1 < 0)
                System.out.println("La raiz de grado "+calc.numero2+" de "+calc.numero1+" es: -"+OperacionRaiz((calc.numero1*-1),calc.numero2));
                else
                System.out.println("La raiz de grado "+calc.numero2+" de "+calc.numero1+" es: "+OperacionRaiz(calc.numero1,calc.numero2));
                break; 
             case 9:
                System.out.print("Ingrese la base: ");
                calc.numero1 = entrada.nextDouble();
                System.out.print("Ingrese el exponente: ");
                calc.numero2 = entrada.nextDouble();
                System.out.println("La potencia de grado "+calc.numero2+" de "+calc.numero1+" es: "+OperacionPotencia(calc.numero1,calc.numero2));
                break; 
             case 10:
                System.out.print("Ingrese el precio: ");
                calc.numero1 = entrada.nextDouble();
                System.out.println("El iva de $"+calc.numero1+" es: "+OperacionIva(calc.numero1));
                break;   
        }
    }
public static double OperacionSuma(double a,double b){
   return a+b;
}
public static double OperacionResta(double a,double b){
   return a-b;
}
public static double OperacionMultiplicacion(double a,double b){
   return a*b;
}
public static double OperacionDivision(double a,double b){
   return a/b;
}
public static double OperacionSeno(double a){
   return Math.sin(a);
}
public static double OperacionCoseno(double a){
   return Math.cos(a);
}
public static double OperacionTangente(double a){
   return Math.tan(a);
}
public static double OperacionRaiz(double a,double b){
   return Math.pow(a,1.0/b);
}
public static double OperacionPotencia(double a,double b){
   return Math.pow(a, b);
}
public static double OperacionIva(double a){
   return a*0.19;
}
    }
    

