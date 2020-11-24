package typings.zipkin.anon

import typings.zipkin.zipkinStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XB3Flags extends js.Object {
  
  var `X-B3-Flags`: js.UndefOr[`1` | typings.zipkin.zipkinStrings.`0`] = js.native
  
  var `X-B3-ParentSpanId`: js.UndefOr[String] = js.native
  
  var `X-B3-Sampled`: js.UndefOr[`1` | typings.zipkin.zipkinStrings.`0`] = js.native
  
  var `X-B3-SpanId`: String = js.native
  
  var `X-B3-TraceId`: String = js.native
}
object XB3Flags {
  
  @scala.inline
  def apply(`X-B3-SpanId`: String, `X-B3-TraceId`: String): XB3Flags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-B3-SpanId")(`X-B3-SpanId`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-B3-TraceId")(`X-B3-TraceId`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XB3Flags]
  }
  
  @scala.inline
  implicit class XB3FlagsOps[Self <: XB3Flags] (val x: Self) extends AnyVal {
    
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
    def `setX-B3-SpanId`(value: String): Self = this.set("X-B3-SpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-B3-TraceId`(value: String): Self = this.set("X-B3-TraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-B3-Flags`(value: `1` | typings.zipkin.zipkinStrings.`0`): Self = this.set("X-B3-Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-B3-Flags`: Self = this.set("X-B3-Flags", js.undefined)
    
    @scala.inline
    def `setX-B3-ParentSpanId`(value: String): Self = this.set("X-B3-ParentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-B3-ParentSpanId`: Self = this.set("X-B3-ParentSpanId", js.undefined)
    
    @scala.inline
    def `setX-B3-Sampled`(value: `1` | typings.zipkin.zipkinStrings.`0`): Self = this.set("X-B3-Sampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-B3-Sampled`: Self = this.set("X-B3-Sampled", js.undefined)
  }
}
