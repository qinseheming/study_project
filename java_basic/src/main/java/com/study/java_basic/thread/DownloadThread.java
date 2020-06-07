package com.study.java_basic.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadThread implements Runnable {
    private String url;
    private String name;

    public DownloadThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
