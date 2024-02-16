
import Modelo.Mascota;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivan.alvarez
 */
public class Consola {
    //metodo para pedir dato//
    public Mascota pideDato(){
    // creamos metodo Scanner y objeto//
    Mascota mascota = new Mascota();
    Scanner teclado = new Scanner(System.in);
    // enlazamos con el contenido //
        System.out.print("Nombre: ");
        mascota.setNombre(teclado.nextLine());
        System.out.print("Fecha de nacimiento: ");
        mascota.setFechaNacimiento(teclado.nextLine());
        System.out.println("Animal: ");
        mascota.setFechaNacimiento(teclado.nextLine());
        System.out.println("Raza: ");
        mascota.setRaza(teclado.nextLine());
        System.out.println("Numero de chip: ");
        mascota.setNumeroChip(teclado.nextInt());
        return mascota;
        
        
        
        
    }
}
