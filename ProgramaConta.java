public class ProgramaConta {
    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.setNumero(1234);
        c1.setTitular("Jessica França");

        c1.depositar(400);

        c1.sacar(250);

        System.out.println("\nDADOS DA CONTA");
        System.out.println("Número: " + c1.getNumero());
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo: " + c1.getSaldo());
    }
}