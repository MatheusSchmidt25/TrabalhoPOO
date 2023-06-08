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
public class ContaAPagar extends Conta {
    Scanner ler = new Scanner(System.in);
    private String fornecedor;
    Conta conta = new Conta();
    

    public void lerDados() {
        System.out.println("=== Cadastro de Conta a Pagar ===");
        System.out.print("Descrição: ");
        String descricao = ler.nextLine();

        System.out.print("Valor: ");
        double valor = ler.nextDouble();
        ler.nextLine();

        System.out.print("Data de Vencimento (DD/MM/AAAA): ");
        String dataVencimentoStr = ler.nextLine();

        System.out.print("Fornecedor: ");
        fornecedor = ler.nextLine();
        conta.menu();
    }

    public String getFornecedor() {
        return fornecedor;
    }
}
