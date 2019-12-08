import org.testng.annotations.Test;
import dataProviderClasses.*;


public class ListUsersTests extends BaseClass {

    @Test(dataProvider = "UsersData", dataProviderClass = DataProviders.class)
    public void verifyGetUsers(Integer pageNumber, Integer perPage, Integer total, Integer totalPages) throws Exception {
        getUsers(pageNumber);
        assertUsersList(perPage, total, totalPages);
    }
}
