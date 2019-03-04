package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDeclaration extends js.Object {
  var Type: Service
  var deploymentId: js.UndefOr[java.lang.String] = js.undefined
  var listener: js.UndefOr[js.Any] = js.undefined
}

object ServiceDeclaration {
  @scala.inline
  def apply(Type: Service, deploymentId: java.lang.String = null, listener: js.Any = null): ServiceDeclaration = {
    val __obj = js.Dynamic.literal(Type = Type)
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (listener != null) __obj.updateDynamic("listener")(listener)
    __obj.asInstanceOf[ServiceDeclaration]
  }
}

