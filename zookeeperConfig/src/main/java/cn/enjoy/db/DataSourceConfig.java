package cn.enjoy.db;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *  on 2018/10/11.
 */

@Configuration
public class DataSourceConfig {
    



    @Bean
    public DataSource dataSource() {
        EnjoyDataSource dataSource = new EnjoyDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysqldemo");
        dataSource.setUsername("root");
        dataSource.setPassword("root1234%");
        dataSource.setDefaultReadOnly(false);

        return  dataSource;
    }
}
