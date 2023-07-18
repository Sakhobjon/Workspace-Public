package SaxaThinkData;

public class SelectionSort {

    // i 와 j의 위치에 있는 값을 바꿥니다
    public static void swapElements(int [] array, int i, int j){
        int temp =array[i];
        array[i] = array [j];
        array[j] =temp;

        // 상수 사간 연산 , 요소르 잀고 쓰는 것

    }



 public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }
         // 선형  linearly:  start  boshlangan kichkina narxdan boshlab joylashuvni ushlab (start ni ham uz ichiga oladi)
         // 배열ni ohirigacha boradi



    // 선택 정렬을 사용하여 요소를 정렬합니다.
    public static void selectionSort(int[] array){
        for (int i=0; i<array.length; i++){
            int j =indexLowest(array , i);
            swapElements(array ,i,j);

        }
    }
}


