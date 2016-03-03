// dpunzel15@georgefox.edu
// Person
// 2016-02-29

/**
 * Created by User on 2/27/2016.
 */
public class Person
{
    private String _name;
    private String _phone;
    private  String _email;

    public Person (String name, String phone, String email)
    {
        this._name = name;
        this._email = email;
        this._phone = phone;
    }

    public String getName()
    {
        return _name;
    }

    public String getPhone()
    {
        return _phone;
    }

    public String getEmail()
    {
        return _email;
    }

    public void setName(String _name)
    {
        this._name = _name;
    }

    public void setPhone(String _phone)
    {
        this._phone = _phone;
    }

    public void setEmail(String _email)
    {
        this._email = _email;
    }

    @Override
    public String toString()
    {
        String toString = "Name: " + _name + " ";
        return toString;
    }
}
