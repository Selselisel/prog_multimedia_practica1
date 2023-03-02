/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacion_ejercico;

/**
 *
 * @author selisel
 */
public class Operacion_ejercico {

    public static void main(String[] args) {
        //Valor del dolar actual
          double ValorUSD =18.28;
       //Valor del iva 
          double iva= 0.16;
       //Valor del dolar a convertir
          double USD = 200;
       //Operacion de dolar a pesos
          double USDMXN = ValorUSD * USD;
       //Operacion al aplicar el iva
          double ivaapli = iva * USDMXN;
       //Imprime cuanto vale el dolar a pesos
          System.out.println("$1 dolar equivale a: $" + ValorUSD + "pesos");
       //Indica cuantos dolares hay y los convierte a pesos
          System.out.println("Se registro $" + USD + "dolares que equivale a:$" + USDMXN + "pesos");   
       //Si el valor de pesos es mayor a 2000 se aplicara el iva del 16%
          if (USDMXN > 2000.00)
       //Imprime el valor total con el iva aplicado
          System.out.println("Se aplico un impuesto del 16% el valor total es: $" + (ivaapli + USDMXN) + "pesos");
    }
}
