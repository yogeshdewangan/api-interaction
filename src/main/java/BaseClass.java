import contractHandlers.CreateUser;
import contractHandlers.ListUsers;

public class BaseClass {

    public ListUsers listUsers;
    public CreateUser createUser;
    public void getUsers(Integer pageNumber) throws Exception{
        listUsers = new ListUsers(pageNumber);
        listUsers.getUsers();
    }
    public void assertUsersList(Integer perPage, Integer total, Integer totalPages) throws Exception{
        listUsers.assertListUsers(perPage, total, totalPages);
    }
    public void createUser(String name, String job) throws Exception {
        createUser =new CreateUser(name,job);
        createUser.createUser();
    }
    public void assertCreateUser(){
        createUser.verifyCreateUser();
    }
}
