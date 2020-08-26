package typings.zoneJs

import typings.std.Error
import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import typings.std.ThisType
import typings.zoneJs.anon.ADDEVENTLISTENERSTR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _ZonePrivate interface to provide helper method to help user implement
  * their own monkey patch module.
  */
@js.native
trait ZonePrivate extends js.Object {
  def ArraySlice(): js.Array[_] = js.native
  def ArraySlice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[_] = js.native
  def ArraySlice(start: Double): js.Array[_] = js.native
  def ArraySlice(start: Double, end: Double): js.Array[_] = js.native
  def ObjectCreate(): js.Any = js.native
  def ObjectCreate(o: js.Object): js.Any = js.native
  def ObjectCreate(o: js.Object, properties: PropertyDescriptorMap with ThisType[_]): js.Any = js.native
  def ObjectCreate(o: Null, properties: PropertyDescriptorMap with ThisType[_]): js.Any = js.native
  def ObjectDefineProperty(o: js.Any, p: PropertyKey, attributes: PropertyDescriptor with ThisType[_]): js.Any = js.native
  def ObjectGetOwnPropertyDescriptor(o: js.Any, p: PropertyKey): js.UndefOr[PropertyDescriptor] = js.native
  def _redefineProperty(target: js.Any, callback: String, desc: js.Any): Unit = js.native
  def attachOriginToPatched(target: js.Any, origin: js.Any): Unit = js.native
  def bindArguments(args: js.Array[_], source: String): js.Array[_] = js.native
  def currentZoneFrame(): ZoneFrame = js.native
  def filterProperties(target: js.Any, onProperties: js.Array[String], ignoreProperties: js.Array[_]): js.Array[String] = js.native
  def getGlobalObjects(): js.UndefOr[ADDEVENTLISTENERSTR] = js.native
  def isIEOrEdge(): Boolean = js.native
  def microtaskDrainDone(): Unit = js.native
  def onUnhandledError(error: Error): Unit = js.native
  def patchCallbacks(api: ZonePrivate, target: js.Any, targetName: String, method: String, callbacks: js.Array[String]): Unit = js.native
  def patchClass(className: String): Unit = js.native
  def patchEventPrototype(_global: js.Any, api: ZonePrivate): Unit = js.native
  def patchEventTarget(global: js.Any, apis: js.Array[_]): js.Array[Boolean] = js.native
  def patchEventTarget(global: js.Any, apis: js.Array[_], options: js.Any): js.Array[Boolean] = js.native
  def patchMacroTask(
    obj: js.Any,
    funcName: String,
    metaCreator: js.Function2[/* self */ js.Any, /* args */ js.Array[_], _]
  ): Unit = js.native
  def patchMethod(
    target: js.Any,
    name: String,
    patchFn: js.Function3[
      /* delegate */ js.Function, 
      /* delegateName */ String, 
      /* name */ String, 
      js.Function2[/* self */ _, /* args */ js.Array[_], _]
    ]
  ): js.Function | Null = js.native
  def patchOnProperties(obj: js.Any): Unit = js.native
  def patchOnProperties(obj: js.Any, properties: js.Array[String]): Unit = js.native
  def patchOnProperties(obj: js.Any, properties: js.Array[String], prototype: js.Any): Unit = js.native
  def patchOnProperties(obj: js.Any, properties: Null, prototype: js.Any): Unit = js.native
  def patchThen(ctro: js.Function): Unit = js.native
  def scheduleMicroTask(): Unit = js.native
  def scheduleMicroTask(task: MicroTask): Unit = js.native
  def setNativePromise(nativePromise: js.Any): Unit = js.native
  def showUncaughtError(): Boolean = js.native
  def symbol(name: String): String = js.native
  def wrapWithCurrentZone(callback: js.Any, source: String): js.Any = js.native
}

