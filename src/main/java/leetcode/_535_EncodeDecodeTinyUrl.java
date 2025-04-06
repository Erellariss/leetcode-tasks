package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _535_EncodeDecodeTinyUrl {

    private Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = Integer.toString(longUrl.hashCode());
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
