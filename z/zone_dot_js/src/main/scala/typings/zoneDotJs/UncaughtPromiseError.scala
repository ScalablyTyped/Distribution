package typings.zoneDotJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncaughtPromiseError extends Error {
  var promise: js.Promise[_]
  var rejection: js.Any
  var task: Task
  var zone: Zone
}

object UncaughtPromiseError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    promise: js.Promise[_],
    rejection: js.Any,
    task: Task,
    zone: Zone,
    stack: String = null
  ): UncaughtPromiseError = {
    val __obj = js.Dynamic.literal(message = message, name = name, promise = promise, rejection = rejection, task = task, zone = zone)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UncaughtPromiseError]
  }
}

