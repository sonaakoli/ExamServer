package com.exam.ExamServer.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

   //user
    @ManyToOne(fetch =FetchType.EAGER )
    private User user;


}
