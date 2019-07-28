package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakClientOptions extends Options {
  var deploymentId: js.UndefOr[String] = js.undefined
}

object WeakClientOptions {
  @scala.inline
  def apply(
    sandboxId: String,
    apiUrl: String = null,
    deploymentId: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
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

