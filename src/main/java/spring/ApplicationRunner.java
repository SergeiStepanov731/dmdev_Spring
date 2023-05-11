package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.database.pool.ConnectionPool;
import spring.ioc.Container;
import spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("application.xml");
        // clazz -> String -> Map <String, Object>
        ConnectionPool connectionPool = context.getBean("pool2", ConnectionPool.class);
//        ConnectionPool connectionPool = context.getBean("p1", ConnectionPool.class); Смотрит по aliasMap
        System.out.println(connectionPool);
//        System.out.println(context.getBean(ConnectionPool.class));



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
