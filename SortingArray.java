public class SortingArray {
    public void Sort(int [] x, int [] y){
        int temp;
        int size;
        int size_2;

        size=x.length;
        size_2=y.length;
        for (int i = 0 ; i<size ; i++){
            for (int j=0 ; j<size-1; j++){
                if (x[j]>x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;

                }
            }
        }
        for (int i = 0 ; i<size_2 ; i++){
            for (int j=0 ; j<size_2-1; j++){
                if (y[j]>y[j+1]){
                    temp = y[j];
                    y[j] = y[j+1];
                    y[j+1] = temp;

                }
            }
        }
    }
}
