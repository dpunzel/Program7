/**
 * Created by User on 2/27/2016.
 */
public class Employee extends Person
{
    private String _employeeID;

    public Employee(String name, String phone, String email, String empID) {
        super(name, phone, email);
        _employeeID = empID;
    }

    public String getEemployeeID()
    {
        return _employeeID;
    }

    public void setEmployeeID(String newID)
    {
        this._employeeID = newID;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Employee ID: " +  _employeeID;
    }

}
