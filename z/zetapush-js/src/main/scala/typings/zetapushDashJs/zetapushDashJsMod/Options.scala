package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiUrl: js.UndefOr[String] = js.undefined
  var forceHttps: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var sandboxId: String
  var transports: js.UndefOr[js.Array[_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    sandboxId: String,
    apiUrl: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    transports: js.Array[_] = null
  ): Options = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[Options]
  }
}

