package model;
public class CuentaBancaria {
    private int numero;
    private double saldo;
    private Cliente datosCliente;

    public CuentaBancaria(int numero, int saldo, Cliente datosCliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.datosCliente = datosCliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(Cliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public void transferir(CuentaBancaria cuenta1, int saldo1, CuentaBancaria cuenta2){
        if (cuenta1.saldo> saldo1){
            cuenta1.saldo-= saldo1;
            cuenta2.saldo+= saldo1;
            System.out.println("transacción exitosa");
        }
        else {
            System.out.println("saldo insuficiente");
        }

    }
   public void retirar(double monto){
        if (this.saldo> monto)
            this.saldo-=monto;
        else
            System.out.println("saldo insuficiente");

    }
   public void depositar (double monto){
        this.saldo += monto;

    }
}