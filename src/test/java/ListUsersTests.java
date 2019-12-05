import ContractHandlers.ListUsers;
import org.testng.annotations.Test;
import DataProviderClasses.*;


public class ListUsersTests extends BaseClass {

    @Test(dataProvider = "UsersData", dataProviderClass = DataProviders.class)
    public void getUsersData(Integer pageNumber, Integer perPage, Integer total, Integer totalPages) throws Exception {
        getUsers(pageNumber);
        assertUsersList(perPage, total, totalPages);
    }
}
