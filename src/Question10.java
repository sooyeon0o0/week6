// 배열 20, 30, 50, 70, 90의 요소들의 평균을 구하고 출력
public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {20,30,50,70,90};

        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
//        >> for문 사용시
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }

        double avg = (double) sum / numbers.length;
//        -> double(혹은 float) 사용하는 이유는 나눴을때 소수점이 나올 수 있기 때문
        System.out.println("요소들의 평균은: " + avg);
    }
}
