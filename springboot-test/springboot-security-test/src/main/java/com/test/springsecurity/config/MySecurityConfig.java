package com.test.springsecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    //定制请求的授权规则  permitAll:给 / 授权所有权限均可访问
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        //开启自动配置的登录功能
        // ① /login 来到登录页面  ② 重定向到 /login?error 表述登录失败 ③ 更多详细规定
        http.formLogin();

        //开启自动配置的注销功能
        // ① 访问 /logout 表示用户注销，清空session  ② 注销成功会返回 /login?logout 页面
        http.logout().logoutSuccessUrl("/");//注销成功后来到首页
    }

    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        //使用内存用户验证这种方式这样写会报
        //java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"错
        //auth.inMemoryAuthentication().withUser("zhangsan").password("123456").roles("VIP1","VIP3");

        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
                .withUser("zhangsan").password("123456").roles("VIP1","VIP2")
                .and()
                .withUser("lisi").password("123456").roles("VIP1","VIP3")
                .and()
                .withUser("wangwu").password("123456").roles("VIP2","VIP3");

    }
}
