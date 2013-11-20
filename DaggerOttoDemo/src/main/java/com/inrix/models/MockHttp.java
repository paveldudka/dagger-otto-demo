package com.inrix.models;

/**
 * Created by paveld on 11/20/13.
 */
public class MockHttp implements IHttpClient{
    @Override
    public String performRequest() {
        return "hello from MockHttp";
    }
}
