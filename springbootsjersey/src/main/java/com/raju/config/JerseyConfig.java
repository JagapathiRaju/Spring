package com.raju.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * Created by jagapathiraju on 06/08/17.
 */

@Configuration
@ApplicationPath("/employee")

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        // Register resources and providers using package-scanning.
        packages("com.raju");

        // Register for custom provider -  if it's in com.raju.
        //register(SecurityRequestFilter.class);

        //Register an instance of LoggingFilter.
        //register(new LoggingFilter(LOGGER, true));

    }
}
