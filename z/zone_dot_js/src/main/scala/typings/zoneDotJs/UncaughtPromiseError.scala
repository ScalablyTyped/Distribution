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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncaughtPromiseError]
  }
}

