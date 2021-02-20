package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneType extends StObject {
  
  /**
    * load patch for specified native module, allow user to
    * define their own patch, user can use this API after loading zone.js
    */
  def __load_patch(name: String, fn: PatchFn): Unit = js.native
  
  /**
    * Zone symbol API to generate a string with __zone_symbol__ prefix
    */
  def __symbol__(name: String): String = js.native
  
  /**
    * Verify that Zone has been correctly patched. Specifically that Promise is zone aware.
    */
  def assertZonePatched(): Unit = js.native
  
  /**
    * @returns {Zone} Returns the current [Zone]. The only way to change
    * the current zone is by invoking a run() method, which will update the current zone for the
    * duration of the run method callback.
    */
  var current: Zone = js.native
  
  /**
    * @returns {Task} The task associated with the current execution.
    */
  var currentTask: Task | Null = js.native
  
  /**
    *  Return the root zone.
    */
  var root: Zone = js.native
}
object ZoneType {
  
  @scala.inline
  def apply(
    __load_patch: (String, PatchFn) => Unit,
    __symbol__ : String => String,
    assertZonePatched: () => Unit,
    current: Zone,
    root: Zone
  ): ZoneType = {
    val __obj = js.Dynamic.literal(__load_patch = js.Any.fromFunction2(__load_patch), __symbol__ = js.Any.fromFunction1(__symbol__), assertZonePatched = js.Any.fromFunction0(assertZonePatched), current = current.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneType]
  }
  
  @scala.inline
  implicit class ZoneTypeMutableBuilder[Self <: ZoneType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertZonePatched(value: () => Unit): Self = StObject.set(x, "assertZonePatched", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrent(value: Zone): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTask(value: Task): Self = StObject.set(x, "currentTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTaskNull: Self = StObject.set(x, "currentTask", null)
    
    @scala.inline
    def setRoot(value: Zone): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__load_patch(value: (String, PatchFn) => Unit): Self = StObject.set(x, "__load_patch", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__symbol__(value: String => String): Self = StObject.set(x, "__symbol__", js.Any.fromFunction1(value))
  }
}
