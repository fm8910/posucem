import java.util.Scanner;

public class Main {




    public static void main(String ...args){

        Double saldoCordobas;
        Double saldoDolares;
        Double monto;

        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println();
            System.out.println();
            System.out.println(" ======== MENU DE OPCIONES ========= ");
            System.out.println(" ___________________________________ ");

            System.out.println(" ======== 1. Credito Cordobas     ========= ");
            System.out.println(" ======== 2. Debito Cordobas       ========= ");
            System.out.println(" ======== 3. Credito Dolares     ========= ");
            System.out.println(" ======== 4. Debito Dolares         ========= ");
            System.out.println(" ======== 5. Ingresar saldo Cordobas ========= ");
            System.out.println(" ======== 6. Ingresar saldo Dolares ========= ");
            System.out.println(" _____________________________________________ ");
            System.out.println(" Ingrese una opcion ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 6:
                    System.out.println("Ingresar saldo Cordobas ");
                    saldoCordobas = teclado.nextDouble();
                    System.out.println("Saldo Cordobas :"+ saldoCordobas);
                    break;
                case 5:
                    System.out.println("Ingresar saldo Dolares ");
                    saldoDolares = teclado.nextDouble();
                    System.out.println("Saldo Cordobas :"+ saldoDolares);
                    break;
                case 4:
                    System.out.println(" Ingrese la base ");

                    break;
                case 3:
                    System.out.println(" Ingrese saldo Dolares");
                    saldoDolares = teclado.nextDouble();
                    System.out.println(" Ingrese el monto en Dolares");
                    monto = teclado.nextDouble();
                    System.out.println(" SU saldo total es " + monto);
                    break;
                case 2:
                    System.out.println(" Aplicar Debito Cordobas ");
                    break;
                case 1:

                    break;

            }

        } while(opcion!=0);

    }
    
}
