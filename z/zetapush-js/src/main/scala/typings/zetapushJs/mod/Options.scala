package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var apiUrl: js.UndefOr[String] = js.native
  var forceHttps: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var sandboxId: String = js.native
  var transports: js.UndefOr[js.Array[_]] = js.native
}

object Options {
  @scala.inline
  def apply(sandboxId: String): Options = {
    val __obj = js.Dynamic.literal(sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setSandboxId(value: String): Self = this.set("sandboxId", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiUrl(value: String): Self = this.set("apiUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiUrl: Self = this.set("apiUrl", js.undefined)
    @scala.inline
    def setForceHttps(value: Boolean): Self = this.set("forceHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHttps: Self = this.set("forceHttps", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: js.Any*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[_]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
  }
  
}

