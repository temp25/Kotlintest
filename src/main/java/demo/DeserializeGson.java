package demo;

import java.util.List;
import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

class Container {
	int a;
	String b;
	boolean c;
}

class ListOf<T> implements ParameterizedType {
	private final Class<T> type;

	public ListOf(Class<T> type) {
		this.type = type;
	}

	@Override
	public Type[] getActualTypeArguments() {
		return new Type[] { type };
	}

	@Override
	public Type getRawType() {
		return List.class;
	}

	@Override
	public Type getOwnerType() {
		return null;
	}
}

public class DeserializeGson {
	public <T> List<T> getUsingGeneric(String json, Class<T> type) throws Exception {
		return new Gson().fromJson(json, new ListOf<T>(type));
	}

	public static void main(String[] args) throws Exception {
		final String json = 
		" [ " +
			" { " +
				" \"a\": 100, " +
				" \"b\": \"value1\", " +
				" \"c\": true " +
				" }, " +
				" { " +
				" \"a\": 200, " +
				" \"b\": \"value2\", " +
				" \"c\": false " +
				" }, " +
				" { " +
				" \"a\": 300, " +
				" \"b\": \"value3\", " +
				" \"c\": true " +
			" } " +
		" ] ";

		for (Container c : new DeserializeGson().getUsingGeneric(json, Container.class) ) {
			System.out.printf("\n %d %s %b", c.a, c.b, c.c);
		}
	}
}
