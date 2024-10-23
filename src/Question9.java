// 배열 1, 2, 3, 4, 5를 다른 배열로 복사한 후, 복사된 배열을 출력
public class Question9 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] copy = new int[numbers.length];


//        System.arraycopy(numbers, 0, copy, 0, numbers.length);
//        System.out.println("복사한 배열은 " + numbers[0]  + numbers[1] + numbers[2] + numbers[3] + numbers[4]);

        //교수님 풀이
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " / " + numbers[i] + " / ");
        }
    }
}
