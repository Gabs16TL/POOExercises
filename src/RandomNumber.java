import java.util.Random;

public class RandomNumber {
    public int GetRandomNumber() {
        int upperbound = 100;
        Random rand = new Random();
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }

    public double RandomNumberIncresead(int RndNumber) {
        double Incresead = RndNumber * 1.3;
        return Incresead;
    }
}
