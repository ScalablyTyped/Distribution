package typings.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `microTask`, `macroTask`, `eventTask`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.zoneJs.zoneJsStrings.microTask
  - typings.zoneJs.zoneJsStrings.macroTask
  - typings.zoneJs.zoneJsStrings.eventTask
*/
trait TaskType extends js.Object

object TaskType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventTask: typings.zoneJs.zoneJsStrings.eventTask = this.cast("eventTask")
  @scala.inline
  def macroTask: typings.zoneJs.zoneJsStrings.macroTask = this.cast("macroTask")
  @scala.inline
  def microTask: typings.zoneJs.zoneJsStrings.microTask = this.cast("microTask")
}

