package com.mycompany.questao_3;

public class Produto
{
    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
    }

    public void exibirInformacoes(boolean exibirPreco)
    {
        if (exibirPreco)
        {
            System.out.println("Nome: " + nome);
            System.out.println("Codigo: " + codigo);
            System.out.println("Preco: R$ " + preco);
        }
        else
        {
            exibirInformacoes();
        }
    }

    public static void main(String[] args)
    {
        Produto produto = new Produto("Notebook", "12345", 2500.00);

        System.out.println("Exibindo informacoes basicas:");
        produto.exibirInformacoes();

        System.out.println("\nExibindo informacoes completas:");
        produto.exibirInformacoes(true);
    }
}

