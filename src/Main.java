public class Main {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(1000);
        primeraCuenta.depositar(100);
        System.out.println("El saldo de mi cuenta es: "+ primeraCuenta.getSaldo());

        primeraCuenta.retirar(100);
        System.out.println("mi saldo en cuenta es de: " + primeraCuenta.getSaldo());

        //creo mi objeto cuentaDeJimena
        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.depositar(1000);
        System.out.println("Total de jimena: "+ cuentaDeJimena.getSaldo());
        cuentaDeJimena.transferir(400,primeraCuenta);
        System.out.println("Saldo: "+cuentaDeJimena.getSaldo());
        System.out.println("Mi total de saldo: "+ primeraCuenta.getSaldo());



        Cliente cli = new Cliente();
        cli.setNombre("Leonel");
        cli.setTelefono("115964064");
        cli.setDocumento("33333333333");


        //muestro por referencia ;
        primeraCuenta.titular = cli;
        primeraCuenta.setAgencia(25);
        System.out.println("El numero de agencia es: "+ primeraCuenta.getAgencia());
        System.out.println("El nombre del titula es: " +primeraCuenta.titular.getNombre());


        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();

        cliente.setNombre("Luis");
        cliente.setDocumento("3670594032");

        cuenta.setTitular(cliente);

        //System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());

    }
}
