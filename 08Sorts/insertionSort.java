import java.util.Arrays;
public class insertionSort{

    public static String name(){
	return "01.Ly.Kevin";
    }
    private static void swap(int[]ary,int a, int b){
	int c = ary[a];
	ary[a] = ary[b];
	ary[b] = c;
    }
    /*

    public static void insertionSort(int[] data){
	for (int c = 0; c < data.length - 1; c++){
	    if (data[c] > data[c+1]){
		swap(data,c,c+1);
		for (int i = c; i >0; i --){
		    if(data[i] < data[i-1]);
		       swap(data,i,i-1);
		}
	    }
	}
    }
    */
    public static void insertionSort(int[] data){
	for (int i = 1; i < data.length; i++){
	    int j = i;
	    while(j > 0 && data[j] < data[j-1]){
		swap(data, j,j-1);
		j--;
	    }
	}
    }
    /*
    public static void insertionsort2(int[] data){
	for (int i = 1; i < data.length; i++){
	    int temp = data[i];
	    int index = i;
	    for(int j = i-1; j >=0 && data[j] >temp;j++){
		data[j+1] = data[i];
		j = index;
	    }
	}
    }
    */
}
