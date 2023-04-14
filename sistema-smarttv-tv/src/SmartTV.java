public class SmartTV{
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        System.out.println("mudando o canal para: " +canal);
        canal++;
    }
    public void diminuirCanal(){
        System.out.println("mudando o canal para: " +canal);
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para: " +volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " +volume);
    }
    
    public void ligar(){
        ligada = true;

    }
    public void desligar(){
        ligada = false;
        
    }
}