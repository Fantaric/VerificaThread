

public class Dado {
    
    public int numero;
    Giocatore g = new Giocatore();

    public Dado() {
    }

    public Dado(int numero) {
        this.numero = numero;
    }

    public int lancio(int numero)
    {
        this.numero = numero;
        if (numero == 0)
         {
            return 1;
         }else if (g.getNumero() == numero)
         {
            return -1;
         }
         else
         {
             return 0;
         }
            
        

    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Giocatore getG() {
        return this.g;
    }

    public void setG(Giocatore g) {
        this.g = g;
    }

}
