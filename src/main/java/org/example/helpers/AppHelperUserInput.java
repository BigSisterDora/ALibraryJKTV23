package org.example.helpers;

public class AppHelperUserInput {
    public User createUser(Scanner scanner){
        User user = new User();
        System.out.print("Имя: ");
        user.setFirstname(scanner.nextLine());
        System.out.print("Фамилия: ");
        user.setLastname(scanner.nextLine());
        System.out.print("Телефон: ");
        user.setPhone(scanner.nextLine());
        System.out.print("email: ");
        user.setEmail(scanner.nextLine());
        return user;
    }
}
