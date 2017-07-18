package suttz_roah;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
@EnableAutoConfiguration
@ComponentScan
@MapperScan("suttz_roah.mapper")
@SpringBootApplication
public class SuttzApplication {



	public static void main(String[] args) {
		SpringApplication.run(SuttzApplication.class, args);
	}
}
