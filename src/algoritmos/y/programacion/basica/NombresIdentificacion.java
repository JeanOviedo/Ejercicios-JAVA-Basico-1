import java.io.*;
import java.util.Scanner;

public class Ficheero4 {

public static void main(String[] args) throws FileNotFoundException {
    File fichero = new File ("C:\\Users\\Jean Oviedo\\Desktop\\ALGORITMOS Y PROGRAMACION BASICA\\src\\algoritmos\\y\\programacion\\basica\\datos.tx");

    Scanner sc=new Scanner(System.in);
    String respuesta;

   try {
    do {
        BufferedReader br=new BufferedReader(new FileReader(fichero));
        System.out.println("Introduco un nombre que quieras buscar: ");
        respuesta="Persona: "+sc.nextLine();

        String linea="";
        boolean encontrado = false;
        while ((linea= br.readLine())!=null) {

            if(linea.equalsIgnoreCase(respuesta)) {
                System.out.println(linea);

                for(int i=0;i<2;i++) {
                    System.out.println(br.readLine());
                }   
                encontrado = true;
                break;

            }

        }

        if(!encontrado) System.out.println("El usuario no existe");

            System.out.println("¿Quieres introducir otro nombre?");
            respuesta=sc.nextLine();



    }while(respuesta.equalsIgnoreCase("si"));
} catch (IOException e) {

    System.out.println("Error");
}