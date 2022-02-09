package com.vikas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.Authenticator;

@Configuration
@EnableWebSecurity
public class SecurityCofig  extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Vikas")
                .password(encoder().encode("vg123"))
                .roles("CUSTOMER");

        auth.inMemoryAuthentication()
                .withUser("Ram")
                .password(encoder().encode("Pass1213"))
                .roles("MANAGER");
    }
        public void configure(HttpSecurity http) throws Exception {
                        http.authorizeRequests()
                                .antMatchers().permitAll()
                                .antMatchers("/offers").authenticated()
                                .antMatchers("/balance").hasAnyRole("CUSTOMER","MANAGER")
                                .antMatchers("/loanApprove").hasRole("MANAGER")
                                .anyRequest().authenticated()
                                .and().formLogin()
                                .and().rememberMe()
                                .and().logout().permitAll()
                                .and().exceptionHandling().accessDeniedPage("/denied");
        }

    }

