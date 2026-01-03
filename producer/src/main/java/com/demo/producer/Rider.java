package com.demo.producer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rider {
    public String id;
    public String name;
    public String location;
}