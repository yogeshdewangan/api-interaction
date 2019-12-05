package ContractHandlers;

import ApiCalls.RAssured;
import Contracts.ListUsersResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.testng.Assert.assertEquals;


public class ListUsers {

    Integer pageNumber;

    RAssured rAssured = new RAssured();
    ObjectMapper objectMapper = new ObjectMapper();
    public ListUsersResponse listUsersResponse;

    public ListUsers(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListUsers getUsers() throws Exception {
        String response = rAssured.rGet("https://reqres.in/api/users?page=" + this.pageNumber.toString()).asString();
        listUsersResponse = (ListUsersResponse) objectMapper.readValue(response, ListUsersResponse.class);
        return this;
    }

    public ListUsers assertListUsers(Integer perPage, Integer total, Integer totalPages) throws Exception {
        assertEquals(listUsersResponse.getPage(), this.pageNumber.toString());
        assertEquals(listUsersResponse.getPer_page(), perPage.toString());
        assertEquals(listUsersResponse.getTotal(), total.toString());
        assertEquals(listUsersResponse.getTotal_pages(), totalPages.toString());
        return this;
    }

}
