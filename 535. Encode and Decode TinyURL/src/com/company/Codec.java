package com.company;

import java.util.HashMap;

public class Codec {
    HashMap<String,String> database;
    public Codec() {
        this.database=new HashMap<>();
    }
    private String getKey(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append((char)('a' + Math.random() * ('z' - 'a') ));
        }
        return sb.toString();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key=getKey();
        while (this.database.containsKey(key)){
            key=getKey();
        }
        database.put(key,longUrl);
        return "http://tinyurl.com/"+key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] tokens=shortUrl.split("/");
        String key=tokens[tokens.length-1];
        return this.database.get(key);
    }
}
