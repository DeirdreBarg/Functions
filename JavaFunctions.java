class JavaFunctions {
    public static void main(String[] args) {
        // testPrintArray();
        // testFindIndex();
        // testMultiplyArray();
        // testSumArray();
        // testMaxVal();
        // testMinVal();
        // testLastIndex();
        // testNthOccurance();
        // testReverse();
        // testCalAverage();
        // testCountOccurances();
        // testCloseAverage();
        // testRemoveDuplicate();
        testIsPalindrome();
    }

    static void testPrintArray() {
        int[] arr = {1, 2, 3, 4, 5};       
        printArray(arr);
    }

    /**
     * int[]: the array used in the function
     * retuen: prints the given array to consol
     */
    static void printArray(int[] myArray) {
        for(int i =0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    static void printFloatArray(float[] myArray) {
        for(int i =0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    static void testFindIndex() {
       int[] arr = {14, 3, 2, 7, 9};   
       int val = findIndex(arr, 4); 
       
       if (val == -1 ) {
        System.out.println("I am the caller and know it was found");
       } else {
        System.out.println("I am the caller and the index was " + val);
       }
    }
    /**
     * Finds the index of the FIRST instance of element in the array
     * 
     * int[] myArray: given array of numbers
     * int element: the element to find in the array
     * return: the index of the element, but if the element is not present, returns -1
     */ 
    static int findIndex(int[] myArray, int element) { 
        for( int i =0; i < myArray.length; i++) {
            if(myArray[i] ==  element) {
                return i;                
            }
        }         
        return -1;
    }

    static void testMultiplyArray() {
        int[] arr = {14, 3, 2, 7, 9};   
        int[] result = multiplyArray(arr, 2);
        printArray(result);
    }    

    /**
     * Multiplies all elements of the array and returns a new array
     * 
     * int[] myArray: given array of numbers
     * int k: number to multiply the given array by
     * return: the array after multiplying k
     */
    static int[] multiplyArray(int[] myArray, int k) {
        int[] result = new int[myArray.length];
        for(int i = 0; i < myArray.length; i++) {            
            result[i] = myArray[i] * k;
        }
        return result;
    }

    static void testSumArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr);    
        System.out.println("sum is: " + sum);
    }
    /**
     * Adds all of the elements from the array together
     * 
     * int[] myArray: The array of values to add together
     * return: sum of array values
     */
    static int sumArray(int[] myArray) {
        int sum = 0;
        for( int i = 0; i < myArray.length; i++) {
           sum += myArray[i];
        }
        return sum;
    }

    static void testMaxVal() {
        int[] arr = {4, 6, 12, 15, 2};
        int max = maxVal(arr);
        System.out.println("max is: " + max);
    }
   
   
   /**
    * Finds max value in the given array
    * @param myArray The given array of values
    * @return the max value or 0 if given empty array
    */
    static int maxVal(int[] myArray) {
        if(myArray.length == 0) {
            System.out.println("Empty Array");
            return 0;
        }
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++) {
            if(max < myArray[i]) {
                max = myArray[i];
            }
        }
        return max;
    }


    static void testMinVal(){
        int[] arr = {4, 6, 12, 15, 2};
        int min = minVal(arr);
        System.out.println("min is: " + min);
    }

    /**
     * Finds the minimum value in the given array
     * @param myArray array we are searching through 
     * @return the minimum value in the array or -1 if empty
     */

    static int minVal(int[] myArray) {
        if(myArray.length == 0) {
            System.out.println("Empty Array");
            return -1;
        }
        int min = myArray[0];
        for( int i = 0; i < myArray.length; i ++) {
            if(min > myArray[i]) {
                min = myArray[i]; 
            }
        }
        return min; 
    }


    static void testLastIndex() {
        int[] arr = {6, 2, 12, 15, 4, 4};
        int last = lastIndex(arr, 4);
        System.out.println("last is: " + last);
    }

    /**
     * Find the last occurance of the given element 
     * @param myArray the array we are searching through
     * @param k the given element we want to find the last occurance
     * @return the index of the last occurance of variable k or -1 if not in array
     */
    static int lastIndex(int[] myArray, int k) {        
        for(int i = myArray.length - 1; i >= 0; i--) {
            if (myArray[i] == k) {
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }


    static void testNthOccurance() {
        int[] arr = {6, 5, 12, 5, 4, 4};
        int nthOccurance = nthOccurance(arr, 2,5);
        System.out.println("nthOccurance is: " + nthOccurance);
    }

    /**
     * Finds the nth occurnace of given variable in the gievn array
     * @param myArray the array we are searching through 
     * @param n the number of the index the nth time they want to find the varible
     * @param t the varible we are looking for in the nth occurance 
     * @return the index the varible t is at the nth time or -1 when n occurances of t does not exist
     */
    static int nthOccurance(int[] myArray, int n, int t) { 
        int counter = 0;
        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i] == t) {
                counter++;
            } 
            if(counter == n) {
                return i;
            }
        }
        return -1;
    }

    static void testReverse() {
        int[] arr = {6, 5, 12, 5, 4, 4};
        int[] newArray  = reverse(arr);
        printArray(newArray);
    }

    /**
     * reverses the array and prints the new array
     * int[] myArray: uses array to get the reverse
     * returns: new array
     */

    static int[] reverse(int[] myArray) {
        int[] newArray = new int[myArray.length];
        for(int i = myArray.length - 1; i >= 0; i--) {
            newArray[(myArray.length - 1) -i ] = myArray[i];
        }

        return newArray;
    }

    static void testCalAverage() {
        float[] arr = {6, 5};
        float average = calAverage(arr);
        System.out.println("average is: " + average);
    }

    /**
     * finds average of given array values
     * @param myArray the array used to find average 
     * @return returns the average int
     */

    static float calAverage(float[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
            float average = sum / myArray.length;
        return average;
    }

    static void testCountOccurances() {
        int[] arr = {6, 5, 4, 5, 25, 4, 4, 4};
        int amount = countOccurances(arr, 4);
        System.out.println("amount is: " + amount);
    }
    /**
     * counts the occurances of given variable 
     * @param myArray used varables in given array
     * @param k the variable we want to count the occurances of
     * @return the amount of times the given varable is present 
     */
    static int countOccurances(int [] myArray, int k) {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == k) {
                counter ++;
                System.out.println("added to counter");
            }
        }
        return counter;

    }

    static void testCloseAverage() {
        float[] arr = {56, 5, 12, 5, 98, 4};
        float closest = closeAverage(arr);
        System.out.println("closest is: " + closest);
    }

    /**
     * finds average of the array and then returns the element closest to the average
     * @param myArray uses this array to find closest to the average
     * @return the element in the array thats closest to the average
     */
    static float closeAverage(float[] myArray) {
        float average = calAverage(myArray);
        float minDistance = Float.MAX_VALUE;
        int indexOfMinimum = -1;
        for (int i = 0; i < myArray.length; i++) {
            float distance = Math.abs(myArray[i] - average);
            if (distance < minDistance) {
                minDistance = distance;
                indexOfMinimum = i;
            }
        }
        return myArray[indexOfMinimum];
    }

    static void testRemoveDuplicate() {
        float[] arr = {56, 5, 1, 5, 9, 1};
        float[] newArray = removeDuplicates(arr);
        printFloatArray(newArray);
    }

    static boolean isAlreadyThere(float[] myArray, float k) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == k) {
                return true;
            }
        }
        return false;
    }

    static float[] removeDuplicates(float[] myArray) {
        float[] newArray = new float[myArray.length];
        int secondIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (!isAlreadyThere(newArray, myArray[i])) {
                newArray[secondIndex] = myArray[i];
                secondIndex++;
            }
        }
        
        float[] evenNewerArray = new float[secondIndex];

        for (int i = 0; i < evenNewerArray.length; i++) {            
            evenNewerArray[i] = newArray[i];
        }

        return evenNewerArray;
    }

    static void testIsPalindrome() {
        int[] arr = {1, 2, 3, 4, 4, 5, 3, 2, 1};
        boolean isPal = isPalindrome(arr);
        System.out.println("isPal is: " + isPal);
    }

    static boolean isPalindrome(int[] myArray) {
        for (int i = 0; i < myArray.length / 2; i++) {
            int left = myArray[i];
            int right = myArray[myArray.length - 1 - i];
            if (left != right) {
                return false;
            }
        }
        return true;        
    }    
} 