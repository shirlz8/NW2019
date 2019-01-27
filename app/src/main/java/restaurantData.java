/*
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class restaurantData {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        scanner.close();
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader("./suggestions_data.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");

            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
*/
