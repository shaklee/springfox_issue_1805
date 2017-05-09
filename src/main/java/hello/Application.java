package hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Demonstrates springfox issue 1805
 */

@SpringBootApplication
@ComponentScan(lazyInit = true, basePackages = "hello")
@EnableSwagger2
public class Application extends SpringBootServletInitializer {

	@Bean
	public Docket customDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(greeting()).build();
	}

	private static Predicate<String> greeting() {
		return new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return input.startsWith("/greeting");
			}
		};
	}

	@Bean
	public UiConfiguration uiConfig() {
		return new UiConfiguration(null, null, null, null, null, true, true, null);
	}
}