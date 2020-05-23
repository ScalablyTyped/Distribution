package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var logger: typings.zipkin.mod.Logger
  var timeout: js.UndefOr[Double] = js.undefined
}

object Logger {
  @scala.inline
  def apply(logger: typings.zipkin.mod.Logger, timeout: js.UndefOr[Double] = js.undefined): Logger = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
}

