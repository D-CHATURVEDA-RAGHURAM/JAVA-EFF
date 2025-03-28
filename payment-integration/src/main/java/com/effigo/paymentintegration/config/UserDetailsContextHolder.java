package com.effigo.paymentintegration.config;

public class UserDetailsContextHolder {
    private static final InheritableThreadLocal<LoggedInUserDetailsDto> threadLocal = new InheritableThreadLocal<>();

    public static void setUserDetails(LoggedInUserDetailsDto userDetails) {
        threadLocal.set(userDetails);

    }

    public static  LoggedInUserDetailsDto getUserDetails() {
        return threadLocal.get();
    }

    public static  void clear() {
        threadLocal.remove();
    }
}
