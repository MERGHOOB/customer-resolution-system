package com.margub.customerresolutionsystem.service;

import com.margub.customerresolutionsystem.service.enums.IssueType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Agent {

    private String agentId;
    private String email;
    private String name;
    private List<IssueType> expertise;

    private boolean isAvailable;

    public Agent(String agentId, String email, String name, List<IssueType> expertise) {
        this.agentId = agentId;
        this.email = email;
        this.name = name;
        this.expertise = expertise;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
