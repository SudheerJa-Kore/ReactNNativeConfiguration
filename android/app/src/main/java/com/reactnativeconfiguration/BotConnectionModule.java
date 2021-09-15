package com.reactnativeconfiguration;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class BotConnectionModule extends ReactContextBaseJavaModule {
    private Context context;
    private SharedPreferences sharedPreferences;
    private String preferenceName = "MashreqPreferences";
    private String BOT_ID = "BOT_ID";
    private String BOT_NAME = "BOT_NAME";
    private String IDENTITY = "IDENTITY";
    private String AUTHORIZATION = "AUTHORIZATION";
    private String XAUTH = "XAUTH";
    private String JWT_SERVER_URL = "JWT_SERVER_URL";
    private String KORE_BOT_SERVER_URL = "KORE_BOT_SERVER_URL";
    private String SERVER_URL = "SERVER_URL";
    private String Branding_SERVER_URL = "Branding_SERVER_URL";

    BotConnectionModule(ReactApplicationContext context) {
        super(context);
        this.context = context;
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
    }

    @ReactMethod
    public void initialize(String bot_id, String bot_name, String authorisation, String xauth, String identity,
                            String serverUrl, String jwtUrl, String brandingUrl)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(BOT_ID , bot_id);
        editor.putString(BOT_NAME, bot_name);
        editor.putString(AUTHORIZATION, authorisation);
        editor.putString(XAUTH, xauth);
        editor.putString(IDENTITY, identity);
        editor.putString(KORE_BOT_SERVER_URL, serverUrl);
        editor.putString(SERVER_URL, serverUrl);
        editor.putString(JWT_SERVER_URL, jwtUrl);
        editor.putString(Branding_SERVER_URL, brandingUrl);
        editor.commit();
    }

    @ReactMethod
    public void show()
    {
        Toast.makeText(context, "Pray the god", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getName() {
        return "BotConnectionModule";
    }
}

