package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[Boolean] = js.undefined
}

object Body {
  @scala.inline
  def apply(body: js.UndefOr[Boolean] = js.undefined, params: js.UndefOr[Boolean] = js.undefined): Body = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.get.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

