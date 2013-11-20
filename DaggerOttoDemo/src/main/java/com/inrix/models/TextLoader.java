package com.inrix.models;

/**
 * Created by paveld on 11/20/13.
 */
public class TextLoader {
    private IHttpClient client;

    public TextLoader(IHttpClient client)
    {
        this.client = client;
    }

    public String loadText()
    {
        return this.client.performRequest();
    }
}
