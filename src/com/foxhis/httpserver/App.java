package com.foxhis.httpserver;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.foxhis.httpsever.resource.HelloWorldResource;

public class App {

	
	private static final URI baseuri= URI.create("http://localhost:8080/base/"); 
	
	
	
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub  
			System.out.println("httpsever is starting");
			final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseuri, create(), false);
			Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					server.shutdownNow();
					System.out.println("httpsever is closing");
					
				}
			}){
				
			});
			server.start();
			Thread.currentThread().join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}

	}
	
	public static ResourceConfig create(){
		
		ResourceConfig config = new ResourceConfig(HelloWorldResource.class);
		return config;
		
	}

}
