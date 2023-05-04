package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {//데이터 소스설정 

	@Bean(destroyMethod = "close")//디비컨피그를 빈으로 설정
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf8");
		ds.setUsername("spring5");
		ds.setPassword("spring5");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		//ds.setTestWhileIdle(true);
		//ds.setMinEvictableIdleTimeMillis(60000 * 3);
		//ds.setTimeBetweenEvictionRunsMillis(10 * 1000);
		return ds;
	}
}
