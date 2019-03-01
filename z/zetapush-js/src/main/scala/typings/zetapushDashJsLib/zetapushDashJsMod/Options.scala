package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiUrl: js.UndefOr[java.lang.String] = js.undefined
  var forceHttps: js.UndefOr[scala.Boolean] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var sandboxId: java.lang.String
  var transports: js.UndefOr[js.Array[_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    sandboxId: java.lang.String,
    apiUrl: java.lang.String = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    transports: js.Array[_] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sandboxId")(sandboxId)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[Options]
  }
}

