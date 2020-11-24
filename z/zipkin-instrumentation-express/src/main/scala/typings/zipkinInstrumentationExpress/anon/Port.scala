package typings.zipkinInstrumentationExpress.anon

import typings.zipkin.mod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Port extends js.Object {
  
  var port: js.UndefOr[Double] = js.native
  
  var tracer: Tracer = js.native
}
object Port {
  
  @scala.inline
  def apply(tracer: Tracer): Port = {
    val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
