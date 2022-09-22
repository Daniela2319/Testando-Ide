package Edu.Dani.Mensegem;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Receber mensagem pelo Telegram");
    }



}
