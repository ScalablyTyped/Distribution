package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * store
  */
@js.native
trait StoreStatic extends StObject {
  
  def clear(): Unit = js.native
  
  def deserialize[T](value: String): T = js.native
  
  var enable: Boolean = js.native
  
  def forEach[T](cb: js.Function2[/* key */ String, /* value */ T, Any]): Any = js.native
  
  def get[T](key: String): T = js.native
  
  def getAll[T](): T = js.native
  
  def getItem(key: String): String = js.native
  
  def key(index: Double): String = js.native
  
  def length(): Double = js.native
  
  var page: Any = js.native
  
  def pageClear(): Any = js.native
  
  def pageGet(key: String): Any = js.native
  
  def pageRemove(key: String): Any = js.native
  
  def pageSave(): Any = js.native
  
  def pageSet(key: String, value: Any): Any = js.native
  
  def remove(key: String): Any = js.native
  
  def removeItem(key: String): Any = js.native
  
  def serialize(value: Any): String = js.native
  
  def set[T](key: String): Any = js.native
  def set[T](key: String, value: T): Any = js.native
  
  def setItem(key: String, value: Any): Any = js.native
  
  var storage: Any = js.native
}
