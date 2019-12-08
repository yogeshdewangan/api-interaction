package contractHandlers;

import apicalls.RAssured;
import contracts.CreateUserRequest;
import contracts.CreateUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CreateUser {

    String name;
    String job;
    CreateUserRequest createUserRequest;
    CreateUserResponse createUserResponse;

    RAssured rAssured = new RAssured();
    ObjectMapper objectMapper = new ObjectMapper();

    String baseUrl = "https://reqres.in/api/users";

    public CreateUser(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public CreateUser createUser() throws Exception {
        createUserRequest = new CreateUserRequest();
        createUserRequest.setName(name);
        createUserRequest.setJob(job);
        String createUserRequestJsonData = objectMapper.writeValueAsString(createUserRequest);
        String response = rAssured.rPost(baseUrl, createUserRequestJsonData).asString();
        createUserResponse = (CreateUserResponse) objectMapper.readValue(response, CreateUserResponse.class);
        return this;
    }

    public CreateUser verifyCreateUser() {
        assertEquals(createUserResponse.getName(), name);
        assertEquals(createUserResponse.getJob(), job);
        assertNotNull(createUserResponse.getId());
        assertNotNull(createUserResponse.getCreatedAt());
        return this;
    }
}
