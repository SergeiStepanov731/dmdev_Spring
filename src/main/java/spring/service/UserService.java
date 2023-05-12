package spring.service;

import spring.database.repository.CompanyRepository;
import spring.database.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;
    private CompanyService companyService;

//    private final UserRepository userRepository = new UserRepository(); UserService управляет созданием UserRepository

    public UserService(UserRepository userRepository,
                       CompanyRepository companyRepository) { // Так UserService снимает с себя от доп. функций. С помощью конструктора смогли установить одну ответственность
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

    public void setCompanyService(CompanyService companyService) { // При помощи такой архитектуры классов UserService и CompanyService можно создать цикличность вызовов бинов через пропертис
        this.companyService = companyService;
    }
}
