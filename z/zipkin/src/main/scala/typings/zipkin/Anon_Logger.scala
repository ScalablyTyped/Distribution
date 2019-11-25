package typings.zipkin

import typings.zipkin.zipkinMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logger: Logger
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Logger {
  @scala.inline
  def apply(logger: Logger, timeout: Int | Double = null): Anon_Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Logger]
  }
}

