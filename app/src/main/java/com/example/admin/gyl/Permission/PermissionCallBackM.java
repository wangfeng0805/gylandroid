package com.example.admin.gyl.Permission;

/**
 * Ȩ���������ķ�װ
 * Created by Administrator on 2017/5/10.
 */

public interface PermissionCallBackM {
    void onPermissionGrantedM(int requestCode, String... perms);
    void onPermissionDeniedM(int requestCode, String... perms);
}
