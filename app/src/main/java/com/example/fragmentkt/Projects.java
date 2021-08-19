package com.example.fragmentkt;

public class Projects {



    private String id,name,status,sign_key,vendor_key,recording_server,created;

    public Projects() {
    }

    public Projects(String id, String name, String status, String sign_key, String vendor_key, String recording_server, String created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.sign_key = sign_key;
        this.vendor_key = vendor_key;
        this.recording_server = recording_server;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSign_key() {
        return sign_key;
    }

    public void setSign_key(String sign_key) {
        this.sign_key = sign_key;
    }

    public String getVendor_key() {
        return vendor_key;
    }

    public void setVendor_key(String vendor_key) {
        this.vendor_key = vendor_key;
    }

    public String getRecording_server() {
        return recording_server;
    }

    public void setRecording_server(String recording_server) {
        this.recording_server = recording_server;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
