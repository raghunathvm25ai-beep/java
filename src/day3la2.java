void main(){
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
