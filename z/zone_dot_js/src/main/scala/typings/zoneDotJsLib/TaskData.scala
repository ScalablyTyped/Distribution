package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 */

trait TaskData extends js.Object {
  /**
       * Delay in milliseconds when the Task will run.
       */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
       * identifier returned by the native setTimeout.
       */
  var handleId: js.UndefOr[scala.Double] = js.undefined
  /**
       * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
       */
  var isPeriodic: js.UndefOr[scala.Boolean] = js.undefined
}

