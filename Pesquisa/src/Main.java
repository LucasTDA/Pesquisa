/*
 
 * INICIAR PROGRAMA

DECLARAR variáveis:
    sexo COMO STRING
    somarIdadeH COMO INTEIRO
    somarIdadeM COMO INTEIRO
    homem COMO INTEIRO
    mulher COMO INTEIRO
    mulherSalario COMO INTEIRO
    valorSalario COMO FLUTUANTE
    mediaSalario COMO FLUTUANTE
    mediaIdade COMO FLUTUANTE

INICIALIZAR somarIdadeH, somarIdadeM, homem, mulher, mulherSalario, valorSalario COMO 0

ENQUANTO VERDADEIRO FAÇA
    IMPRIMIR "Digite [H] para Homem, [M] para Mulher, [I] para calcular a média de idade do grupo ou [S] para sair: "
    LER sexo

    SE sexo É IGUAL A "h" ENTÃO
        homem = homem + 1
        IMPRIMIR "Digite a Idade: "
        LER valorIdadeH
        somarIdadeH = somarIdadeH + valorIdadeH

        IMPRIMIR "Digite o salário: "
        LER salarioH
        valorSalario = valorSalario + salarioH
        SE homem > 0 ENTÃO
            mediaSalario = valorSalario / homem
        FIM_SE

    SENÃO SE sexo É IGUAL A "m" ENTÃO
        mulher = mulher + 1
        IMPRIMIR "Digite a Idade: "
        LER valorIdadeM
        somarIdadeM = somarIdadeM + valorIdadeM

        IMPRIMIR "Digite o salário: "
        LER salarioM
        SE salarioM < 600 ENTÃO
            mulherSalario = mulherSalario + 1
        FIM_SE

    SENÃO SE sexo É IGUAL A "i" ENTÃO
        totalIdades = homem + mulher
        SE totalIdades > 0 ENTÃO
            mediaIdade = (somarIdadeH + somarIdadeM) / totalIdades
            IMPRIMIR "A média de idade do grupo é: " + mediaIdade
        SENÃO
            IMPRIMIR "Não há idades suficientes para calcular a média."
        FIM_SE
        IMPRIMIR "A quantidade de mulheres com salário abaixo de R$600,00 é: " + mulherSalario
        IMPRIMIR "A média dos salários dos homens é: " + mediaSalario

    SENÃO SE sexo É IGUAL A "s" ENTÃO
        IMPRIMIR "Você saiu do programa. Obrigado por utilizá-lo."
        PARAR PROGRAMA

    SENÃO
        IMPRIMIR "Opção inválida"
    FIM_SE
FIM_ENQUANTO

FIM PROGRAMA
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sexo = "";
        int somarIdadeH = 0, somarIdadeM = 0;
        int homem = 0, mulher = 0, mulherSalario = 0;
        float valorSalario = 0, mediaSalario = 0, mediaIdade = 0;

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite [H] para Homem, [M] para Mulher, [I] para calcular a média de idade do grupo ou [S] para sair: ");
            sexo = entrada.nextLine().toLowerCase();

            switch (sexo) {
                case "h":
                    homem++;
                    System.out.println("Digite a Idade: ");
                    int valorIdadeH = entrada.nextInt();
                    somarIdadeH += valorIdadeH;

                    System.out.println("Digite o salário: ");
                    float salarioH = entrada.nextFloat();
                    valorSalario += salarioH;

                    if (homem > 0) {
                        mediaSalario = valorSalario / homem;
                    }
                    break;

                case "m":
                    mulher++;
                    System.out.println("Digite a Idade: ");
                    int valorIdadeM = entrada.nextInt();
                    somarIdadeM += valorIdadeM;

                    System.out.println("Digite o salário: ");
                    float salarioM = entrada.nextFloat();
                    if (salarioM < 600) {
                        mulherSalario++;
                    }
                    break;

                case "i":
                    int totalIdades = homem + mulher;
                    if (totalIdades > 0) {
                        mediaIdade = (somarIdadeH + somarIdadeM) / totalIdades;
                        System.out.printf("A média de idade do grupo é: %.2f%n", mediaIdade);
                    } else {
                        System.out.println("Não há idades suficientes para calcular a média.");
                    }
                    System.out.println("A quantidade de mulheres com salário abaixo de R$600,00 é: " + mulherSalario);
                    System.out.printf("A média dos salários dos homens é: %.2f%n", mediaSalario);
                    break;

                case "s":
                    System.out.println("Você saiu do programa. Obrigado por utilizá-lo.");
                    entrada.close();
                    return;

                default:
                    System.out.println("Opção inválida");
            }

            entrada.nextLine();
        }
    }
}
