package com.teamdevroute.devroute.video.dto;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class TechStackDTO {

    private List<String> frontend;
    private List<String> backend;
    private List<String> mobile;
    private List<String> ai_data;

    // Getters and Setters

    // Constructor
    public TechStackDTO() {
        frontend = Arrays.asList("htmlcss", "javascript", "react", "Vuejs",
                "Angular");
        backend = Arrays.asList("python", "java", "spring", "nodejs");
        mobile = Arrays.asList("android", "ios");
        ai_data = Arrays.asList("ARTIFICIAL_INTELLIGENCE", "DATA_SCIENCE");
    }


}
