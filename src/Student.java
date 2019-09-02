public class Student extends Person {
    private long uniRollNumber;
    private String courseName;
    public long getUniRollNumber()
    {
        return uniRollNumber;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void setUniRollNumber(long uniRollNumber)
    {
        this.uniRollNumber = uniRollNumber;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public Student(String name, int age, char gender, long uniRollNumber, String courseName)
    {
        super(name,age,gender);
        this.uniRollNumber = uniRollNumber;
        this.courseName = courseName;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append(" I study " + getCourseName() + " and my roll number is " + getUniRollNumber() + ".");
        return sb.toString();
    }
}
