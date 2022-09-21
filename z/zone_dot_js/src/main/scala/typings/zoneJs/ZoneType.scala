package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneType extends StObject {
  
  /**
    * load patch for specified native module, allow user to
    * define their own patch, user can use this API after loading zone.js
    */
  def __load_patch(name: String, fn: PatchFn): Unit = js.native
  def __load_patch(name: String, fn: PatchFn, ignoreDuplicate: Boolean): Unit = js.native
  
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
