package typings.zipkin

import typings.zipkin.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogger extends js.Object {
  var logger: Logger
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonLogger {
  @scala.inline
  def apply(logger: Logger, timeout: Int | Double = null): AnonLogger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogger]
  }
}

