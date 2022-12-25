public class DataFloatClass implements GetRandomDataNymericDataTypes {
    private float[] arr;

    public DataFloatClass() {
        arr = new float[N];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Float: [ ");
        for (int i = 0; i < (N - 1); i++) {
            stringBuilder.append(arr[i]).append(", ");
        }
        stringBuilder.append(arr[N - 1]).append(" ]");
        return stringBuilder.toString();
    }

    @Override
    public void generateRandomData() {
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextFloat() * random.nextInt();
        }
    }
}
