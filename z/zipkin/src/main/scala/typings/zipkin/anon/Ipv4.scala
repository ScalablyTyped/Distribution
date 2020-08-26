package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv4 extends js.Object {
  var ipv4: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object Ipv4 {
  @scala.inline
  def apply(): Ipv4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv4]
  }
  @scala.inline
  implicit class Ipv4Ops[Self <: Ipv4] (val x: Self) extends AnyVal {
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
    def setIpv4(value: String): Self = this.set("ipv4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv4: Self = this.set("ipv4", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

