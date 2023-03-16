public class DebitoDolares {
    public static void getDebito(Double saldo, Double monto) throws Exception  {

        if (saldo < monto) {
            System.out.println("No tiene suficiente saldo...");
        }else{
            System.out.println("Su transacción está en proceso...");
            System.out.println("Transacción Exitosa..");
            System.out.println("Saldo Pendiente:  US$ ".concat(String.valueOf(saldo -monto)));
            System.out.println("Muchas Gracias..");
        }

    }
}
