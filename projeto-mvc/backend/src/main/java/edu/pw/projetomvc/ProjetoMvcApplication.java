package edu.pw.projetomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoMvcApplication.class, args);
	}
	
	//@Bean
	//@Description("Thymeleaf View Resolver")
	//public ThymeleafViewResolver viewResolver() {
	//	ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	//	viewResolver.setTemplateEngine(templateEngine());
	//	viewResolver.setOrder(1);
	//	return viewResolver;
	//}
//
	//@Bean
	//@Description("Thymeleaf Template Engine")
	//public SpringTemplateEngine templateEngine() {
	//   SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	//   templateEngine.setTemplateResolver(templateResolver());
	//   templateEngine.setTemplateEngineMessageSource(messageSource());
	//   return templateEngine;
	//}
//
	//@Bean
	//@Description("Thymeleaf Template Resolver")
	//public ServletContextTemplateResolver templateResolver() {
	//    ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
	//    templateResolver.setPrefix("/WEB-INF/views/");
	//    templateResolver.setSuffix(".html");
	//    templateResolver.setTemplateMode("HTML5");
	//
	//    return templateResolver;
	//}

}
