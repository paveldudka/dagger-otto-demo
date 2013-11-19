package com.inrix.models;

/**
 * Created by paveld on 11/18/13.
 */
public class MockAuth implements IAuth{
    @Override
    public String getAuthToken() {
       return "hello from MockAuth";
    }
}
