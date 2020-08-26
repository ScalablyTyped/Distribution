package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
@js.native
trait TaskData extends js.Object {
  /**
    * Delay in milliseconds when the Task will run.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * identifier returned by the native setTimeout.
    */
  var handleId: js.UndefOr[Double] = js.native
  /**
    * A periodic [MacroTask] is such which get automatically rescheduled after it is executed.
    */
  var isPeriodic: js.UndefOr[Boolean] = js.native
}

object TaskData {
  @scala.inline
  def apply(): TaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskData]
  }
  @scala.inline
  implicit class TaskDataOps[Self <: TaskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHandleId(value: Double): Self = this.set("handleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleId: Self = this.set("handleId", js.undefined)
    @scala.inline
    def setIsPeriodic(value: Boolean): Self = this.set("isPeriodic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPeriodic: Self = this.set("isPeriodic", js.undefined)
  }
  
}

