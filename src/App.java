public class App {
    public static void main(String[] args) throws Exception {
        
        Dado d = new Dado();
        Giocatore g1 = new Giocatore("ricca",d);
        Giocatore g2 = new Giocatore("mario",d);

       g1.setPriority(10);
       g1.start();
       g2.start();

       g1.join();
       g2.join();

        
       System.out.println("Partita terminata");
    }
}
