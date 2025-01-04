package gradproject.webservice.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ResponseLogFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Log request information
        System.out.println("Request URL: " + httpRequest.getRequestURL());
        System.out.println("Request Method: " + httpRequest.getMethod());
        //System.out.println("Request Protocol: " + httpRequest.getProtocol());

        // Proceed with the next filter in the chain or the actual request
        chain.doFilter(request, response);

        // Log response information
        System.out.println("Response Status: " + httpResponse.getStatus());

    }
}
