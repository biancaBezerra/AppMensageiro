public class Telegram extends ServicoMensagemInstantanea{


    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo TELEGRAM");
        salvaHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo TELEGRAM\n");
        salvaHistoricoMensagem();
    }

}
