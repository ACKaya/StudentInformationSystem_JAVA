public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    int studentNo;
    String classes;
    double avarage;
    boolean isPass;
    Student(String name,int studentNo,Course c1,Course c2,Course c3){
        this.name=name;
        this.studentNo=studentNo;
        this.avarage=0.0;
        this.isPass=false;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

    }
    void addBulkExamNotes(int note1,int note2,int note3){
        if(note1>=0&&note1<=100){
        this.c1.note=note1;}
        if(note1>=0&&note2<=100){
        this.c2.note=note2;}
        if(note1>=0&&note3<=100){
        this.c3.note=note3;}
        printNote();



    }
    boolean isPass(){
        calcAvarage();
        if(this.avarage>=55){
            System.out.println("Basariyla Gectiniz");
            return true;
        }
        else{
            System.out.println("Ortalamaniz Dusuk Sinifta Kaldiniz");
            return false;
        }
    }
    void printNote(){
        System.out.println(this.c1.name+" Notunuz:"+this.c1.note);
        System.out.println(this.c2.name+" Notunuz:"+this.c2.note);
        System.out.println(this.c3.name+" Notunuz:"+this.c3.note);
    }
    void calcAvarage(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3;



    }

}
