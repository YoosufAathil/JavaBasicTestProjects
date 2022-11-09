public class Pattern {
    public static void main(String[] args) {
         /* square
         int n=5;
         for (int j=0;j<n;j++){
             for (int i=0;i<n;i++){
                 System.out.print("*");
             }
             System.out.println();
         }
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int n=5;
        for (int j=0;j<n;j++){
            for (int i=0;i<n;i++){
                if (i==0 || i==4 || j==0 ||j==4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int n=10;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0 ||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        int n=9;

        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0 || j==n-1||i==n/2||i==(n-1)/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        int n=7;
        for (int i=0; i<n; i++){
            for (int j=0;j<n;j++){
                if (i==0||i==n/2||j==0||j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int n=8;
        for (int i=0; i<n; i++){
            for (int j=0;j<n;j++){
                if ( i==n/2 || i==0 && j!=0 && j!= n-1 || j==0 && i!=0 || j==n-1 && i>0 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0 || j==n-1 && i!=n-1 && i!= 0 || i==0 && j!=n-1 || i==n-1 && j!=n-1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int n=10;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0 && j>0 && j<n-1 || i==n-1 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || j==n-1 && i>0 && i<n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/
        int n=10;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (j==0 && i>0 && i<n-1 && i!=n/2 || j==n-1 && i>0 && i!=n/2 || i==0 && j>0 && j<n-1 || i==n/2 && j>0 && j<n-1 || i==n-1 && j>0 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // code above this line
    }
}
