void main(){
    /*
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */

    int n=5;
    // row loop
    for (int row = 1; row <= n; row++){
        //column loop
        for (int col = 1; col <= row; col++){
            System.out.print("* ");
        }
        System.out.println();

    }
    System.out.println();
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */


    //row loop
    for (int row = 1; row <= n; row++) {
        //column loop
        for (int col = 1; col <= row; col++) {
            System.out.print(col );
        }
        System.out.println();
    }
    System.out.println();
    /*
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
    */


    int r=5;
    //row loop
    for (int row = 1; row <= r; row++) {
        //column loop
        for (int col = r; col > row-1; col--) {
            System.out.print(col );
        }
        System.out.println();
    }
    System.out.println();
    /*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
     */


    //row loop
    for (int row = 1; row <= n; row++) {
        //space loop
        for (int space = 4; space >= row; space--) {
            System.out.print(" ");
        }
        //column loop
        for (int col = 1; col <= row; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
    System.out.println();

    //pass or fail using array
    //using linear search
    int[] marks = {76,82,50,20,29};
    System.out.print("Pass mark =");
    for (int mark:marks)
    {
        if(mark>=40){
            System.out.print(mark+",");
        }

    }
    System.out.println();
    System.out.print("Fail mark =");
    for (int mark:marks)
    {
        if(mark<=40){
            System.out.print(mark+",");
        }

    }
}