package com.naveen.day11.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientEx01 {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		// httpGetRequest(); 
		httpPostRequest();
	}
	
	private static void httpGetRequest() throws IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		String uri = "https://jsonplaceholder.typicode.com/todos/1"; 
		HttpRequest request = HttpRequest.newBuilder().version(Version.HTTP_2)
			.uri(URI.create(uri)).build(); 
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		int statusCode = response.statusCode();
		String body = response.body(); 
		
		System.out.println("Status Code : " + statusCode);
		System.out.println("Body : " + body);
	}


	private static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).build(); 
		
		HttpRequest request = HttpRequest.newBuilder
				(new URI("https://jsonplaceholder.typicode.com/todos/"))
				.version(Version.HTTP_2).POST(
					BodyPublishers.ofString("{message:message}")).build(); 
		
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Response  Code : "+ response.statusCode());
		System.out.println("Response Body : "+ response.body());
		
	}
}














