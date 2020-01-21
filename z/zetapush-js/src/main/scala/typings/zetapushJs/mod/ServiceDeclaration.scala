package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDeclaration extends js.Object {
  var Type: Service
  var deploymentId: js.UndefOr[String] = js.undefined
  var listener: js.UndefOr[js.Any] = js.undefined
}

object ServiceDeclaration {
  @scala.inline
  def apply(Type: Service, deploymentId: String = null, listener: js.Any = null): ServiceDeclaration = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeclaration]
  }
}

