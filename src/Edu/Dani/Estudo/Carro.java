package Edu.Dani.Estudo;

public class Carro {
    public static void main(String[] args) {

        // Maneira automatica fazer construtor
        Usuario usuario = new Usuario("Audio","Trank",1995, true,200);
        usuario.status();
        System.out.println("---------------------------------------------------------------------------------");
        Usuario usuario1 = new Usuario("Fiat", "Uno", 2018, false, 180);
        usuario1.status();

        System.out.println("--------------------------------------------------------------------------------");


       // Maneira manual fazer construtor

        Usuario usuario2 = new Usuario();
        usuario2.setFabricante("Renald");
        usuario2.setModelo("clio");
        usuario2.setAno(1984);
        usuario2.setMotorLigado(true);
        usuario2.setVelocidade(160);
        System.out.println("Fabricacao: " + usuario2.getFabricante() + " Modelo: " + usuario2.getModelo());
        System.out.println("Ano Carro: " + usuario2.getAno() + " Motor esta ligado? " + usuario2.isMotorLigado());
        System.out.println("Velocidade: " + usuario2.getVelocidade() + " km");

        Usuario usuario3 = new Usuario("Chevrolet", "Corsa",1999, true, 150);
        usuario3.status();
    }
}
