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
    val __obj = js.Dynamic.literal(message = message, name = name, promise = promise, rejection = rejection, task = task, zone = zone)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UncaughtPromiseError]
  }
}

