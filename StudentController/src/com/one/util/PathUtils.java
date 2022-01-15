package com.one.util;

public class PathUtils {

    private static final String P_PATH="StudentController\\imgs\\";

    public static String getRealPath(String relativePath){

        return P_PATH+relativePath;
    }

}
