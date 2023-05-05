package com.test.service;

import com.test.repository.JiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraService {

    @Autowired
    private JiraRepository jiraRepository;

    public void saveJiraCredentials(String username, String password, String url, String repositoryName) {
        jiraRepository.saveJiraCredentials(username, password, url, repositoryName);
    }

    public void updateJiraCredentials(String username, String password, String url, String repositoryName) {
        jiraRepository.updateJiraCredentials(username, password, url, repositoryName);
    }

    public void deleteJiraCredentials(String username, String password, String url, String repositoryName) {
        jiraRepository.deleteJiraCredentials(username, password, url, repositoryName);
    }

    public void readJiraCredentials(String username, String password, String url, String repositoryName) {
        jiraRepository.readJiraCredentials(username, password, url, repositoryName);
    }

    public void validateJiraCredentials(String username, String password, String url, String repositoryName) {
        jiraRepository.validateJiraCredentials(username, password, url, repositoryName);
    }

    public void displayListWithTitleUserNameURLAction() {
        jiraRepository.displayListWithTitleUserNameURLAction();
    }

    public void displayEditButtonAndDeleteButton() {
        jiraRepository.displayEditButtonAndDeleteButton();
    }

    public void changeNumberOfEntries() {
        jiraRepository.changeNumberOfEntries();
    }

    public void displayPagination() {
        jiraRepository.displayPagination();
    }

    public void clickOnPagination() {
        jiraRepository.clickOnPagination();
    }

    public void displayAddMoreButton() {
        jiraRepository.displayAddMoreButton();
    }

    public void clickOnAddMoreButton() {
        jiraRepository.clickOnAddMoreButton();
    }

    public void displayPopUpForm() {
        jiraRepository.displayPopUpForm();
    }

}