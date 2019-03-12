package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends Options {
  def authentication(): AbstractHandshake
}

object ClientOptions {
  @scala.inline
  def apply(
    authentication: () => AbstractHandshake,
    sandboxId: java.lang.String,
    apiUrl: java.lang.String = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    transports: js.Array[_] = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(authentication = js.Any.fromFunction0(authentication), sandboxId = sandboxId)
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[ClientOptions]
  }
}

