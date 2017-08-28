package lista01_ex06;

public class TestaBanco {
    
    public static void main(String[] args){
        ContaBancaria cb1 = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria();
        
        cb1.setTitular("Luciano");
        cb1.depositar(575.60f);
        cb1.sacar(300);
        cb1.sacar(200);
        cb1.depositar(1050.90f);
        cb1.setTitular("Frederico");
        
        cb2.setTitular("Maria");
        cb2.depositar(500);
        cb2.depositar(500);
        cb2.sacar(1600);
        cb2.depositar(1000);
        cb2.sacar(1600);
        cb2.setTitular("Joana");
        
        System.out.println("Conta 1");
        System.out.println("Titular: " + cb1.getTitular());
        System.out.println("Saldo: " + cb1.getSaldo());
        
        System.out.println("\nConta 2");
        System.out.println("Titular: " + cb2.getTitular());
        System.out.println("Saldo: " + cb2.getSaldo());
    }
    
}
