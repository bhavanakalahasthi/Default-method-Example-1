
public class TestClient {
public static void main(String[] args){
	

	TimeClient myTimeClient = new SimpleTimeClient();
    //System.out.println(myTimeClient.toString());
	 System.out.println("Current time: " + myTimeClient.toString());
     System.out.println("Time in California: " +
         myTimeClient.getZonedDateTime("Blah blah").toString());
}
}
