public class DebitoCordobas {


    public static Double aplicar(Double saldo, Double monto) throws Exception  {

        if (saldo < monto) {
            //return saldo;
            throw new Exception("No tiene saldo suficiente para el credito");
        }

        return   saldo - monto;
    }

}
