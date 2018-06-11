package modelo;

public class Cts_corriente { 
    private Cts_jovenes titular; 
    private String numCuenta; 
    private double saldo; 
     
    public Cts_corriente(Cts_jovenes titular, String numCuenta, double saldo){ 
        this.titular=titular; 
        this.numCuenta=numCuenta; 
        this.saldo=saldo; 
    } 
    public Cts_corriente(Cts_jovenes titular, String numCuenta){ 
        this.titular=titular; 
        this.numCuenta=numCuenta; 
        this.saldo=15.3; 
    } 
    public Cts_jovenes getTitular(){ 
        return this.titular; 
    } 
    public String getNumCuenta(){ 
        return this.numCuenta; 
    } 
    public double getSaldo(){ 
        return this.saldo; 
    } 
    public void setSaldo(double saldo){ 
        this.saldo=saldo; 
    } 
    public void ingresar(double ingreso){ 
        this.saldo+=ingreso; 
    } 
    public void reintegro(double salida){ 
        this.saldo-=salida; 
    } 
    public String toString(){ 
        return "Numero de cuenta: "+this.numCuenta + "\nSaldo: "+ this.saldo; 
    } 
    public boolean cuentasIguales(Cts_corriente cuenta){ 
        boolean iguales=false; 
        if(this.numCuenta.equals(cuenta.getNumCuenta())){ 
            iguales=true; 
        } 
        return iguales; 
    } 
     
} 