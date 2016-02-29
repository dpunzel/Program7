/**
 * Created by User on 2/27/2016.
 */
public class Student extends Person
{
    private String _major;
    private double _gpa;

    public Student(String name, String phone, String email, String major, double gpa)
    {
        super(name, phone, email);
        _major = major;
        _gpa = gpa;
    }

    public String getMajor()
    {
        return _major;
    }

    public double getGPA() {
        return _gpa;
    }

    public void setMajor(String _major) {
        this._major = _major;
    }

    public void setGPA(double _gpa) {
        this._gpa = _gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
