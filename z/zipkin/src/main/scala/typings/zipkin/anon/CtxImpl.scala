package typings.zipkin.anon

import typings.std.Console
import typings.zipkin.mod.Context
import typings.zipkin.mod.Recorder
import typings.zipkin.mod.TraceId
import typings.zipkin.mod.model.Endpoint
import typings.zipkin.mod.sampler.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CtxImpl extends js.Object {
  
  var ctxImpl: Context[TraceId] = js.native
  
  var defaultTags: js.UndefOr[js.Object] = js.native
  
  var localEndpoint: js.UndefOr[Endpoint] = js.native
  
  var localServiceName: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[Console] = js.native
  
  var recorder: Recorder = js.native
  
  var sampler: js.UndefOr[Sampler] = js.native
  
  var supportsJoin: js.UndefOr[Boolean] = js.native
  
  var traceId128Bit: js.UndefOr[Boolean] = js.native
}
object CtxImpl {
  
  @scala.inline
  def apply(ctxImpl: Context[TraceId], recorder: Recorder): CtxImpl = {
    val __obj = js.Dynamic.literal(ctxImpl = ctxImpl.asInstanceOf[js.Any], recorder = recorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxImpl]
  }
  
  @scala.inline
  implicit class CtxImplOps[Self <: CtxImpl] (val x: Self) extends AnyVal {
    
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
    def setCtxImpl(value: Context[TraceId]): Self = this.set("ctxImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecorder(value: Recorder): Self = this.set("recorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTags(value: js.Object): Self = this.set("defaultTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTags: Self = this.set("defaultTags", js.undefined)
    
    @scala.inline
    def setLocalEndpoint(value: Endpoint): Self = this.set("localEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalEndpoint: Self = this.set("localEndpoint", js.undefined)
    
    @scala.inline
    def setLocalServiceName(value: String): Self = this.set("localServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalServiceName: Self = this.set("localServiceName", js.undefined)
    
    @scala.inline
    def setLog(value: Console): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setSampler(value: Sampler): Self = this.set("sampler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampler: Self = this.set("sampler", js.undefined)
    
    @scala.inline
    def setSupportsJoin(value: Boolean): Self = this.set("supportsJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsJoin: Self = this.set("supportsJoin", js.undefined)
    
    @scala.inline
    def setTraceId128Bit(value: Boolean): Self = this.set("traceId128Bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId128Bit: Self = this.set("traceId128Bit", js.undefined)
  }
}
