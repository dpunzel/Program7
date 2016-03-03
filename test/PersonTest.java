import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by User on 2/27/2016.
 */
public class PersonTest extends TestCase
{

    public static final String EXPECTED_NAME = "Bob Smith";
    public static final String EXPECTED_PHONE = "504-555-5555";
    public static final String EXPECTED_EMAIL = "david@dad.com";

    public void testConstructor() throws Exception
    {
        final Person person = new Person("Bob Smith", "504-555-5555", "david@dad.com");
        Assert.assertEquals(EXPECTED_NAME, person.getName());
        Assert.assertEquals(EXPECTED_PHONE, person.getPhone());
        Assert.assertEquals(EXPECTED_EMAIL, person.getEmail());
    }

    public void testGetName() throws Exception
    {

    }

    public void testGetPhone() throws Exception
    {

    }

    public void testGetEmail() throws Exception
    {

    }

    public void testSetName(String harry) throws Exception
    {
        this.testSetName("Harry");
    }

    public void testSetPhone(String s) throws Exception
    {
        this.testSetPhone("555-555-5555");
    }

    public void testSetEmail() throws Exception
    {

    }

    public void testToString() throws Exception
    {

    }
}