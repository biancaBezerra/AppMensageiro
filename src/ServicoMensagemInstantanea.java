public abstract class ServicoMensagemInstantanea {

    //A Classe abstrata tem métodos abstratos e os métodos nao tem corpo, sendo encerrados por ;
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um método que otodo os filhos deverao implementar
    protected void salvaHistoricoMensagem(){
        System.out.println("Salvando historico");
    }

    //somente os filhos conhecem esse método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

}
