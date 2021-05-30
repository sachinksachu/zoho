import org.json.*;

public class Json {
    public static void main(String[] args) {

        // Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();

        // put("key", "value")
        jsonObject.put("name", "sachin");
        jsonObject.put("age", 24);

        // creating anothrt jsonObject
        JSONObject address = new JsonObject();
        address.put("building_no", "56");
        address.put("city", "mahe");
        address.put("pincode", 672670);

        // adding jsonobject in jsonObject
        jsonObject.put("address", address);

        // JSONArray
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("reactJS");
        jsonArray.add("NodeJS");
        jsonArray.add("javaScript");

        // adding array to json object
        jsonObject.put("skills", jsonArray);

        // jsonbject to string
        String str = jsonObject.toString();
        System.out.println(str);

        // accessing
        // getString()
        String name = jsonObject.getString("name");

        // getInt()
        int age = jsonObject.getInt("age");

        // getJSONArray
        JSONArray skills = jsonObject.getJSONArray("skills");
        // iterating
        for (int i = 0; i < skills.length(); i++) {
            String skill = skills.getString(i);
        }

        // iterating over jsonArray of jsonObjecta
        JSONArray array = new JSONArray(string_of_json_array);
        for (int i = 0; i < array.length(); i++) {
            //getJSONObject
            JSONObject row = array.getJSONObject(i);
            id = row.getInt("id");
            name = row.getString("name");
        }

        //edit
        jsonObject.put("name","tendulkar");

        //remove
        jsonObject.put("name");

    }
}
