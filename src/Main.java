import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ServicoMensagemInstantanea smi = null;

        /*
        NAO SE SABE QUAL APP
        MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGENS
         */

        System.out.print("Digite a opção (numero) do app que deseja utilizar: \n" +
                "1 - MSN\n" +
                "2 - FACEBOOK\n" +
                "3 - TELEGRAM\n");
        String appEscolhido = scanner.nextLine();

        System.out.println("Você escolheu a opcao " + appEscolhido);

        if (appEscolhido.equals("1"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("2"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("3"))
            smi = new Telegram();
        else System.out.println("Opção inválida, encerrando...");


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}