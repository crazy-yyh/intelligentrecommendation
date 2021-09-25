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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
 
@MapperScan(basePackages = "com.btmf.business.dao.master", sqlSessionTemplateRef = "MasterSqlSessionTemplate")
public class DBMasterConfig {
 
 
    @Bean(name = "MasterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.masterdb")
    @Primary
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }
 
    @Bean(name = "MasterSqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("MasterDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/master/*.xml"));
        return bean.getObject();
    }
 
    @Bean(name = "MasterTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("MasterDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
 
    @Bean(name = "MasterSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("MasterSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}