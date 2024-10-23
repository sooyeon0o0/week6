// 정수형 배열을 선언하고, 크기를 5로 지정한 뒤, 각 요소를 1, 2, 3, 4, 5로 초기화하세요.
// 배열의 모든 요소를 출력하는 프로그램을 작성하세요.
public class Question1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        numbers = new int[5];
        // 크기가 5인 배열 선언

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // 교수님 풀이
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
