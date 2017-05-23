package hello;

/**
 * Data object sent in requests and responses.
 */
public class Greeting {
	public long id; 
	public String content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
