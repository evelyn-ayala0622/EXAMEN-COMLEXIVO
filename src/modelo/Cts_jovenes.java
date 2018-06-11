package modelo;

public class Cts_jovenes { 
    private String nombre; 
    private String apellidos; 
    private int edad; 
     
    public Cts_jovenes(String nombre, String apellidos, int edad){ 
        this.nombre=nombre; 
        this.apellidos=apellidos; 
        this.edad=edad; 
    } 
     
    public String getNombre(){ 
        return this.nombre; 
    } 
    public String getApellidos(){ 
        return this.apellidos; 
    } 
    public int getEdad(){ 
        return this.edad; 
    } 
    public String toString(){ 
        return "Nombre: "+this.nombre + "\nApellidos: "+this.apellidos + "\nEdad: "+ this.edad; 
    } 
} 
 