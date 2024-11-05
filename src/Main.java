import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menuSelecao = new Menu();

        String base_code = menuSelecao.base_code_menu();
        String target_code = menuSelecao.target_code_menu();
        double valorConversao = menuSelecao.valor_inicial();

        ConversaoMoeda novaConversao = new ConversaoMoeda(base_code,target_code);

        double resultadoConversao = novaConversao.novaConversao(base_code, target_code).conversion_rate()*valorConversao;

        System.out.println("O valor da conversão é de " + resultadoConversao);

    }
}
