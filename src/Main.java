import model.Cliente;
import model.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
       Cliente ana= new Cliente("ana", "pelaqkas", "123456");
       Cliente maria= new Cliente("maria", "cortauñas", "99999");
        CuentaBancaria cuenta = new CuentaBancaria(5555555, 1500000, ana);
        CuentaBancaria cuenta2 = new CuentaBancaria(8888, 50000, maria);
       /* System.out.println(ana.getId());
        System.out.println(ana.getProfesion());
        System.out.println("el usuarrio : "+ cuenta.getDatosCliente().getNombre());
        System.out.println("trabaja : "+ cuenta.getDatosCliente().getProfesion());
        System.out.println("es dueño de la cuenta : "+ cuenta.getNumero());*/
        System.out.println("su saldo es : "+ cuenta.getSaldo());
        cuenta.retirar(1000);
        System.out.println("su saldo es : "+ cuenta.getSaldo());
        cuenta.depositar(100);
        /*System.out.println("su saldo es : "+ cuenta.getSaldo());
        System.out.println("el usuarrio : "+ cuenta2.getDatosCliente().getNombre());
        System.out.println("trabaja : "+ cuenta2.getDatosCliente().getProfesion());
        System.out.println("es dueño de la cuenta : "+ cuenta2.getNumero());*/
        System.out.println("su saldo es : "+ cuenta2.getSaldo());
        cuenta.transferir(cuenta,1400000, cuenta2);
        System.out.println("el usuarrio : "+ cuenta.getDatosCliente().getNombre());
        System.out.println("su saldo es : "+ cuenta.getSaldo());

        System.out.println("el usuarrio : "+ cuenta2.getDatosCliente().getNombre());
        System.out.println("su saldo es : "+ cuenta2.getSaldo());





    }
}