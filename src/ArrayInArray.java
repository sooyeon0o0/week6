public class ArrayInArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // matrix 배열 선언

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
                // i는 각 줄을 의미
                // j는 i줄의 있는 가로 숫자 출력

//                System.out.print("i=" + i + ", j=" + j +" ");
                // 출력되는 과정 확인
            }
            System.out.println(); // 각 i를 출력하고 줄 바꿈
        }
    }
//int[][] matrix = new int[3][3];            // 2차원 배열 -> for문 2개
//int[][][] matrix = new int[3][3][3];       // 3차원 배열 -> for문 3개
//int[][][][] matrix = new int[3][3][3][3];  // 4차원 배열 -> for문 4개
}
