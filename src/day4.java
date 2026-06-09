void main(){
    /*
    output
    student 1:
    class1 : present
    class2 : absent
    class3 : present
    using two dimension array
    */
    int[][] attendance= new int[][]{
            {0,1,0},
            {1,0,0},
            {1,1,1},
            {1,0,1},
            {0,0,0}
    };
    System.out.println("Output:");
    //row loop
    for(int i=0;i<attendance.length;i++){
        System.out.println("Student " + (i+1) + ":");
        //column loop
        for (int j=0;j<attendance[i].length;j++){
            //if else for print present or absent
            if(attendance[i][j]==0) {
                System.out.print("class" + (j+1) + ": Absent");
            }
            else
            {
                    System.out.print("class"+(j+1)+": Present");
                }
            System.out.println();
        }
    }
}