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
}
