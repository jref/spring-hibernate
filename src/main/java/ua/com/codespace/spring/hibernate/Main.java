package ua.com.codespace.spring.hibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.codespace.spring.hibernate.config.ApplicationConfig;
import ua.com.codespace.spring.hibernate.model.User;
import ua.com.codespace.spring.hibernate.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser(getUser());
        User user = userService.getUser(1);
        System.out.println(user);
        context.close();
    }

    private static User getUser() {
        User user = new User();
        user.setName("boris");
        user.setUsername("valera");
        user.setEmail("valera@gmail.com");
        return user;
    }
}
