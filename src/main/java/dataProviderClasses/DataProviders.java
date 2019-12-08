package dataProviderClasses;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "UsersData")
    public static Object[][] usersData1() throws Exception{
        return new Object[][]{
                {1, 6, 12, 2},
                {2, 6, 12, 2},
        };
    }

    @DataProvider(name = "CreateUserData")
    public static Object[][] createUsersData1() throws Exception{
        return new Object[][]{
                {"Yogesh", "QA"},
                {"Rajesh", "QE"},
        };
    }
}
