package com.example.franciscoandrade.finalapp.restApi.model;

import java.util.List;

/**
 * Created by franciscoandrade on 2/25/18.
 */

public class RootObject {
        public String status;
        public List<String> message;

    public String getStatus() {
        return status;
    }

    public List<String> getMessage() {
        return message;
    }
}
