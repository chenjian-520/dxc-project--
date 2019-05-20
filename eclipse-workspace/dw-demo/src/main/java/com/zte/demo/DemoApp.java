package com.zte.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yzh.demo.resources.DemoResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DemoApp extends Application<DemoConfiguration> {
	  /**
     * log print
     */
	private static final Logger LOG = LoggerFactory.getLogger(DemoApp.class);
	public static void main(String[] args) {
		try {
			new DemoApp().run(args);
		} catch (Exception e) {
			
			LOG.error("service start failed");
			e.printStackTrace();
			}
	}
	@Override
	public void run(DemoConfiguration configuration, Environment env)
			throws Exception {
		final DemoResource res = new DemoResource(configuration);
		env.jersey().register(res);
		
	}
	@Override
	public void initialize(Bootstrap<DemoConfiguration> bootstrap) {
		
		super.initialize(bootstrap);
	}
 
}
