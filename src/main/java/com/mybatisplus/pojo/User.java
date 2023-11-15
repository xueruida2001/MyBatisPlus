package com.mybatisplus.pojo;

import lombok.*;
/*
@NoArgsConstructor//当使用了lombok后，无参构造可以直接这样写。如果想验证是否产生无参构造，可以在右侧M的lifestyle选择compile，在target目录中会看到已经生成了无参构造
@AllArgsConstructor//通过lombok生成有参构造
@Getter
@Setter
@EqualsAndHashCode//使用lombot生成toString方法*/
//上面的NoArgsConstructor、Getter、Setter、EqualsAndHashCode函数可以直接使用@Data实现，但是有参构造不能通过@Data实现
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String last_name;
    private String email;
    private String gender;
    private int age;

}
