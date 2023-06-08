/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bar;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContaAReceber extends Conta {
    Scanner ler = new Scanner(System.in);
    private String cliente;
    Conta conta = new Conta();
    

    public void lerDados() {
        System.out.println("=== Cadastro de Conta a Receber ===");
        System.out.print("Descrição: ");
        String descricao = ler.nextLine();

        System.out.print("Valor: ");
        double valor = ler.nextDouble();
        ler.nextLine();

        System.out.print("Data de Vencimento (DD/MM/AAAA): ");
        String dataVencimentoStr = ler.nextLine();
        
        System.out.print("Cliente: ");
        cliente = ler.nextLine();
        conta.menu();
    }

    public String getCliente() {
        return cliente;
    }
    
}
