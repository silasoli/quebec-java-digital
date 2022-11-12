/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variaveis;

/**
 *
 * @author silas
 */
public class Variaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;

        //int i; não funciona 2 variaveis com o mesmo nome no mesmo escopo
        int I;

        //int 1a; não funciona
        //int _1a; funciona, mas não é uma boa pratica
        //int $aq; funciona, mas não é uma boa pratica
        i = 5;
        I = 10;

        final int j = 10;

        //j = 15; não é possivel reatribuir valor para uma variavel final
        int asrn24678md;

        //int asrn246 78md; Não é possivel declaracar variavel com espaco
        int asrn2$46_78md = 10;

        //int asrn2$46%78_md = 10; Não é possivel declarar variavel com caracteres especiais
        asrn24678md = 100;
        asrn2$46_78md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto = 50; //Não é uma boa pratica variaveis serem declaradas com letra maiusculas no inicio
        final int NUMERO_TENTATIVAS = 5;
        final int numeroTentativas = 5; //Não é uma boa pratica variaveis finais serem declaradas dessa maneira
        int QUANTIDADE_OPCOES = 25; //Não é uma boa pratica variaveis não finais serem declaradas dessa maneira
        int qtdProd; //Nome de variavel não expressivo

        System.out.println(i);
        System.out.println(I);
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$46_78md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }

}
