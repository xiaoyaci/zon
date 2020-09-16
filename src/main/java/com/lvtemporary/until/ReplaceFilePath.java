package com.lvtemporary.until;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReplaceFilePath {

    public static void copy(String filename, String oldpath, String newpath) throws IOException {
        // TODO Auto-generated method stub
        File oldpaths = new File(oldpath + "/" + filename);
        File newpaths = new File(newpath + "/" + filename);
        if (!newpaths.exists()) {
            Files.copy(oldpaths.toPath(), newpaths.toPath());
        } else {
            newpaths.delete();
            Files.copy(oldpaths.toPath(), newpaths.toPath());
        }
    }

    public static void delete(String path) {

    }
}
