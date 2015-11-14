package resources;

import java.io.InputStream;
public class ResourceLoader {

	static ResourceLoader rl = new ResourceLoader();

	public static InputStream loadImage(String name) {
		return rl.getClass().getResourceAsStream("files/" + name);
	}
}
