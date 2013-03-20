/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class BaseContactAddedListener {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BaseContactAddedListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BaseContactAddedListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_BaseContactAddedListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void enable() {
    gdxBulletJNI.BaseContactAddedListener_enable(swigCPtr, this);
  }

  public void disable() {
    gdxBulletJNI.BaseContactAddedListener_disable(swigCPtr, this);
  }

  public boolean isEnabled() {
    return gdxBulletJNI.BaseContactAddedListener_isEnabled(swigCPtr, this);
  }

  public BaseContactAddedListener() {
    this(gdxBulletJNI.new_BaseContactAddedListener(), true);
  }

}
