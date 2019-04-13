package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logger: zipkinLib.zipkinMod.Logger
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Logger {
  @scala.inline
  def apply(logger: zipkinLib.zipkinMod.Logger, timeout: scala.Int | scala.Double = null): Anon_Logger = {
    val __obj = js.Dynamic.literal(logger = logger)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Logger]
  }
}

