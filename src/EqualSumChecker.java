public class EqualSumChecker {
    // write a method hasEqualSum with 3 parameters of type int
    // should return bool
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree){
        // return true if the sum of the first and second equal the third
        if(numOne + numTwo == numThree){
            return true;
        }
        return false;
    }
}
