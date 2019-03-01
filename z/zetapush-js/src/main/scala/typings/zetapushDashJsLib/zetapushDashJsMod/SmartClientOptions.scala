package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartClientOptions extends Options {
  var deployment: js.UndefOr[SmartClientDeployment] = js.undefined
}

object SmartClientOptions {
  @scala.inline
  def apply(
    sandboxId: java.lang.String,
    apiUrl: java.lang.String = null,
    deployment: SmartClientDeployment = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    transports: js.Array[_] = null
  ): SmartClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sandboxId")(sandboxId)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (deployment != null) __obj.updateDynamic("deployment")(deployment)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[SmartClientOptions]
  }
}

