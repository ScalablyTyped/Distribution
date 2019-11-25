package typings.zoneDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasTaskState extends js.Object {
  var change: TaskType
  var eventTask: Boolean
  var macroTask: Boolean
  var microTask: Boolean
}

object HasTaskState {
  @scala.inline
  def apply(change: TaskType, eventTask: Boolean, macroTask: Boolean, microTask: Boolean): HasTaskState = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], eventTask = eventTask.asInstanceOf[js.Any], macroTask = macroTask.asInstanceOf[js.Any], microTask = microTask.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HasTaskState]
  }
}

