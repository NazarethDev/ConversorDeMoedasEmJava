import java.util.Scanner;
import java.lang.String;


public class Menu {

    public static String menuSelecionado(int selecao) {
        switch (selecao) {
            case 0:
                System.out.println("Saindo do programa. Até mais:)");
                System.exit(0);
            case 1:
                return "BRL";
            case 2:
                return "USD";
            case 3:
                return "EUR";
            case 4:
                return "JPY";
            case 5:
                return "GBP";
            case 6:
                return "HDK";
            default:
                System.out.println("Seleção inválida, utilizando valor pré-definido - Dolar americano.");
                return "USD";
        }
    }

    String opcoesDoMenu = """
            1 - Real brasileiro (BRL)           4 - Iene japonês (JPY)
            2 - Dólar americano (USD)           5 - Libra esterlina
            3 - Euro (EUR)                      6 - Dolar de Hong Kong (HDK)
                                        0 - sair
            """;

    Scanner scanner = new Scanner(System.in);


    public String base_code_menu() {
        System.out.println("Selecione a moeda em que o valor a converter será inserido:");
        System.out.println(opcoesDoMenu);
        int seleciona_base_code = scanner.nextInt();
        return menuSelecionado(seleciona_base_code);

    }

    public String target_code_menu() {
        System.out.println("Selecione a moeda para qual deseja que a conversão seja feita:");
        System.out.println(opcoesDoMenu);
        int seleciona_target_code = scanner.nextInt();
        return menuSelecionado(seleciona_target_code);
    }

    public double valor_inicial() {
        System.out.println("Informe o valor que deseja converter (Use ',' para valores decimais)");
        double valorInicial = scanner.nextDouble();
        return valorInicial;
    }
}
