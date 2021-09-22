
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Desarrolle el algoritmo de la empresa XYZ, que permita calcular
la nómina semanal de 5 obreros, con la siguiente
características:
 Valor Hora 1000 pesos.
 Digitar el Número de Horas Trabajadas por semana por cada
Obrero
 Calcular el valor a pagar por cada obrero
 Calcular el Valor Total Pagados a Todos los Obreros.
 */



/**
 *
 * @author 
 * 
CIPA
Gustavo Medina Ortega
JEAN CARLOS OVIEDO LOPEZ
Andrés Causil Tordecilla
 */
public class Actividad2CalcularLaNomina {
    
    
     public static void main(String[] args) {
        // TODO code application logic here
     int sumatodos, Valorhora1,Valorhora2,Valorhora3, Valorhora4,Valorhora5, Trabajador1Formula,  Trabajador2Formula,  Trabajador3Formula , Trabajador4Formula,  Trabajador5Formula    ;
    
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digitar el Número de Horas Trabajadas del trabajador 1 en semana ");
        Valorhora1 = teclado.nextInt();
        Trabajador1Formula=1000*Valorhora1;
        System.out.println("valor a pagar a Obrero 1 es  "+Trabajador1Formula);
        
        System.out.println("Digitar el Número de Horas Trabajadas del trabajador 2 en semana ");
        Valorhora2 = teclado.nextInt();
        Trabajador2Formula=1000*Valorhora2;
        System.out.println("valor a pagar a Obrero 2 es  "+Trabajador2Formula);
        
        System.out.println("Digitar el Número de Horas Trabajadas del trabajador 3 en semana ");
        Valorhora3 = teclado.nextInt();
        Trabajador3Formula=1000*Valorhora3;
        System.out.println("valor a pagar a Obrero 3 es  "+Trabajador3Formula);
        
        System.out.println("Digitar el Número de Horas Trabajadas del trabajador 4 en semana ");
        Valorhora4 = teclado.nextInt();
        Trabajador4Formula=1000*Valorhora4;
        System.out.println("valor a pagar a Obrero 4 es  "+Trabajador4Formula);
        
        
        System.out.println("Digitar el Número de Horas Trabajadas del trabajador 5 en semana ");
        Valorhora5 = teclado.nextInt();
        Trabajador5Formula=1000*Valorhora5;
        System.out.println("valor a pagar a Obrero 5 es  "+Trabajador5Formula);
        sumatodos = Trabajador1Formula+Trabajador2Formula+Trabajador3Formula+Trabajador4Formula+Trabajador5Formula;
        
        System.out.println("El valor a pagar a Todos los  Obrero  es  "+sumatodos);
        
    
}
}
