package ng.com.cc.app;

import java.util.Arrays;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties(Application.class)
@EnableScheduling
// @ImportResource({ "classpath:*notification-context.xml", "classpath:*notification-si-context.xml",
// "classpath:*notification-task-context.xml" })
@EnableBatchProcessing
// @PropertySource(value = { "file:${REMITA_HOME}/config/PaymentNotificationEngineapp.properties" })
@PropertySource(value = { "file:C:/Users/LANRE/AppData/Roaming/Skype/My Skype Received Files/ShopKeeper/shopKeeper/src/main/java/application.properties" })
public class Application {

    private final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;

    @Value("${spring.datasource.url}")
    String datasourceUrl;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Value("${tiles.base.layout}")
    private String tilesBaseLayout;

    @Value("${tiles.layout}")
    private String tilesLayout;

    @Value("${rootPath}")
    String rootPath;

    @Value("${resources}")
    String resources;

    private static final Log LOG = LogFactory.getLog(Application.class);


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        ApplicationContext ctx = application.run(args);
        Application.LOG.debug("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        Application.LOG.debug(Arrays.toString(beanNames));
    }


    @Bean
    public UrlBasedViewResolver viewResolver() {
        log.debug("Doing URL viewResolver>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
        log.info("Doing URL viewResolver>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
        log.error("Doing URL viewResolver>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesView.class);
        viewResolver.setOrder(1);
        return viewResolver;
    }


    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[] { tilesBaseLayout, tilesLayout });
        tilesConfigurer.setCompleteAutoload(false);
        Application.LOG.info("tiles configurer in place...: " + tilesConfigurer);
        return tilesConfigurer;
    }


    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(datasourceUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
