package typings.zipkin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerTags extends js.Object {
  var host: js.UndefOr[String] = js.native
  var port: Double = js.native
  var serverTags: js.UndefOr[StringDictionary[String]] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var tracer: Tracer = js.native
}

object ServerTags {
  @scala.inline
  def apply(port: Double, tracer: Tracer): ServerTags = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTags]
  }
  @scala.inline
  implicit class ServerTagsOps[Self <: ServerTags] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracer(value: Tracer): Self = this.set("tracer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setServerTags(value: StringDictionary[String]): Self = this.set("serverTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerTags: Self = this.set("serverTags", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

