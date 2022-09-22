package Edu.Dani.Mensegem;

public class PCdoPedrinho {
    public static void main(String[] args) {
        //Aqui usamos pilar abstract
        ServicoMensagemInstantanea smi = null;

       String appEscolhido = "tlg";
       if(appEscolhido.equals("face"))
           smi = new Facebokmessenger();

          else if (appEscolhido.equals("tlg"))
               smi = new Telegram();

       smi.enviarMensagem();
       smi.receberMensagem();



    }
}
