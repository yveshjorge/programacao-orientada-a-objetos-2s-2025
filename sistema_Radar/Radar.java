package sistema_Radar;

public class Radar {
    public  Integer limiteVelocidade;
    public String localizacao;

    public void avaliarVelocidadade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            //emitir notificação
            emitirNotificacao(carro.placa, carro.velocidade);
        }


    }
    
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);


    }
}
