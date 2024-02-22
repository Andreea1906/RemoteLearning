import entity.Amphibian;
import entity.Frog;

public class Main {
    public static void main(String[] args) {
      //  Frog frog = new Frog();
        Amphibian amphibian = new Frog();

        amphibian.swim();
        amphibian.jump();
//        amphibian.croak();

        Frog frogFromAmphibian = (Frog) amphibian;
        frogFromAmphibian.croak();

    }
}