// 배열 12, 3, 19, 7, 5에서 가장 작은 값을 찾고 출력
public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12,3,19,7,5};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }System.out.println("가장 작은 값은: " + min);
    }
}