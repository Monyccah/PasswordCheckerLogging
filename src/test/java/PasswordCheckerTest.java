import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest{
    @Test
    public void passwordIsValid()
    {
        Assert.assertEquals(true,PasswordChecker.passwordIsValid(""));
    }

    @Test
    public void passwordIsOk()
    {
        Assert.assertEquals(true,PasswordChecker.passwordIsOk(""));
    }

}