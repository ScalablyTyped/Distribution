package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasTaskState extends js.Object {
  var change: TaskType
  var eventTask: scala.Boolean
  var macroTask: scala.Boolean
  var microTask: scala.Boolean
}

object HasTaskState {
  @scala.inline
  def apply(change: TaskType, eventTask: scala.Boolean, macroTask: scala.Boolean, microTask: scala.Boolean): HasTaskState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("eventTask")(eventTask)
    __obj.updateDynamic("macroTask")(macroTask)
    __obj.updateDynamic("microTask")(microTask)
    __obj.asInstanceOf[HasTaskState]
  }
}

