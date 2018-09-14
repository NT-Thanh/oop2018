package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup() == null || s2.getGroup() == null) return false;
        return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        // TODO:
        int i = 0, j = 0, k = 0;
        String[] Groups = new String[100];
        while (students[i] != null) {
            for (int x = 0; x < j; x++) {
                if (students[i].getGroup().equals(Groups[x])) k = 1;
            }
            if (k != 1) {
                Groups[j] = students[i].getGroup();
                j++;
            }
            i++;
        }
        for (int n = 0; n < j; n++) {
            System.out.println(Groups[n]);
            for (int z = 0; z < i; z++) {
                if (students[z].getGroup().equals(Groups[n]) && students[z].getId() != "deleted")
                    System.out.println(students[z].getInfo());
            }
        }

    }

    void removeStudent(String id) {
        // TODO:
        int i = 0;
        while (students[i] != null) {
            if (students[i].getId() == id) {
                students[i].setId("deleted");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement st = new StudentManagement();
        st.students[0] = new Student("Huong", "001", "hohoho@");
        st.students[1] = new Student("Hong", "002", "hahaha@");
        st.students[2] = new Student("Hanh", "003", "hehehe@");
        st.students[0].setGroup("INT2204 5");
        st.students[1].setGroup("INT2204 1");
        st.students[2].setGroup("INT2204 1");
        System.out.println(st.sameGroup(st.students[0], st.students[1]));
        st.removeStudent("001");
        System.out.println(st.sameGroup(st.students[0], st.students[2]));
        st.studentsByGroup();
    }
}
