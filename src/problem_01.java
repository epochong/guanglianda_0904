/**
 * @author epochong
 * @date 2019/9/4 18:04
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class problem_01 {
    public static int[] reverseOne(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = tem;
        }
        return arr;
    }
    public static int[][] reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseOne(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] == 0 ? 1 : 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
