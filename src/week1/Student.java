package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;
    

    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String n){
        name = n;
    }
    public  String getName(){
        return name;
    }
    public void setId(String n){
        id = n;
    }
    public  String getId(){

        return id;
    }
    public void setGroup(String n){

        group = n;
    }
    public  String getGroup(){

        return group;
    }
    public void setEmail(String n){

        email = n;
    }
    public  String getEmail(){
        return email;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vne.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        email = s.email;
        group = s.group;
    }

    String getInfo() {
        // TODO:
//        System.out.println(name + "\n" + id + "\n" + group + "\n" + email);
        return (name + "\n" + id + "\n" + group + "\n" + email);
    }
}
