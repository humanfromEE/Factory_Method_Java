public class DataClassFactory {
    
    /*
     * Key of data types:
     * 1 - int
     * 2 - double
     * 3 - long
     * 4 - float
     */

    public GetRandomDataNymericDataTypes getRandomNumbers(int DataType) {
        switch (DataType) {
            case 1:
                return new DataIntClass();
            case 2:
                return new DataDoubleClass();
            case 3:
                return new DataLongClass();
            case 4:
                return new DataFloatClass();
            default:
                return null;
        }
    }
}
