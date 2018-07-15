package com.chain.finalapp;

public class Suggestion {

    private String topic;
    private String suggestion;

    public  Suggestion(){

    }

    public Suggestion(String topic, String suggestion) {
        this.topic = topic;
        this.suggestion = suggestion;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getTopic() {
        return topic;
    }

    public String getSuggestion() {
        return suggestion;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "topic='" + topic + '\'' +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
