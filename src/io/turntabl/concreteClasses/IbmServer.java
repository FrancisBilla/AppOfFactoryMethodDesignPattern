package io.turntabl.concreteClasses;

import io.turntabl.IServer;

public class IbmServer implements IServer {

    @Override
    public void resolve() {
        System.out.println("Performing analysis");
        System.out.println("Server Fixed");
    }
}
