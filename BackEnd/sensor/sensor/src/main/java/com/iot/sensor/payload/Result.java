package com.iot.sensor.payload;

public class Result {
    private boolean result;

    public Result(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
