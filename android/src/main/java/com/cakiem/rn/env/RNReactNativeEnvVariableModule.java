
package com.cakiem.rn.env;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Field;

public class RNReactNativeEnvVariableModule extends ReactContextBaseJavaModule {

//  private final ReactApplicationContext reactContext;
//
//  public RNReactNativeEnvVariableModule(ReactApplicationContext reactContext) {
//    super(reactContext);
//    this.reactContext = reactContext;
//  }

  @Override
  public String getName() {
    return "RNReactNativeEnvVariable";
  }

  private Class buildConfigClass;
  private String NAME = "RNBuildConfig";

  public RNReactNativeEnvVariableModule(ReactApplicationContext reactContext, Class buildConfigClass) {
    super(reactContext);
    this.buildConfigClass = buildConfigClass;
  }


  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();

    Field[] fields = buildConfigClass.getDeclaredFields();
    for (Field f : fields) {
      try {
        constants.put(f.getName(), f.get(null));
      } catch (IllegalAccessException e) {
        Log.d(NAME, "Could not access BuildConfig field " + f.getName());
      }
    }
    final Map<String, Object> constantsReturn = new HashMap<>();
    constantsReturn.put("environment", constants);
    return constantsReturn;
  }
}