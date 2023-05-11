package com.pfa.quickLinker.security;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	
	@Autowired
	AuthenticationManager authenticationManager;
	

	
	
	
	
	@Bean 
	public AuthenticationManager authManager(HttpSecurity http,
											BCryptPasswordEncoder bCryptPasswordEncoder,
											UserDetailsService userDetailsService)
													throws Exception{
		
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailsService)
				.passwordEncoder(bCryptPasswordEncoder)
				.and()
				.build();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{

		
		
		http.csrf().disable()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
			.authorizeHttpRequests()
			.requestMatchers("/swagger-ui/**")
			.permitAll()
																		
																	
																		.requestMatchers("/login").permitAll()
																		.requestMatchers("/swagger-ui/index.html/**").permitAll()
																		.requestMatchers("/user/**").hasAnyAuthority("ADMIN")
				
																		.requestMatchers("/profile/***").hasAnyAuthority("ADMIN","USER")
																		.requestMatchers("/adresse/*").hasAnyAuthority("ADMIN","USER")
																		.requestMatchers("/image/**").hasAnyAuthority("ADMIN","USER")
																		.requestMatchers("/tel/**").hasAnyAuthority("ADMIN","USER")
																		.anyRequest().authenticated().and()
																		.addFilterBefore(new JWTAuthenticationFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class).
																		addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
																		
		return http.build();
	}
	
	
	   @Bean
	    public WebSecurityCustomizer webSecurityCustomizer() {
	        return (web) -> web.ignoring().requestMatchers("/v3/api-docs/**");
	    }
	
	

}
