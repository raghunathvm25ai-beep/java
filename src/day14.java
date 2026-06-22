public class day14 {

    static class Student {
        String name;
        int age;
        int regNo;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
        }

        static class Builder {
            private String name;
            private int age;
            private int regNo;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }

            public Builder regNo(int regNoValue) {
                this.regNo = regNoValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {

        Student student = new Student.Builder()
                .name("Ragunath")
                .age(19)
                .regNo(2342343)
                .build();

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Reg No: " + student.regNo);
    }
}