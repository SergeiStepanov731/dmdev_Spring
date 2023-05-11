package spring.service;

import spring.database.repository.CompanyRepository;
import spring.database.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

//    private final UserRepository userRepository = new UserRepository(); UserService управляет созданием UserRepository

    public UserService(UserRepository userRepository,
                       CompanyRepository companyRepository) { // Так UserService снимает с себя от доп. функций. С помощью конструктора смогли установить одну ответственность
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
