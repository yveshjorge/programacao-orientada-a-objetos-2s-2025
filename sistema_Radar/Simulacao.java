package sistema_Radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro vectra = new Carro( "XLR8", "Elite", 2011, 0);
        

        Radar radar = new Radar(60, "Pistão Sul");
        

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
        vectra.setVelocidade(-60);

        radar.avaliarVelocidadade(vectra);

        vectra.frear();

        radar.avaliarVelocidadade(vectra);




    }
    
}
