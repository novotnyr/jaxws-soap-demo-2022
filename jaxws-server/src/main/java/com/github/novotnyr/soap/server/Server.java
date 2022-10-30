package com.github.novotnyr.soap.server;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/terms", new DefaultTermService());
    }
}