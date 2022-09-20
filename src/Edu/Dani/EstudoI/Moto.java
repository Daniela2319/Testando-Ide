package Edu.Dani.EstudoI;

public class Moto {
    public static void main(String[] args) {
        int count = 20;
        do{
            if (count < 18){
                System.out.println("Pode entra sala! ");

            } else
                System.out.println("Não pode entrar! ");

        }while (count++ <= 13);

        System.out.println("contagem: " + count);
    }
}
