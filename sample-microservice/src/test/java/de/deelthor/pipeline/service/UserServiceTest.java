package de.deelthor.pipeline.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UserServiceTest {

    @Test
    public void echoUserName() {
        UserService userService = new UserService();
        String userName = userService.getUser("peter");
        assertThat(userName, is("peter"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void usernameEmpty() {
        UserService userService = new UserService();
        userService.getUser("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void usernameNull() {
        UserService userService = new UserService();
        userService.getUser(null);
    }
}
