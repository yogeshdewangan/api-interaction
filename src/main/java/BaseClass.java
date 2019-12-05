import ContractHandlers.ListUsers;

public class BaseClass {

    public ListUsers listUsers;
    public void getUsers(Integer pageNumber) throws Exception{
        listUsers = new ListUsers(pageNumber);
        listUsers.getUsers();
    }
    public void assertUsersList(Integer perPage, Integer total, Integer totalPages) throws Exception{
        listUsers.assertListUsers(perPage, total, totalPages);
    }
}
