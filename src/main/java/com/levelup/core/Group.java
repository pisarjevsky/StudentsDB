package com.levelup.core;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Group {
    @Getter
    @Setter
    private int groupId;
    @Getter
    @Setter
    private String groupName;
    @Getter
    @Setter
    private int groupCapacity;
    @Getter
    @Setter
    private int groupCourse;
}
