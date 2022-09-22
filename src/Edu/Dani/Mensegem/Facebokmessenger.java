package Edu.Dani.Mensegem;

public class Facebokmessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Receber mensagem pelo Facebook");
    }




}
