package ua.lviv.iot.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class PositionInformation {
    private String occupation;
    private String name;
    private int age;
    private String educationDegree;
    private int workExperience;

}