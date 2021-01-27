package com.imooc.security.browser;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.formLogin()
                .loginPage("/imooc-signIn.html")
                .loginProcessingUrl("/authentication/form")
        //http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/imooc-signIn.html").permitAll()
                .anyRequest()
                .authenticated()
        .and().csrf().disable();

    }
}
