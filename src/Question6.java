// 배열 1, 2, 3, 4, 5, 6, 7, 8, 9, 10에서 짝수만 출력
public class Question6 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }
    }
}
