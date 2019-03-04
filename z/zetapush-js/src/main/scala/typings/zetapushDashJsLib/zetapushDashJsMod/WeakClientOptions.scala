package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakClientOptions extends Options {
  var deploymentId: js.UndefOr[java.lang.String] = js.undefined
}

object WeakClientOptions {
  @scala.inline
  def apply(
    sandboxId: java.lang.String,
    apiUrl: java.lang.String = null,
    deploymentId: java.lang.String = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    transports: js.Array[_] = null
  ): WeakClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[WeakClientOptions]
  }
}

