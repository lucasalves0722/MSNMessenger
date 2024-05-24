public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet(); //encapsulado
        System.out.println("Enviar mensagem");
        salvarHitoricoMensagem(); //encapsulado
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHitoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
