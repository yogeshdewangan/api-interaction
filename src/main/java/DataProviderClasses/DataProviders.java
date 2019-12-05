package DataProviderClasses;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviders {

    @DataProvider(name = "UsersData")
    public static Object[][] usersData1() throws Exception{
        return new Object[][]{
                {1, 6, 12, 2},
                {2, 6, 12, 2},
        };
    }
}
