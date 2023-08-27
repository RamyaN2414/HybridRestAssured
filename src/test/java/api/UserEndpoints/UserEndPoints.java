package api.UserEndpoints;

import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	public static Response crerateUser(User userPayload) {
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(userPayload).when()
				.post(Routes.post_url);
		return response;

	}

	public static Response getUser(int user_id) {
		Response response = given()

				.pathParam("id", user_id).when().get(Routes.get_url);
		return response;

	}

	public static Response updateUser(int user_id, User userPayload) {
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("id", user_id)
				.body(userPayload).when().put(Routes.update_url);
		return response;

	}

	public static Response deleteUser(int user_id) {
		Response response = given()

				.pathParam("id", user_id).when().get(Routes.delete_url);
		return response;

	}
}
