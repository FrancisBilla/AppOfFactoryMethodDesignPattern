package io.turntabl.factory;

import io.turntabl.IServer;
import io.turntabl.concreteClasses.FTPServer;
import io.turntabl.concreteClasses.MailServer;
import io.turntabl.concreteClasses.QuantumServer;
import io.turntabl.concreteClasses.IbmServer;
public class ServerFactory {
    public static IServer getServer(String serverType) throws Exception {
        switch (serverType){
            case "ftp":
                return new FTPServer();
            case "mail":
                return new MailServer();
            case "quantum":
                return new QuantumServer();
            case "ibm":
                return new IbmServer();
            default:
                throw new Exception("Invalid Server type");
        }


    }
}
