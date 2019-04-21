public class Practice {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("Hello " + (i+1));
        }

        int j=0;
        do {
            System.out.println("Hello " + (j+1));
            j++;
        }while(j<5);

        int k=0;
        while(k<5){
            System.out.println("Hello " + (k+1));
            k++;
        }

    }
}
