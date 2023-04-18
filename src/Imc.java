import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE DIAGNÓSTICO DE IMC:");

        System.out.print("Entre com seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Entre com a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Entre com o seu peso: ");
        double peso = sc.nextDouble();

        sc.close();

        //IMC = divide-se o peso do paciente pela sua altura elevada ao quadrado.
        double imc = peso / Math.pow(altura, 2);
        //Math.pow(altura, 2)-> Pega a altura e eleva ao que tem após a virgula, no exemplar eleva a 2.

        //IMC	             CLASSIFICAÇÃO	OBESIDADE (GRAU)
        //MENOR QUE 18,5	 MAGREZA	          0
        //ENTRE 18,5 E 24,9  NORMAL	          0
        //ENTRE 25,0 E 29,9	 SOBREPESO	          I
        //ENTRE 30,0 E 39,9	 OBESIDADE	          II
        //MAIOR QUE 40,0	 OBESIDADE GRAVE	  III

        String classificacao;
        int grauObesidade;
    
        if (imc < 18.5) {
                classificacao = "MAGREZA";
                grauObesidade = 0;
         }else if (imc >= 18.5 && imc < 25){
                classificacao = "NORMAL";
                grauObesidade = 0;
         }else if (imc >= 25 && imc < 30) {
                classificacao = "SOBREPESO";
                grauObesidade = 1;
         }else if (imc >= 30 && imc < 40) {
                classificacao = "OBESIDADE";
                grauObesidade = 2;
         }else {
                classificacao = "OBESIDADE GRAVE";
                grauObesidade = 3;
            }
                        
            // %s -> String
            // %d -> Inteiro
            // %f -> Float
            // %n -> Quebra de linha
            // %3.2f -> 3 é os interios e o 2 é as casas decimais

            System.out.printf("\n> O indivíduo %s, de altura %2.2f e peso %3.2f Kg(s), \napresenta o IMC de %2.2f e apresenta um diagnóstico de %s %d", nome, altura, peso, imc, classificacao, grauObesidade);
}
}
