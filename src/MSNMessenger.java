public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet(); //encapsulado
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHitoricoMensagem(); //encapsulado
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHitoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
