public class Array {
    public static void main(String[] args) {
        int [] Array_1 = {9,8,5,4,3,2,1};
        int [] Array_2 = {20,50,10,23,66,2,34};

        System.out.println("Array 1 without sort ");
        for (int value : Array_1) {
            System.out.println(value + " ");
        }
        System.out.println("Array 2 without sort ");
        for (int k : Array_2) {
            System.out.println(k + " ");
        }

        SortingArray SortMyArray = new SortingArray();
        SortMyArray.Sort(Array_1,Array_2);

        System.out.println("Array 1 with sort");
        for (int j : Array_1) {
            System.out.println(j + " ");
        }
        System.out.println("Array 2 with sort");
        for (int j : Array_2) {
            System.out.println(j + " ");
        }
    }

}
