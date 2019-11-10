package io.turntabl;

import io.turntabl.factory.ServerFactory;

import java.util.Scanner;

public class ServerManagementTool {

    public static void main(String[] args) throws Exception {

        //WHAT TYPE OF SERVER?
        Scanner input = new Scanner(System.in);
        System.out.println("Which server do you want to resole?");
        String serverResult = input.nextLine();


        IServer server = ServerFactory.getServer(serverResult);
        server.resolve();

    }
}
