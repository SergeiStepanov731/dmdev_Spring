package spring.database.pool;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {

    private final String username;
    private final Integer poolSize;
    private final List<Object> args;
    private Map<String, Object> properties; // Чтобы сделать Di через setters нам нужно убрать final у поля, что делает его не иммутабельным

    public ConnectionPool(String username,
                          Integer poolSize,
                          List<Object> args,
                          Map<String, Object> properties) {
        System.out.println("ya pervui?");
        this.username = username;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        System.out.println("a gde?");
        this.properties = properties;
    }

    @PostConstruct
    private void init() {
        System.out.println("init method ConnectionPool");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("clean connection pool");
    }
}
