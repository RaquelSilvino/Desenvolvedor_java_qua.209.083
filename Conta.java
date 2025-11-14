
package com.bank.models;
com.bank.repository.conta

public class Conta implements IConta {
    private String cpf;
    private String titular;
    private String numero;
    private String agencia;
    private double saldo;

    public Conta
    
    (String numero, String agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    @Override
    public void consultardados() {
        System.out.println("Conta Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
    }

    @Override
    public String consultarDados() {
        return "DADOS DA CONTA:\nNom: "+this.titular+
        *\nCPF: "+this.cpf+
        \"nNumero da Agência: "+this.nConta +
        "\nSaldo: R$" + String.format(%.2f",this.saldo);
        

    @Override
       public double saldo (double valor) {
        this.saldo +=valor;
        return this saldo;

        @Override
        public double sacar (double valor) {
        this.saldo -=valor;
        return this.saldo;}
        
    
}


