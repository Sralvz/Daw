/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ivan.alvarez
 */
public class Mascota {
    // declaramos los atributos de la clase //
    private String nombre;
    private String fechaNacimiento;
    private String animal;
    private String raza;
    private int numeroChip;
    
    //creamos constructor por defecto //
    public Mascota(){
        nombre = "Abandonado";
        fechaNacimiento = "01/01/2023";
        animal = "rata";
        raza = "chunga";
        numeroChip = 0;
    }
    // creamos constructor por parametro //
    public Mascota(String nombre, String fechaNacimiento, String animal, String raza, int numeroChip){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.animal=animal;
        this.raza=raza;
        this.numeroChip=numeroChip;
    }
    // getter an setter //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
    }
    
}
