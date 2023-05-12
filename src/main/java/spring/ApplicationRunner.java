package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.database.pool.ConnectionPool;
import spring.database.repository.CompanyRepository;
import spring.ioc.Container;
import spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            // clazz -> String -> Map <String, Object> Хранятся только синглтоны
            ConnectionPool connectionPool = context.getBean("p1", ConnectionPool.class);
//        ConnectionPool connectionPool = context.getBean("p1", ConnectionPool.class); Смотрит по aliasMap
            System.out.println(connectionPool);
            CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
//        System.out.println(context.getBean(ConnectionPool.class));
        }




//        Container container = new Container();

//        var connectionPool = new ConnectionPool();
//        UserRepository userRepository = new UserRepository(connectionPool);
//        CompanyRepository companyRepository = new CompanyRepository(connectionPool);
//        UserService userService = new UserService(userRepository, companyRepository);

//        ConnectionPool connectionPool = container.get(ConnectionPool.class);
//        UserRepository userRepository = container.get(UserRepository.class);
//        CompanyRepository companyRepository = container.get(CompanyRepository.class);


//        UserService userService = container.get(UserService.class);
        // TODO: 11.05.2023 userService
    }
}
