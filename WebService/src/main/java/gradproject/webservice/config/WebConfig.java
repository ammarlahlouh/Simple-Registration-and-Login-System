package gradproject.webservice.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<CommonsRequestLoggingFilter> requestLoggingFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        filter.setIncludeClientInfo(true); // Include client IP address
        filter.setIncludeQueryString(true); // Include query parameters
        filter.setIncludeHeaders(true); // Include headers
        filter.setIncludePayload(true); // Include request body (for POST/PUT)
        filter.setMaxPayloadLength(10000); // Max length of payload to log
        filter.setBeforeMessagePrefix("Request: "); // Prefix for the request log
        filter.setAfterMessagePrefix("Response: "); // Prefix for the response log

        FilterRegistrationBean<CommonsRequestLoggingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/api/*"); // You can adjust this to log specific paths
        return registrationBean;
    }
}
