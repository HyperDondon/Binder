package com.hyperdondon.binder.server;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Server {
    public String Path;
    public ArrayList<ChildServer> Children;
    public String Name;
}
