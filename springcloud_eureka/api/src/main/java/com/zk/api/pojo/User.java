package com.zk.api.pojo;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;

    private Integer age;

    private String addr;
}
