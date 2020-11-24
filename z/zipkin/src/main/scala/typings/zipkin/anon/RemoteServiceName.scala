package typings.zipkin.anon

import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteServiceName extends js.Object {
  
  var remoteServiceName: js.UndefOr[String] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var tracer: Tracer = js.native
}
object RemoteServiceName {
  
  @scala.inline
  def apply(tracer: Tracer): RemoteServiceName = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteServiceName]
  }
  
  @scala.inline
  implicit class RemoteServiceNameOps[Self <: RemoteServiceName] (val x: Self) extends AnyVal {
    
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
    def setTracer(value: Tracer): Self = this.set("tracer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteServiceName(value: String): Self = this.set("remoteServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteServiceName: Self = this.set("remoteServiceName", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
