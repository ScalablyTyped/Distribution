package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: js.UndefOr[scala.Boolean] = js.undefined, params: js.UndefOr[scala.Boolean] = js.undefined): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Body]
  }
}

