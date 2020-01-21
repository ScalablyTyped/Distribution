package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[Boolean] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(body: js.UndefOr[Boolean] = js.undefined, params: js.UndefOr[Boolean] = js.undefined): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

