package datastructure;

public class ArrayStructure {

    public static int findIndex(int searchKey, int[] intArray) {
        int lowerBound = 0;
        int upperBound = intArray.length - 1;
        int currentIndex;
        while(true) {
            currentIndex = (lowerBound + upperBound)/2;
            if(intArray[currentIndex]==searchKey) {
                return currentIndex;
            }
           /* else if(lowerBound > upperBound){
                //value not found
                return -1;
            }*/
            else if(intArray[currentIndex] > searchKey){
                //value in upper half
                lowerBound = currentIndex + 1;
            } else if(intArray[currentIndex] < searchKey){
                //value in lower half
                upperBound = currentIndex - 1;
            }
        }
    }

    public static void main(String[] args) {
        //insert

        int[] sortedArray = {87,77,67,57,47,37,27,17};
        int index = findIndex(17,sortedArray);
        System.out.println(index);


    }

}
