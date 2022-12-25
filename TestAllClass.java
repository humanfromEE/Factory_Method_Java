public class TestAllClass {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            getTestKeyClass(i);
        }
    }

    public static void getTestKeyClass(int key) {
        DataClassFactory dataClassFactory = new DataClassFactory();
        GetRandomDataNymericDataTypes getRandomDataNymericDataTypes = dataClassFactory.getRandomNumbers(key);
        getRandomDataNymericDataTypes.generateRandomData();
        System.out.println(getRandomDataNymericDataTypes.toString());
    }
}
