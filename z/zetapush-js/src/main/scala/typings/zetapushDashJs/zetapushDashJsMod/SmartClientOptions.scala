package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartClientOptions extends Options {
  var deployment: js.UndefOr[SmartClientDeployment] = js.undefined
}

object SmartClientOptions {
  @scala.inline
  def apply(
    sandboxId: String,
    apiUrl: String = null,
    deployment: SmartClientDeployment = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    transports: js.Array[_] = null
  ): SmartClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartClientOptions]
  }
}

