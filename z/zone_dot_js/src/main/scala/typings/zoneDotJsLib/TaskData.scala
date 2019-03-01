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

object TaskData {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    handleId: scala.Int | scala.Double = null,
    isPeriodic: js.UndefOr[scala.Boolean] = js.undefined
  ): TaskData = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (handleId != null) __obj.updateDynamic("handleId")(handleId.asInstanceOf[js.Any])
    if (!js.isUndefined(isPeriodic)) __obj.updateDynamic("isPeriodic")(isPeriodic)
    __obj.asInstanceOf[TaskData]
  }
}

