package spring.database.repository;

import spring.bpp.InjectBean;
import spring.database.pool.ConnectionPool;

import javax.inject.Inject;

public class CompanyRepository {

    @InjectBean
    private ConnectionPool connectionPool;



//    public CompanyRepository(ConnectionPool connectionPool) {
//        this.connectionPool = connectionPool;
//    }
//
//    public static CompanyRepository of(ConnectionPool connectionPool) { // Фабричный метод
//
//        return new CompanyRepository(connectionPool);
//    }
}
