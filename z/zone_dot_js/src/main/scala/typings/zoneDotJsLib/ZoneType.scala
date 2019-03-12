package typings
package zoneDotJsLib

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
  var currentTask: Task | scala.Null
  /**
    *  Return the root zone.
    */
  var root: Zone
  /**
    * Verify that Zone has been correctly patched. Specifically that Promise is zone aware.
    */
  def assertZonePatched(): scala.Unit
}

object ZoneType {
  @scala.inline
  def apply(assertZonePatched: () => scala.Unit, current: Zone, root: Zone, currentTask: Task = null): ZoneType = {
    val __obj = js.Dynamic.literal(assertZonePatched = js.Any.fromFunction0(assertZonePatched), current = current, root = root)
    if (currentTask != null) __obj.updateDynamic("currentTask")(currentTask)
    __obj.asInstanceOf[ZoneType]
  }
}

