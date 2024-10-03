class student{
    private String name;
    private int rollno;
    student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public String getString(){
        return name;
    }
    public int getint(){
        return rollno;
    }
    public void setname(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        student st = new student("Himanshu",46);
        System.out.println(st.getString());
        System.out.println(st.getint());
        st.setname("Shreya", 45);
        System.out.println(st.getString());
        System.out.println(st.getint());
    }
}
