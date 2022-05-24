public class Giocatore extends Thread{
    /**
     * numero del dado uscito
     */
    public int numero;
    Dado d;

    /**
     * Costruttore parametrico 
     * @param nome nome del giocatore 
     * @param d oggetto di tipo dado
     */
    public Giocatore(String nome, Dado d) {
        this.d = d;
        setName(nome);
    }


    public Giocatore() {
    }



    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dado getD() {
        return this.d;
    }

    public void setD(Dado d) {
        this.d = d;
    }



    @Override
    public void run() {
        int conta = 0;
        System.out.println(Thread.currentThread().getName() + " sta iniziando a giocare");
        for (int i = 0; i < 2; i++)
        {
            this.numero = (int)(Math.random()*7);
            int lancio  = d.lancio(numero);
            if(lancio == 0)
              System.out.println("Al giocatore "+ Thread.currentThread().getName() + " è uscito " +numero);
            
            while(lancio == 1)
            {   System.out.println("Al giocatore "+ Thread.currentThread().getName() + " è uscito " +numero);
                this.numero = (int)(Math.random()*7);
                lancio = d.lancio(numero);
                System.out.println("Al giocatore "+ Thread.currentThread().getName() + " ha lanciato di nuovo il dado ed è uscito " +numero);
                    
            }
                
            if(lancio == -1)
            {
                System.out.println("Al giocatore "+ Thread.currentThread().getName() + " è uscito " +numero);
                this.numero = (int)(Math.random()*7);
                lancio = d.lancio(numero);
                System.out.println("Al giocatore "+ Thread.currentThread().getName() + " spetta un tiro bonus ed è uscito " +numero);
            }
               
            
    
            conta+=this.numero;
            
        }
        
        System.out.println("Il punteggio totale del giocatore " + Thread.currentThread().getName() + " è " +conta);
    }
}
