package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncaughtPromiseError
  extends stdLib.Error {
  var promise: js.Promise[_]
  var rejection: js.Any
  var task: Task
  var zone: Zone
}

object UncaughtPromiseError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    promise: js.Promise[_],
    rejection: js.Any,
    task: Task,
    zone: Zone,
    stack: java.lang.String = null
  ): UncaughtPromiseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("promise")(promise)
    __obj.updateDynamic("rejection")(rejection)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("zone")(zone)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UncaughtPromiseError]
  }
}

