package sistema_Radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro vectra = new Carro();
        vectra.ano = 2011;
        vectra.modelo = "Elite";
        vectra.placa = "XLR8";
        vectra.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistão Sul";

        radar.avaliarVelocidadade(vectra);

        vectra.acelerar(); //10
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar();
        vectra.acelerar(); //110

        radar.avaliarVelocidadade(vectra);

        vectra.frear();

        radar.avaliarVelocidadade(vectra);




    }
    
}
