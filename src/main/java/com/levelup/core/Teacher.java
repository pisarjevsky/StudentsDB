package com.levelup.core;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    @Getter
    @Setter
    private int teacherId;
    @Getter
    @Setter
    private String teacherFirstName;
    @Getter
    @Setter
    private String teacherMiddleName;
    @Getter
    @Setter
    private String teacherLastName;
    @Getter
    @Setter
    private String subjectName;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private boolean isOnDuty;
}
