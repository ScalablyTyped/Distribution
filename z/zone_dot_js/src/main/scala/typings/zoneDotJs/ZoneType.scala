package typings.zoneDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneType extends js.Object {
  /**
    * @returns {Zone} Returns the current [Zone]. The only way to change
    * the current zone is by invoking a run() method, which will update the current zone for the
    * duration of the run method callback.
    */
  var current: Zone
  /**
    * @returns {Task} The task associated with the current execution.
    */
  var currentTask: Task | Null
  /**
    *  Return the root zone.
    */
  var root: Zone
  /**
    * load patch for specified native module, allow user to
    * define their own patch, user can use this API after loading zone.js
    */
  def __load_patch(name: String, fn: _PatchFn): Unit
  /**
    * Zone symbol API to generate a string with __zone_symbol__ prefix
    */
  def __symbol__(name: String): String
  /**
    * Verify that Zone has been correctly patched. Specifically that Promise is zone aware.
    */
  def assertZonePatched(): Unit
}

object ZoneType {
  @scala.inline
  def apply(
    __load_patch: (String, _PatchFn) => Unit,
    __symbol__ : String => String,
    assertZonePatched: () => Unit,
    current: Zone,
    root: Zone,
    currentTask: Task = null
  ): ZoneType = {
    val __obj = js.Dynamic.literal(__load_patch = js.Any.fromFunction2(__load_patch), __symbol__ = js.Any.fromFunction1(__symbol__), assertZonePatched = js.Any.fromFunction0(assertZonePatched), current = current, root = root)
    if (currentTask != null) __obj.updateDynamic("currentTask")(currentTask)
    __obj.asInstanceOf[ZoneType]
  }
}

