import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2/27/2016.
 */
public class PersonTest// extends TestCase
{

    public static final String EXPECTED_NAME = "Bob Smith";
    public static final String EXPECTED_PHONE = "504-555-5555";
    public static final String EXPECTED_EMAIL = "david@dad.com";
    public static final String EXPECTED_TOSTRING = "Name: " + EXPECTED_NAME + " ";
    
    private Person _person1; //= new Person(EXPECTED_NAME, EXPECTED_PHONE, EXPECTED_EMAIL);
    private Person _person2; // = new Person("", "", "");
    

    @Before
    public void initialize()
    {
        _person1 = new Person(EXPECTED_NAME, EXPECTED_PHONE, EXPECTED_EMAIL);
        _person2 = new Person("", "", "");
    }
    

    @Test
    public void testConstructor() throws Exception
    {
        Assert.assertNotNull(_person1);
        Assert.assertTrue(_person1 instanceof Person);
        this.testGetName();
        this.testGetPhone();
        this.testGetEmail();
    }

    @Test
    public void testGetName() throws Exception
    {
        Assert.assertEquals(_person1.getName(), EXPECTED_NAME);
    }

    @Test
    public void testGetPhone() throws Exception
    {
        Assert.assertEquals(_person1.getPhone(), EXPECTED_PHONE);
    }

    @Test
    public void testGetEmail() throws Exception
    {
        Assert.assertEquals(_person1.getEmail(), EXPECTED_EMAIL);
    }

    @Test
    public void testSetName() throws Exception
    {
        _person2.setName(EXPECTED_NAME);
        Assert.assertEquals(_person2.getName(), EXPECTED_NAME);
    }

    @Test
    public void testSetPhone() throws Exception
    {
        _person2.setPhone(EXPECTED_PHONE);
        Assert.assertEquals(_person2.getPhone(), EXPECTED_PHONE);
    }

    @Test
    public void testSetEmail() throws Exception
    {
        _person2.setEmail(EXPECTED_EMAIL);
        Assert.assertEquals(_person2.getEmail(), EXPECTED_EMAIL);
    }

    @Test
    public void testToString() throws Exception
    {
        Assert.assertEquals(_person1.toString(), EXPECTED_TOSTRING);
    }
    
}
