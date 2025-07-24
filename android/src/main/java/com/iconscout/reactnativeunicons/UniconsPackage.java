package com.iconscout.reactnativeunicons;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.List;

/**
 * Shim to satisfy autolinking imports like
 *   import com.iconscout.reactnativeunicons.UniconsPackage;
 * It simply delegates to the original implementation living under com.reactlibrary.
 */
public final class UniconsPackage implements ReactPackage {

  private final com.reactlibrary.UniconsPackage delegate = new com.reactlibrary.UniconsPackage();

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return delegate.createNativeModules(reactContext);
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return delegate.createViewManagers(reactContext);
  }
}
