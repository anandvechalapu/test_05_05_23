package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.repository.JiraRepository;
import com.test.service.JiraService;

@RestController
public class JiraController {

    @Autowired
    private JiraService jiraService;

    @PostMapping("/saveJiraCredentials")
    public void saveJiraCredentials(@RequestParam String username, @RequestParam String password, @RequestParam String url, @RequestParam String repositoryName) {
        jiraService.saveJiraCredentials(username, password, url, repositoryName);
    }

    @PutMapping("/updateJiraCredentials")
    public void updateJiraCredentials(@RequestParam String username, @RequestParam String password, @RequestParam String url, @RequestParam String repositoryName) {
        jiraService.updateJiraCredentials(username, password, url, repositoryName);
    }

    @DeleteMapping("/deleteJiraCredentials")
    public void deleteJiraCredentials(@RequestParam String username, @RequestParam String password, @RequestParam String url, @RequestParam String repositoryName) {
        jiraService.deleteJiraCredentials(username, password, url, repositoryName);
    }

    @GetMapping("/readJiraCredentials")
    public void readJiraCredentials(@RequestParam String username, @RequestParam String password, @RequestParam String url, @RequestParam String repositoryName) {
        jiraService.readJiraCredentials(username, password, url, repositoryName);
    }

    @PostMapping("/validateJiraCredentials")
    public void validateJiraCredentials(@RequestParam String username, @RequestParam String password, @RequestParam String url, @RequestParam String repositoryName) {
        jiraService.validateJiraCredentials(username, password, url, repositoryName);
    }

    @GetMapping("/displayListWithTitleUserNameURLAction")
    public void displayListWithTitleUserNameURLAction() {
        jiraService.displayListWithTitleUserNameURLAction();
    }

    @GetMapping("/displayEditButtonAndDeleteButton")
    public void displayEditButtonAndDeleteButton() {
        jiraService.displayEditButtonAndDeleteButton();
    }

    @PutMapping("/changeNumberOfEntries")
    public void changeNumberOfEntries() {
        jiraService.changeNumberOfEntries();
    }

    @GetMapping("/displayPagination")
    public void displayPagination() {
        jiraService.displayPagination();
    }

    @PostMapping("/clickOnPagination")
    public void clickOnPagination() {
        jiraService.clickOnPagination();
    }

    @GetMapping("/displayAddMoreButton")
    public void displayAddMoreButton() {
        jiraService.displayAddMoreButton();
    }

    @PostMapping("/clickOnAddMoreButton")
    public void clickOnAddMoreButton() {
        jiraService.clickOnAddMoreButton();
    }

    @GetMapping("/displayPopUpForm")
    public void displayPopUpForm() {
        jiraService.displayPopUpForm();
    }
}