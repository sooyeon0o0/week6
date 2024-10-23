// 배열 12, 3, 19, 7, 5에서 가장 작은 값을 찾고 출력
public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12,3,19,7,5};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; //다른 수와 비교하며 가장 작은 수 찾기(반복문 사용)
            }
        }System.out.println("가장 작은 값은: " + min);
    }
}
