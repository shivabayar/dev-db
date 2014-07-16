package com.hashedin.devd.test;
//package com.hashedin.test;
//
//import org.junit.Test;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//import junit.framework.TestCase;
//
//
//public class AppTest extends TestCase {
//	
//	@Test
//	public void testMetrics(){
//		//String path="http://localhost:8080/api/metrics";
//	//	getMatricsResponse();
//	}
//
//	private void getMatricsResponse() {
//        try {
// 
//            Client client = Client.create();
//            WebResource webResource2 = client.resource("http://localhost:8080/api/metrics");
//            ClientResponse response2 = webResource2.accept("application/json").get(ClientResponse.class);
//            if (response2.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
//            }
// 
//            String output2 = response2.getEntity(String.class);
//            System.out.println("\n============getMatricsResponse============");
//            System.out.println(output2);
// 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
