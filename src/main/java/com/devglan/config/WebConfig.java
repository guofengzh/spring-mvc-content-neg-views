package com.devglan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.devglan")
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true).parameterName("mediaType")
                .defaultContentType(MediaType.TEXT_HTML)
                .ignoreAcceptHeader(false)
                .useRegisteredExtensionsOnly(false)
                .mediaType("html", MediaType.TEXT_HTML)
                .mediaType("xml", MediaType.APPLICATION_XML)
                .mediaType("json", MediaType.APPLICATION_JSON);

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/", ".jsp").viewClass(JstlView.class);
        registry.enableContentNegotiation(
                new MappingJackson2XmlView(),
                new MappingJackson2JsonView()
        );
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/ui/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/ui/css/");
    }
}