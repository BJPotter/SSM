package com.root.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * users
 * @author 
 */
@Data
public class User implements Serializable {
    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}