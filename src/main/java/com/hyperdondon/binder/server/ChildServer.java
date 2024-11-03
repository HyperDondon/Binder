package com.hyperdondon.binder.server;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChildServer{
    public String Jar;
    public String WorkPath;
    public String Name;
    public Server Parent;
}
