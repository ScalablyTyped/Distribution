package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDeclaration extends js.Object {
  var Type: Service = js.native
  var deploymentId: js.UndefOr[String] = js.native
  var listener: js.UndefOr[js.Any] = js.native
}

object ServiceDeclaration {
  @scala.inline
  def apply(Type: Service): ServiceDeclaration = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDeclaration]
  }
  @scala.inline
  implicit class ServiceDeclarationOps[Self <: ServiceDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: Service): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setListener(value: js.Any): Self = this.set("listener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
  }
  
}

