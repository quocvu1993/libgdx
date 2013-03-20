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

public class GdxCollisionObjectBridge {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GdxCollisionObjectBridge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(GdxCollisionObjectBridge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_GdxCollisionObjectBridge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserValue(int value) {
    gdxBulletJNI.GdxCollisionObjectBridge_userValue_set(swigCPtr, this, value);
  }

  public int getUserValue() {
    return gdxBulletJNI.GdxCollisionObjectBridge_userValue_get(swigCPtr, this);
  }

  public GdxCollisionObjectBridge() {
    this(gdxBulletJNI.new_GdxCollisionObjectBridge(), true);
  }

}
