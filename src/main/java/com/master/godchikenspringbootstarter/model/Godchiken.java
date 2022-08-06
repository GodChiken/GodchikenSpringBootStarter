package com.master.godchikenspringbootstarter.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Godchiken {
    String name;
    int howLong;
}
