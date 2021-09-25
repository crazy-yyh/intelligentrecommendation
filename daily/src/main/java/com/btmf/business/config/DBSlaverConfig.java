package com.btmf.business.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.btmf.business.dao.slaver", sqlSessionTemplateRef = "SalverSqlSessionTemplate")
public class DBSlaverConfig {
 
    @Bean(name = "SalverDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.devdb")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }
 
    @Bean(name = "SalverSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("SalverDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/slaver/*.xml"));
        return bean.getObject();
    }
 
    @Bean(name = "SalverTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("SalverDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
 
    @Bean(name = "SalverSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("SalverSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}