public class Telegram {
    public void enviarMensagem(){
        //primeiro conformar se esta conectado
        validarConectadoInternet();

        System.out.println("Enviando mensagem pelo Telegram");

        //depois de enviada salvar o historico
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    //metodos privados, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da mensagem");
    }
}
