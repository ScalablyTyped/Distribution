package typings.zookeeper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  var connect: js.UndefOr[String] = js.native
  
  var data_as_buffer: js.UndefOr[Boolean] = js.native
  
  var debug_level: js.UndefOr[Double] = js.native
  
  var host_order_deterministic: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: String): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setData_as_buffer(value: Boolean): Self = this.set("data_as_buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_as_buffer: Self = this.set("data_as_buffer", js.undefined)
    
    @scala.inline
    def setDebug_level(value: Double): Self = this.set("debug_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug_level: Self = this.set("debug_level", js.undefined)
    
    @scala.inline
    def setHost_order_deterministic(value: Boolean): Self = this.set("host_order_deterministic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_order_deterministic: Self = this.set("host_order_deterministic", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
