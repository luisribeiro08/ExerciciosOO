package lista01_ex06;

public class ContaBancaria {
    private String titular;
    private float saldo;
    
    public void mostrarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void depositar(float valor){
        this.saldo += valor * 0.95;
    }
    
    public void sacar(float valor){
        if(saldoSuficiente(valor))
            this.saldo -= valor;
    }
    
    private boolean saldoSuficiente(float valor){
        if(this.saldo - valor >= 0)
            return true;
        
        return false;
    } 
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
}
