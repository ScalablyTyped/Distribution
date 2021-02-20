package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * store
  */
@js.native
trait StoreStatic extends StObject {
  
  def clear(): Unit = js.native
  
  def deserialize[T](value: String): T = js.native
  
  var enable: Boolean = js.native
  
  def forEach[T](cb: js.Function2[/* key */ String, /* value */ T, _]): js.Any = js.native
  
  def get[T](key: String): T = js.native
  
  def getAll[T](): T = js.native
  
  def getItem(key: String): String = js.native
  
  def key(index: Double): String = js.native
  
  def length(): Double = js.native
  
  var page: js.Any = js.native
  
  def pageClear(): js.Any = js.native
  
  def pageGet(key: String): js.Any = js.native
  
  def pageRemove(key: String): js.Any = js.native
  
  def pageSave(): js.Any = js.native
  
  def pageSet(key: String, value: js.Any): js.Any = js.native
  
  def remove(key: String): js.Any = js.native
  
  def removeItem(key: String): js.Any = js.native
  
  def serialize(value: js.Any): String = js.native
  
  def set[T](key: String): js.Any = js.native
  def set[T](key: String, value: T): js.Any = js.native
  
  def setItem(key: String, value: js.Any): js.Any = js.native
  
  var storage: js.Any = js.native
}
