package springproject.annotationsbased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"springproject.annotationsbased",
		"springproject.model"})
public class EntityConfigurations {

}
