public class PCUsuario {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHitoricoMensagem();
        msn.receberMensagem();
    }
}
