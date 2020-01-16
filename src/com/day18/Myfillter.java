package com.day18;


import java.io.File;
import java.io.FileFilter;

class MyFilter implements FileFilter{

    /*public boolean accept(File pathname) {
        return false;
    }*/
    //如果是文件夹或者是以 “.java”结尾的，就返回 true，否则返回 false
    public boolean accept(File file){
        if(file.isDirectory()){
            return true;
        }else {
            String name = file.getName();
            if(name.endsWith(".java")){
                return true;
            }else {
                return false;
            }
        }
    }

}