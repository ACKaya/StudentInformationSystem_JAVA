public class Teacher {
    String name;
    String telNo;
    String branch;
    Teacher(String name,String telNo,String branch){
        this.name=name;
        this.telNo=telNo;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adi:"+this.name);
        System.out.println("Telefon Numarasi:"+this.telNo);
        System.out.println("Bransi:"+this.branch);

    }
}
