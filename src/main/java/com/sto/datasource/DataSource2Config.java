package com.sto.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@Configuration
@MapperScan(basePackages = "com.sto.mapper.two", sqlSessionTemplateRef  = "twoSqlSessionTemplate")
public class DataSource2Config {
    @Value("${spring.datasource.two.driver}")
    private String jdbcDriver;
    @Value("${spring.datasource.two.jdbc-url}")
    private String jdbcUrl;
    @Value("${spring.datasource.two.username}")
    private String jdbcUsername;
    @Value("${spring.datasource.two.password}")
    private String jdbcPassword;

    @Bean(name = "twoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource testDataSource() throws PropertyVetoException {
        // 生成datasource实例
        // ComboPooledDataSource dataSource = new ComboPooledDataSource();
        // // 跟配置文件一样设置以下信息
        // // 驱动
        // dataSource.setDriverClass(jdbcDriver);
        // // 数据库连接URL
        // dataSource.setJdbcUrl(jdbcUrl);
        // // 设置用户名
        // dataSource.setUser(jdbcUsername);
        // // 设置用户密码
        // dataSource.setPassword(jdbcPassword);
        // // 配置c3p0连接池的私有属性
        // // 连接池最大线程数
        // dataSource.setMaxPoolSize(15);
        // // 连接池最小线程数
        // dataSource.setMinPoolSize(0);
        // // 关闭连接后不自动commit
        // dataSource.setAutoCommitOnClose(false);
        // // 连接超时时间
        // dataSource.setCheckoutTimeout(10000);
        // // 连接失败重试次数
        // dataSource.setAcquireRetryAttempts(2);
        // return dataSource;
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "twoSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("twoDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/two/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "twoTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("twoDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "twoSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("twoSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
