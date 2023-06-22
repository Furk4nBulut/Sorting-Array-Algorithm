public class Sort {
    public static void sortingArrays(int[] idArray, String[] nameArray) {
        for (int i = 0; idArray.length > i; i++) {
            int currentMin = idArray[i];
            String currentString = nameArray[i];
            int currentIndex = i;
            for (int j = i + 1; j < idArray.length; j++) {
                if (currentMin > idArray[j]) {
                    currentMin = idArray[j];
                    currentString = nameArray[j];
                    currentIndex = j;

                }
            }
            if (currentIndex != i) {
                idArray[currentIndex] = idArray[i];
                idArray[i] = currentMin;
                nameArray[currentIndex] = nameArray[i];
                nameArray[i] = currentString;
            }
            System.out.println(i + 1 + "." + idArray[i]);
            System.out.println(i + 1 + "." + nameArray[i]);
        }
    }
    public static void sortingArrays(double[] idArray, String[] nameArray) {
        for (int i = 0; idArray.length > i; i++) {
            double currentMin = idArray[i];
            String currentString = nameArray[i];
            int currentIndex = i;
            for (int j = i + 1; j < idArray.length; j++) {
                if (currentMin > idArray[j]) {
                    currentMin = idArray[j];
                    currentString = nameArray[j];
                    currentIndex = j;zxvcxvcxv
                }
            }
            if (currentIndex != i) {
                idArray[currentIndex] = idArray[i];
                idArray[i] = currentMin;
                nameArray[currentIndex] = nameArray[i];
                nameArray[i] = currentString;
            }
            System.out.println(i + 1 + "." + idArray[i]);
            System.out.println(i + 1 + "." + nameArray[i]);
        }
    }
}
