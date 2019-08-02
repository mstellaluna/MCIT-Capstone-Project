package com.marymule.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter {
	
	// JPA Persistence Configuration -- See /MCIT-Capstone-Project/src/main/resources/META-INF/persistence.xml for more details
	@Bean
	   public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
	      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	      factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
	      return factoryBean;
	   }

	   @Bean
	   public JpaTransactionManager getJpaTransactionManager() {
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
	      return transactionManager;
	   }
	   
	 // i18n configuration --  See /MCIT-Capstone-Project/src/main/resources/i18n for messages language files
	   

	   @Bean
	   public LocaleResolver localeResolver() {
	       CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
	       cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
	       return cookieLocaleResolver;
	   }
	   
	   @Bean
	   public MessageSource messageSource() {
	       ReloadableResourceBundleMessageSource messageSource = 
	         new ReloadableResourceBundleMessageSource();
	       messageSource.setBasename("classpath:i18n/messages");
	       messageSource.setUseCodeAsDefaultMessage(true);
	       messageSource.setDefaultEncoding("UTF-8");
	       messageSource.setCacheSeconds(0);
	       return messageSource;
	   }
	   
	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	       LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	       localeChangeInterceptor.setParamName("lang");
	       registry.addInterceptor(localeChangeInterceptor);
	   }
	   

}
