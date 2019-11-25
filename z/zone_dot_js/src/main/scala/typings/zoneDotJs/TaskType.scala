package typings.zoneDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `microTask`, `macroTask`, `eventTask`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.zoneDotJs.zoneDotJsStrings.microTask
  - typings.zoneDotJs.zoneDotJsStrings.macroTask
  - typings.zoneDotJs.zoneDotJsStrings.eventTask
*/
trait TaskType extends js.Object

object TaskType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventTask: typings.zoneDotJs.zoneDotJsStrings.eventTask = this.cast("eventTask")
  @scala.inline
  def macroTask: typings.zoneDotJs.zoneDotJsStrings.macroTask = this.cast("macroTask")
  @scala.inline
  def microTask: typings.zoneDotJs.zoneDotJsStrings.microTask = this.cast("microTask")
}

