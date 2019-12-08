import org.testng.annotations.Test;
import dataProviderClasses.*;


public class CreateUserTests extends BaseClass {

    @Test(dataProvider = "CreateUserData", dataProviderClass = DataProviders.class)
    public void verifyCreateUser(String name, String job) throws Exception {
        createUser(name, job);
        assertCreateUser();
    }
}
