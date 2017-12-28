package com.augmentum.oes.util;

import java.lang.reflect.Method;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.Constants;

public class SessionUtil {

    private static Object getSessionInThread() {
        @SuppressWarnings("static-access")
        Object session = AppContext.getAppContent().getObject(Constants.APP_CONTENT_SESSION);
        return session;
    }

    public static void addsession(String key, Object object) {
        Object session = getSessionInThread();

        if (session == null) {
            return;
        }

        try {
            Class<?> params [] = new Class[2];
            params[0] = String.class;
            params[1] = Object.class;

            Method method = session.getClass().getMethod("setAttribute", params);

            Object objects [] = new Object[2];
            objects[0] = key;
            objects[1] = object;

            method.invoke(session, objects);

        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

    public static Object getSession(String key) {
         Object session = getSessionInThread();
         if (session == null) {
            return null;
         }

         try {
             Class<?> params [] = new Class[1];
             params[0] = String.class;

             Method method = session.getClass().getMethod("getAttribute", params);

             Object objects [] = new Object[1];
             objects[0] = key;

             Object sesionAttribute =  method.invoke(session, objects);
             return sesionAttribute;
         } catch(Exception e) {
             new RuntimeException(e);
         }

         return null;
    }

    public static void removeSession(String key) {
        Object session = getSessionInThread();
        if (session == null) {
           return;
        }

        try {
            Class<?> params [] = new Class[1];
            params[0] = String.class;

            Method method = session.getClass().getMethod("removeAttribute", params);

            Object objects [] = new Object[1];
            objects[0] = key;

            method.invoke(session, objects);
        } catch(Exception e) {
            new RuntimeException(e);
        }
   }

    public static void invilidateSession() {
        Object session = getSessionInThread();
        if (session == null) {
           return;
        }

        try {
            Method method = session.getClass().getMethod("invalidate");
            method.invoke(session);
        } catch(Exception e) {
            new RuntimeException(e);
        }
   }
}
