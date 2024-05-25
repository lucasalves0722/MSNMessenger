public class PCUsuario {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "facebook";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("facebook"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("telegram"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
