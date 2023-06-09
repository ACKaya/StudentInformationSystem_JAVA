public class Course {
    Teacher teacher;
    String name;
    double code;
    String prefix;
    int note;
    
    Course(String name,double code,String prefix,int note){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;


    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }
        else{
            System.out.println("Hatali Eslesme");
        }
    }
    void printTeacher(){

        this.teacher.print();


    }
}
