import java.util.Scanner;

/**
 * maximun
 */
public class maximun {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array = ");int n = sc.nextInt();

        int num[] = new int[n];

        // input
        System.out.println("Enter n value: ");
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        // output
        int min = num[0];
        int max = 0;

        for (int i=0; i<n; i++){

            if ( min > num[i]){
                min = num[i];
            }

            if ( max < num[i]){
                max = num[i];
            }

        }

        System.out.println("Max value in array: "+ min);
        System.out.println("Max value in array: "+ max);
        
    }
}