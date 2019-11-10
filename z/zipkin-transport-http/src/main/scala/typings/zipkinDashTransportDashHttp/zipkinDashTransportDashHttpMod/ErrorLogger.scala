package typings.zipkinDashTransportDashHttp.zipkinDashTransportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLogger extends js.Object {
  def error(args: js.Any*): Unit
}

object ErrorLogger {
  @scala.inline
  def apply(error: /* repeated */ js.Any => Unit): ErrorLogger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
  
    __obj.asInstanceOf[ErrorLogger]
  }
}

