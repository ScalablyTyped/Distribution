package typings.zoneJs

import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import typings.std.ThisType
import typings.zoneJs.anon.ADDEVENTLISTENERSTR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _ZonePrivate interface to provide helper method to help user implement
  * their own monkey patch module.
  */
@js.native
trait ZonePrivate extends StObject {
  
  def ArraySlice(): js.Array[Any] = js.native
  def ArraySlice(start: Double): js.Array[Any] = js.native
  def ArraySlice(start: Double, end: Double): js.Array[Any] = js.native
  def ArraySlice(start: Unit, end: Double): js.Array[Any] = js.native
  
  def ObjectCreate(): Any = js.native
  def ObjectCreate(o: js.Object): Any = js.native
  def ObjectCreate(o: js.Object, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  def ObjectCreate(o: Null, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  
  def ObjectDefineProperty(o: Any, p: PropertyKey, attributes: js.PropertyDescriptor & ThisType[Any]): Any = js.native
  
  def ObjectGetOwnPropertyDescriptor(o: Any, p: PropertyKey): js.UndefOr[js.PropertyDescriptor] = js.native
  
  def _redefineProperty(target: Any, callback: String, desc: Any): Unit = js.native
  
  def attachOriginToPatched(target: Any, origin: Any): Unit = js.native
  
  def bindArguments(args: js.Array[Any], source: String): js.Array[Any] = js.native
  
  def currentZoneFrame(): ZoneFrame = js.native
  
  def filterProperties(target: Any, onProperties: js.Array[String], ignoreProperties: js.Array[Any]): js.Array[String] = js.native
  
  def getGlobalObjects(): js.UndefOr[ADDEVENTLISTENERSTR] = js.native
  
  def isIEOrEdge(): Boolean = js.native
  
  def microtaskDrainDone(): Unit = js.native
  
  def nativeScheduleMicroTask(func: js.Function): Unit = js.native
  
  def onUnhandledError(error: js.Error): Unit = js.native
  
  def patchCallbacks(api: ZonePrivate, target: Any, targetName: String, method: String, callbacks: js.Array[String]): Unit = js.native
  
  def patchClass(className: String): Unit = js.native
  
  def patchEventPrototype(_global: Any, api: ZonePrivate): Unit = js.native
  
  def patchEventTarget(global: Any, api: ZonePrivate, apis: js.Array[Any]): js.Array[Boolean] = js.native
  def patchEventTarget(global: Any, api: ZonePrivate, apis: js.Array[Any], options: Any): js.Array[Boolean] = js.native
  
  def patchMacroTask(
    obj: Any,
    funcName: String,
    metaCreator: js.Function2[/* self */ Any, /* args */ js.Array[Any], Any]
  ): Unit = js.native
  
  def patchMethod(
    target: Any,
    name: String,
    patchFn: js.Function3[
      /* delegate */ js.Function, 
      /* delegateName */ String, 
      /* name */ String, 
      js.Function2[/* self */ Any, /* args */ js.Array[Any], Any]
    ]
  ): js.Function | Null = js.native
  
  def patchOnProperties(obj: Any): Unit = js.native
  def patchOnProperties(obj: Any, properties: js.Array[String]): Unit = js.native
  def patchOnProperties(obj: Any, properties: js.Array[String], prototype: Any): Unit = js.native
  def patchOnProperties(obj: Any, properties: Null, prototype: Any): Unit = js.native
  
  def patchThen(ctro: js.Function): Unit = js.native
  
  def scheduleMicroTask(): Unit = js.native
  def scheduleMicroTask(task: MicroTask): Unit = js.native
  
  def showUncaughtError(): Boolean = js.native
  
  def symbol(name: String): String = js.native
  
  def wrapWithCurrentZone(callback: Any, source: String): Any = js.native
}
