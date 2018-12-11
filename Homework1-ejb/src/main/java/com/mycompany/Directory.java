/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedList;

/**
 * 
 * @author Orazio & Alessandro
 */
public class Directory {

    private LinkedList<MyFile> files;
    private LinkedList<Directory> directories;
    private String name;
    private String lastModified;
    private String lastAccessTime;
    private String creationTime;

    /**
     * 
     * @param name 
     */
    public Directory(String name) {
        this.files = new LinkedList<MyFile>();
        this.directories = new LinkedList<Directory>();
        this.name = name;
        this.lastModified = null;
        this.lastAccessTime = null;
        this.creationTime = null;
    }
    
    /**
     * 
     * @param name
     * @param lastModified
     * @param lastAccessTime
     * @param creationTime 
     */
    public Directory(String name, String lastModified, String lastAccessTime, String creationTime) {
        this.files = new LinkedList<MyFile>();
        this.directories = new LinkedList<Directory>();
        this.name = name;
        this.lastModified = lastModified;
        this.lastAccessTime = lastAccessTime;
        this.creationTime = creationTime;
    }
    
    @JsonProperty("files")
    public LinkedList<MyFile> getFiles() {
        return files;
    }
    
    @JsonProperty("directories")
    public LinkedList<Directory> getDirectories() {
        return directories;
    }
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    
    public void addDirectory(String name) {
        this.directories.add(new Directory(name));
    }
    
    public void addFile(String name) {
        this.files.add(new MyFile(name));
    }
    
    public void removeDirectory(String name) {
        this.directories.removeIf(p->p.getName().equals(name));
    }
    
    public void removeFile(String name) {
        this.files.removeIf(p->p.getName().equals(name));
    }

    public String getLastModified() {
        return lastModified;
    }
    
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
    
    public String getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public String getCeationTime() {
        return creationTime;
    }

    public void setCeationTime(String creationTime) {
        this.creationTime = creationTime;
    }
    
}
