public class Main {
    public static void main(String[] args) {
        System.out.println("----------- ABRINDO MSN -----------");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("----------- ABRINDO FACEBOOK -----------");
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("----------- ABRINDO TELEGRAM -----------");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}