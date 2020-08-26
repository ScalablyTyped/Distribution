package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakClientOptions extends Options {
  var deploymentId: js.UndefOr[String] = js.native
}

object WeakClientOptions {
  @scala.inline
  def apply(sandboxId: String): WeakClientOptions = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakClientOptions]
  }
  @scala.inline
  implicit class WeakClientOptionsOps[Self <: WeakClientOptions] (val x: Self) extends AnyVal {
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
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
  }
  
}

