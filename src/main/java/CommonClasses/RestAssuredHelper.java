package CommonClasses;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredHelper {

    public static RequestSpecification setBaseURI(RequestSpecification request, String uri) {
        return request.baseUri(uri);
    }

    public static RequestSpecification setHeader(RequestSpecification request, String key, String val) {
        return request.header(key, val);

    }

    public static int getResponseSize(Response response)
    {
        return response.jsonPath().getList("id").size();
    }

    public static Response callAPI(RequestSpecification request, String method, String path) {
        Response response = null;
        switch (method) {
            case "GET":
                response = request.get(path);
                break;
            case "PUT":
                response = request.put(path);
                break;
            case "POST":
                response = request.post(path);
                break;
            case "PATCH":
                response = request.patch(path);
                break;
            case "DELETE":
                response = request.delete(path);
                break;
        }

        return response;
    }

    public static String getTitle(Response response)
    {
        return response.jsonPath().getString("title");
    }

    public static String getBody(Response response)
    {
        return response.jsonPath().getString("body");
    }

    public static void checkStatus(Response response, int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }


}