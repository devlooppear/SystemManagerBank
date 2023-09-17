package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteBanco cliente = new ClienteBanco("Nome", "Sobrenome", "123456789", 1000.0);

        int escolha;

        do {
            System.out.println("Bem-vindo ao sistema de gerenciamento bancário!");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Retirada");
            System.out.println("4. Encerrar");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo: " + cliente.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 3:
                    System.out.print("Informe o valor a retirar: ");
                    double valorRetirada = scanner.nextDouble();
                    cliente.retirar(valorRetirada);
                    break;
                case 4:
                    System.out.println("Encerrando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);
    }
}
