package com.augmentum.oes;

import java.util.HashMap;
import java.util.Map;

import com.augmentum.oes.model.User;
import com.augmentum.oes.util.StringUtil;

public class AppContext {
    private static ThreadLocal<AppContext> appContentMap = new ThreadLocal<AppContext>();

    private static Map<String, Object> objects = new HashMap<String, Object>();

    private static String contextPath;

    public void addObject(String appUser, Object object) {
        if (object != null) {
            objects.put(appUser, object);
        }
    }

    public static Map<String, Object> getObjects() {
        return objects;
    }

    public static void setObjects(Map<String, Object> objects) {
        if (objects == null) {
            objects = new HashMap<String, Object>();
         }
        AppContext.objects = objects;
    }

    public static Object getObject(String key) {
        return objects.get(key);
    }

    @SuppressWarnings("static-access")
    public void clear() {
        AppContext appContent = appContentMap.get();
        if (appContent != null) {
            appContent.objects.clear();
        }
        appContent = null;
    }

    private AppContext() {};

    public static AppContext getAppContent() {
        AppContext appContent = appContentMap.get();
        if (appContent == null) {
            appContent = new AppContext();
            appContentMap.set(appContent);
        }

        return appContent;
    }

    public void removeObject(String key) {
        objects.remove(key);
    }

    public User getUser() {
        return (User) objects.get(Constants.APP_USER);
    }

    public String getUserName() {
        User user = (User) objects.get(Constants.APP_USER);
        if (user != null) {
            return user.getUserName();
        }
        return null;
    }

    public int getUserID() {
        User user = (User) objects.get(Constants.APP_USER);
        if (user != null) {
            return user.getId();
        }
        return 0;
    }

    public static void setContextPath(String contextPath) {
        if (!StringUtil.isEmpty(contextPath)) {
            AppContext.contextPath = contextPath;
        }
    }

    public static String getContextPath() {
        return contextPath;
    }
}
