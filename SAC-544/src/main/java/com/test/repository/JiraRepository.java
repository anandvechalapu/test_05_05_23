package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraRepository extends JpaRepository {

    // add methods to save, update, delete and read Jira credentials

    public void saveJiraCredentials(String username, String password, String url, String repositoryName);

    public void updateJiraCredentials(String username, String password, String url, String repositoryName);

    public void deleteJiraCredentials(String username, String password, String url, String repositoryName);

    public void readJiraCredentials(String username, String password, String url, String repositoryName);

    public void validateJiraCredentials(String username, String password, String url, String repositoryName);

    public void displayListWithTitleUserNameURLAction();

    public void displayEditButtonAndDeleteButton();

    public void changeNumberOfEntries();

    public void displayPagination();

    public void clickOnPagination();

    public void displayAddMoreButton();

    public void clickOnAddMoreButton();
    
    public void displayPopUpForm();

}