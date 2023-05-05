package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JiraCredentials {

    @Id
    private String username;
    private String password;
    private String url;
    private String repositoryName;

    public JiraCredentials() {
    }

    public JiraCredentials(String username, String password, String url, String repositoryName) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.repositoryName = repositoryName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

}