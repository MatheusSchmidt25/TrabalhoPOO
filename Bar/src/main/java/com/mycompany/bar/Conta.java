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
public class Conta {
    private String descricao;
    private double valor;
    private String dataVencimento;

   

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
    public void menu(){
        String escolha = "";
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual opção voce deseja\n(1)Contas a Receber\n(2)Contas a Pagar");
        escolha = ler.nextLine();
        switch (escolha) {
                            case "1":
                                System.out.println("Conta a Receber");
                                ContaAReceber receber = new ContaAReceber();
                                receber.lerDados();
                            break;
                            case "2":
                                System.out.println("Conta a Pagar");
                                ContaAPagar pagar = new ContaAPagar();
                                pagar.lerDados();
                            break;
    }
    }}
