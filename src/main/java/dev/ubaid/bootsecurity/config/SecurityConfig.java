package dev.ubaid.bootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig  {
    
    AntPathRequestMatcher openEndpoint = new AntPathRequestMatcher("/api/open/**", HttpMethod.GET.name());
    
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .cors().disable()
//                .csrf().disable()
//                .authorizeHttpRequests(requests -> requests
//                    .requestMatchers(HttpMethod.OPTIONS).permitAll()
//                    .requestMatchers(openEndpoint).permitAll()
//                    .anyRequest().authenticated())
//                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
//        
//        return http.build();
//    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.securityMatcher("/**")
            .csrf().disable()
            .authorizeHttpRequests((requests) -> requests
                .anyRequest()
                .permitAll()
            );
        return http.build();
    }
}
