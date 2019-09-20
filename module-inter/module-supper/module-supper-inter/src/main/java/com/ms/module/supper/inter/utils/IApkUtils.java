package com.ms.module.supper.inter.utils;

public interface IApkUtils {

    String getAppName();

    String getVersionCode();

    String getVersionName();

    boolean isPackageInstalled(String packageName);

    String getMeta(String k);

    boolean isDebug();

    String getPackageName();

}
