package hello;

/**
 * Data object sent in requests and responses.
 */
public class Greeting {

	public long id;
	public String content;
	public Child c1;

	public static class Child {
		public String fieldA;
	}
}
