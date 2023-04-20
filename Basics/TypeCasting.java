public class TypeCasting {
    public static void main(String Args[]) {
        char ch = 'A';
        int n = 7;
        for(int i = 0 ; i<n;i++){
                for(int k = n-i; k > 0;k-- ){
                    System.out.print(" ");
                }
                for(int j = 0 ; j <= i ; j++){
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
                
        }


    }
}
