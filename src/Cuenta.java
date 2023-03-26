class Cuenta {
   private double saldo;
  private int agencia;
  private int numero;
  Cliente titular;

  //private static int total = 0;
/*
  public Cuenta( int agencia){
    if (agencia <= 0){
      System.out.println("No se permite 0");
      this.agencia = 1;
    }else{
      this.agencia = agencia;
    }
    total++;
  }
*/
  void depositar(double plata){
    //el saldo de este objecto, y saldo lo que recibe como parametro.
    this.saldo = this.saldo + plata;
  }

  public boolean retirar(double plata) {
    if(this.saldo >= plata){
      this.saldo = this.saldo - plata;
      return true;
    }else{
      return false;
    }
  }
  public boolean transferir( double plata, Cuenta cuenta){
    if (this.saldo >= plata){
      this.saldo = this.saldo - plata;
      cuenta.depositar(plata);
      return true;
    }else {
      return false;
    }
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setAgencia(int nuevaAgencia){
    if (nuevaAgencia > 0){
      this.agencia = nuevaAgencia;
    }else{
      System.out.println("No estan permitidos valores negativos!!");
    }
  }

  public int getAgencia(){
    return agencia;
  }

  public void setNumero(int nuevoNumero){
    this.numero = nuevoNumero;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }
}
