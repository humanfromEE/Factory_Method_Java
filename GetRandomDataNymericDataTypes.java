import java.util.Random; // For generation random numbers

public interface GetRandomDataNymericDataTypes {
    public Random random = new Random();
    public final int N = 5; // Range N in [1; + end border range int]
    @Override
        public String toString(); // My convert
    public void generateRandomData(); // Generate random numbers
}
