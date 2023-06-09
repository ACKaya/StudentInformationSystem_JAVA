public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","506343","TRH");
        Teacher t2= new Teacher("Ali","545643","MAT");
        Course tarih = new Course("Tarih",101,"TRH",0);
        Course matematik = new Course("Matematik",102,"MAT",0);
        Course fizik = new Course("Fizik",103,"FZK",0);

        Student s1 = new Student("Anıl",518,tarih,matematik,fizik);
        Student s2 = new Student("Sidar",113,tarih,matematik,fizik);
        Student s3 = new Student("Apo",518,tarih,matematik,fizik);
        s1.addBulkExamNotes(10,5,100);

        s1.isPass();




    }
}
