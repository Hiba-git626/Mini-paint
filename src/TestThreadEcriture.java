public class TestThreadEcriture {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Ecriture2("bonjour", 10));
        Thread t2 = new Thread(new Ecriture2("bonsoir", 12));
        Thread t3 = new Thread(new Ecriture2("Goodbye", 5));
        t1.start(); // lance l'exécution du thread t1
        t2.start(); // lance l'exécution du thread t2
        t3.start(); // lance l'exécution du thread t3
    }

    static class Ecriture2 implements Runnable {   // <-- "static" ajouté
        private String texte;
        private int nb;

        public Ecriture2(String texte, int nb) {
            this.texte = texte;
            this.nb = nb;
        }
        @Override
        public void run (){
            for (int i=0 ; i<nb ; i++) System.out.println(texte) ;
        }
    }

    public class TestThreadEcriture2 {
        public static void main(String[] args) {
            Ecriture2 e1 = new Ecriture2 ("bonjour", 10) ;
            Ecriture2 e2 = new Ecriture2 ("bonsoir", 12) ;
            Ecriture2 e3 = new Ecriture2 ("Goodbye", 5) ;
            Thread t1 = new Thread (e1);//crée un thread t1 en utilisant l’objet de type runnable e1
            Thread t2 = new Thread (e2);//crée un thread t2 en utilisant l’objet de type runnable e2
            Thread t3 = new Thread (e3);//crée un thread t3 en utilisant l’objet de type runnable e3
            t1.start() ; // lance l’exécution du thread t1
            t2.start() ; // lance l’exécution du thread t2
            t3.start() ; // lance l’exécution du thread t2
        }
    }
}
