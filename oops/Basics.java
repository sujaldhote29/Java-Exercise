public class Basics {
    public static void main(String[] args) {
        // Student s1 = new Student("Sujal", 17, 95.8f);
        // Student s2 = new Student("Raj", 21, 58.8f);
        // System.out.println(s1.marks);
        // System.out.println(s2.name);
        Student s1 = new Student();
        s1.setname("sujal");
        s1.getname();
        
    }
}

 class Student{
    String name ;
    int roll;
    float marks;

    // Student(String name, int roll,float marks){
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = marks;
    // }

    public void setname(String name){
        this.name = name;
    }

    public void getname(){
        System.out.println(name);
    }

}