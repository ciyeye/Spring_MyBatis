package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
@Import({JdbcConfig.class, MybatisConfig.class})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
