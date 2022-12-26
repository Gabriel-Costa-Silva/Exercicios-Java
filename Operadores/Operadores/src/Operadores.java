public class Operadores {
    public static void main(String[] args) throws Exception {
        //operadores são simboloes especiais com significado proprio
        //apresentar resultados 
        
        //operadores de atribuição - representado pelo símbolo de igual 
        String variavelString = "Esta é uma variável";
        System.out.println("Printando uma variavel atribuida : "+ variavelString);
        
        //operadores lógicos
        variavelString +=" adcionando um valor a ela";

        //operadores unários

        int numeroUm = 1;
        int numeroDois = 2;

        System.out.println(numeroUm);
        System.out.println(-numeroDois);

        numeroUm = numeroUm + 1;
        numeroUm--;
        System.out.println(numeroUm--);

        boolean boleano = false;

        boleano = !boleano;

        //operadores ternários
        
        String resultado = "";
       resultado = variavelString== "Esta é uma variavel"?"sim":"não";
       System.out.println(resultado);


       //operadores relacionais 

       boleano = numeroUm==numeroDois;
       System.out.println(boleano);
       boleano = numeroUm>numeroDois;
       System.out.println(boleano);
       boleano =  numeroUm<numeroDois;
       System.out.println(boleano);
       boleano = numeroUm !=numeroDois;
       System.out.println(boleano);

       //metodo equals para objetos

       //operadores lógicos

       //&& para "e" || para "ou" ! para negação
       if(1==2 && 2==2){
        System.out.println("condição verdadeira");
       }else{
        System.out.println("condiição falsa");
       }

    }
}
