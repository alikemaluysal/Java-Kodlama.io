public class Main {
    public static void main(String[] args) {
        String[] students = {"Ali Kemal", "Mustafa", "Mehmet"};
        String[] teachers = new String[3];
        teachers[0] = "Engin";
        teachers[1] = "Kemal";
        teachers[2] = "Mert";

        System.out.println("Öğrenciler:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Öğretmenler:");
        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
