package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
trait TaskData extends js.Object {
  /**
    * Delay in milliseconds when the Task will run.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * identifier returned by the native setTimeout.
    */
  var handleId: js.UndefOr[Double] = js.undefined
  /**
    * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
    */
  var isPeriodic: js.UndefOr[Boolean] = js.undefined
}

object TaskData {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    handleId: js.UndefOr[Double] = js.undefined,
    isPeriodic: js.UndefOr[Boolean] = js.undefined
  ): TaskData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleId)) __obj.updateDynamic("handleId")(handleId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPeriodic)) __obj.updateDynamic("isPeriodic")(isPeriodic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskData]
  }
}

