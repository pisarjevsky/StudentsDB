package com.levelup.core;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Subject {
    @Getter
    @Setter
    private int subjectId;
    @Getter
    @Setter
    private String subjectName;
}
