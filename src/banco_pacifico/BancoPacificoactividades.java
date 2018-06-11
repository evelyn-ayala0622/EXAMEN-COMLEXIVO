package banco_pacifico;

import modelo.Cts_ahorro;
import modelo.Cts_jovenes;
import modelo.Cts_corriente;

public class BancoPacificoactividades { 
 
    public static void main(String[] args) { 
       
        Cts_jovenes andres= new Cts_jovenes("andres ", "bajaña", 28); 
        Cts_jovenes mishell= new Cts_jovenes("mishell", "Huertas", 35); 
        Cts_corriente cuenta1= new Cts_corriente(andres, "2454", 2000); 
        Cts_corriente cuenta2= new Cts_corriente(mishell, "4352", 1500); 
        
     
        // CuentaAhorro ahorro1= new CuentaAhorro(mishell, "2454", 1500,3);
        // System.out.println( ahorro1.getTitular()); 
        // System.out.println( "numero de Cuenta: " +cuenta1.getNumCuenta());
       //  System.out.println("Saldo : " + ahorro1.getSaldo());
       //  ahorro1.calcularInteres(); 
       // System.out.println("Saldo paco tras interes: " + ahorro1.getSaldo());
       
       Cts_ahorro ahorro1= new Cts_ahorro(mishell, "4352", 1500,3);
        System.out.println( ahorro1.getjoven()+   "      numero de Cuenta: " +cuenta2.getNumCuenta()+"     Saldo: "+ahorro1.getSaldo()); 
        ahorro1.calcularInteres(); 
         System.out.println("Saldo Andrew tras interes: " + ahorro1.getSaldo());
System.out.println("--------------------------------------------------------------------------");
       Cts_ahorro ahorro2= new Cts_ahorro(andres, "2454", 2000,4);
        System.out.println( ahorro2.getjoven()+   "      numero de Cuenta: " +cuenta1.getNumCuenta()+"     Saldo: "+ahorro2.getSaldo()); 
        ahorro2.calcularInteres(); 
         System.out.println("Saldo Andrew tras interes: " + ahorro2.getSaldo());
         
       
    } 
} 