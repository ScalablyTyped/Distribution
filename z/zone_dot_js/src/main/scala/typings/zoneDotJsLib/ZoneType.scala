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

