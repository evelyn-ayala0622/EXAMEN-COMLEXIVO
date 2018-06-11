package modelo;


import modelo.Cts_jovenes;
import modelo.Cts_corriente;

public class Cts_ahorro extends Cts_corriente{ 
    private double interes; 
     
    public Cts_ahorro(Cts_jovenes titular, String numCuenta, double saldo, double interes){ 
        super(titular, numCuenta, saldo); 
        this.interes=interes; 
    } 
    public Cts_ahorro(Cts_jovenes titular, String numCuenta, double interes){ 
        super(titular, numCuenta); 
        setSaldo(15.3); 
        this.interes=interes; 
    } 
    public Cts_ahorro(Cts_jovenes titular, String numCuenta){ 
        super(titular, numCuenta); 
        setSaldo(15.3); 
        this.interes=2.5; 
    } 
    public double getInteres(){ 
        return this.interes; 
    } 
    public void calcularInteres(){ 
        setSaldo(getSaldo()-(getSaldo()*(this.interes/100))); 
    } 
} 
 