package task2;

public class CompareArrays {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if(arr1.length != arr2.length || arr1 == null || arr2 == null){
            return  false;
        }
        for (int i = 0; i <= arr1.length - 1; i++){
            {
                if(!arr1[i].equals(arr2[i])){return false;}
            }
        }
        return true;
    }

    public static void main(String[] args){
        Integer[] iArray = {1, 2, 3, 4};
        String[] sArray = {"one", "two", "three", "four"};
        System.out.println("iArray и sArray одинаковые - " + compareArrays(iArray, sArray));

        Integer[] intArr1 = {5, 8, 35, 12};
        Integer[] intArr2 = {5, 8, 35, 12};
        System.out.println("iArray и sArray одинаковые - " + compareArrays(intArr1, intArr2));

        String[] strArr1 = {"English", "Spanish", "Korean"};
        String[] strArr2 = {"English", "spanish", "Korean"};
        String[] strArr3 = {"English", "Spanish", "Korean"};
        System.out.println("strArr1 и strArr2 одинаковые - " + compareArrays(strArr1, strArr2));
        System.out.println("strArr1 и strArr3 одинаковые - " + compareArrays(strArr1, strArr3));

        Integer[] intArr3 = {1, 2, 3, 4};
        Integer[] intArr4 = {5, 8, 35};
        System.out.println("intArr3 и intArr4 одинаковые - " + compareArrays(intArr3, intArr4));


    }

}
