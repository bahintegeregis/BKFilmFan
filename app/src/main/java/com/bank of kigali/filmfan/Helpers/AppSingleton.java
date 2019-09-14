package com.bankofkigali.filmfan.Helpers;

class AppSingleton {
    private static final AppSingleton ourInstance = new AppSingleton();

    static AppSingleton getInstance() {
        return ourInstance;
    }

    private AppSingleton() {
    }
}
