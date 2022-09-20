package Edu.Dani.Estudo;

public class Usuario {
   private String fabricante;
   private String modelo;
   private int ano;
   private boolean motorLigado;
   private int velocidade;


   public Usuario(){
      super();
   }

   public Usuario(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
      this.fabricante = fabricante;
      this.modelo = modelo;
      this.ano = ano;
      this.motorLigado = motorLigado;
      this.velocidade = velocidade;
   }

   public String getFabricante() {
      return fabricante;
   }

   public void setFabricante(String fabricante) {
      this.fabricante = fabricante;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getAno() {
      return ano;
   }

   public void setAno(int ano) {
      this.ano = ano;
   }

   public boolean isMotorLigado() {
      return motorLigado;
   }

   public void setMotorLigado(boolean motorLigado) {
      this.motorLigado = motorLigado;
   }

   public int getVelocidade() {
      return velocidade;
   }

   public void setVelocidade(int velocidade) {
      this.velocidade = velocidade;
   }

   public void status(){
      System.out.println("Informacao do carro");
      System.out.println("Fabricacao: " + this.fabricante);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Ano: " + this.ano);
      System.out.println("Carro esta ligado: " + this.motorLigado);
      System.out.println("Velocidade Maxima do carro: " + this.velocidade + " km");
   }

   @Override
   public String toString() {
      return "Usuario{" +
              "fabricante='" + fabricante + '\'' +
              ", modelo='" + modelo + '\'' +
              ", ano=" + ano +
              ", motorLigado=" + motorLigado +
              ", velocidade=" + velocidade +
              '}';
   }
}

