public class Array2D {
    public static void main(String[] args) {

        int nums[][] = new int[3][4]; // Normal Array

        for (int i=0; i<nums.length; i++) { // Normal For Loop
            for (int j=0; j<nums[0].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int[] numArray : nums) {
            for (int num : numArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int nums2[][] = new int[3][]; // Jagged Array
        nums2[0] = new int[1];
        nums2[1] = new int[2];
        nums2[2] = new int[3];

        for (int[] numArray : nums2) { // Enhanced For Loop
            for (int num : numArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}