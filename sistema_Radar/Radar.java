package sistema_Radar;

public class Radar {
    public  Integer limiteVelocidade;
    public String localizacao;

    public Radar(Integer limitevelocidade, String localizacao){
        this.limiteVelocidade = limitevelocidade;
        this.localizacao = localizacao;
    }

    public void avaliarVelocidadade(Carro carro){
        if(carro.getVelocidade() > this.limiteVelocidade){
            //emitir notificação
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }


    }
    
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);


    }
}
