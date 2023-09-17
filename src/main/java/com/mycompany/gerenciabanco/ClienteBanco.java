package com.mycompany.gerenciabanco;

public class ClienteBanco {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public ClienteBanco(String nome, String sobrenome, String cpf, double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    // Métodos para consulta de saldo, depósito e retirada
    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
