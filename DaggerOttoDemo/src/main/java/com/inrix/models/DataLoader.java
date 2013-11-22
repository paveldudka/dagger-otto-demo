package com.inrix.models;

import com.inrix.network.IHttpClient;

/**
 * Created by paveld on 11/20/13.
 */
public class DataLoader {
    private IHttpClient client;

    public DataLoader(IHttpClient client)
    {
        this.client = client;
    }

    public String loadData()
    {
        return this.client.performRequest();
    }
}
