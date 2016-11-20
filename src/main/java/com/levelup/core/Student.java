package com.levelup.core;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Getter
    @Setter
    private int studentId;
    @Getter
    @Setter
    private String studentFirstName;
    @Getter
    @Setter
    private String studentMiddleName;
    @Getter
    @Setter
    private String studentLastName;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private String groupName;
    @Getter
    @Setter
    private boolean isStateStudent;
    @Getter
    @Setter
    private String studyFrom;
    @Getter
    @Setter
    private String phoneNumber;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String address;
    @Getter
    @Setter
    private String city;
}
