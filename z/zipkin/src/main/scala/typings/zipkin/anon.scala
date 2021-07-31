package typings.zipkin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Console
import typings.zipkin.mod.Context
import typings.zipkin.mod.InetAddress
import typings.zipkin.mod.Recorder
import typings.zipkin.mod.TraceId
import typings.zipkin.mod.Tracer
import typings.zipkin.mod.model.Endpoint
import typings.zipkin.mod.option.IOption
import typings.zipkin.mod.sampler.Sampler
import typings.zipkin.zipkinStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var headers: js.UndefOr[js.Any] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  trait CtxImpl extends StObject {
    
    var ctxImpl: Context[TraceId]
    
    var defaultTags: js.UndefOr[js.Object] = js.undefined
    
    var localEndpoint: js.UndefOr[Endpoint] = js.undefined
    
    var localServiceName: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[Console] = js.undefined
    
    var recorder: Recorder
    
    var sampler: js.UndefOr[Sampler] = js.undefined
    
    var supportsJoin: js.UndefOr[Boolean] = js.undefined
    
    var traceId128Bit: js.UndefOr[Boolean] = js.undefined
  }
  object CtxImpl {
    
    @scala.inline
    def apply(ctxImpl: Context[TraceId], recorder: Recorder): CtxImpl = {
      val __obj = js.Dynamic.literal(ctxImpl = ctxImpl.asInstanceOf[js.Any], recorder = recorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[CtxImpl]
    }
    
    @scala.inline
    implicit class CtxImplMutableBuilder[Self <: CtxImpl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtxImpl(value: Context[TraceId]): Self = StObject.set(x, "ctxImpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTags(value: js.Object): Self = StObject.set(x, "defaultTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTagsUndefined: Self = StObject.set(x, "defaultTags", js.undefined)
      
      @scala.inline
      def setLocalEndpoint(value: Endpoint): Self = StObject.set(x, "localEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalEndpointUndefined: Self = StObject.set(x, "localEndpoint", js.undefined)
      
      @scala.inline
      def setLocalServiceName(value: String): Self = StObject.set(x, "localServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalServiceNameUndefined: Self = StObject.set(x, "localServiceName", js.undefined)
      
      @scala.inline
      def setLog(value: Console): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setRecorder(value: Recorder): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampler(value: Sampler): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
      
      @scala.inline
      def setSupportsJoin(value: Boolean): Self = StObject.set(x, "supportsJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsJoinUndefined: Self = StObject.set(x, "supportsJoin", js.undefined)
      
      @scala.inline
      def setTraceId128Bit(value: Boolean): Self = StObject.set(x, "traceId128Bit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceId128BitUndefined: Self = StObject.set(x, "traceId128Bit", js.undefined)
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var parentId: js.UndefOr[IOption[String]] = js.undefined
    
    var sampled: js.UndefOr[IOption[Boolean]] = js.undefined
    
    var shared: js.UndefOr[Boolean] = js.undefined
    
    var spanId: js.UndefOr[String] = js.undefined
    
    var traceId: js.UndefOr[String] = js.undefined
  }
  object Debug {
    
    @scala.inline
    def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setParentId(value: IOption[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setSampled(value: IOption[Boolean]): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
      
      @scala.inline
      def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      @scala.inline
      def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
  
  trait Headers[H] extends StObject {
    
    var headers: H & XB3Flags
  }
  object Headers {
    
    @scala.inline
    def apply[H](headers: H & XB3Flags): Headers[H] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers[H]]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers[?], H] (val x: Self & Headers[H]) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: H & XB3Flags): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[InetAddress] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var serviceName: String
  }
  object Host {
    
    @scala.inline
    def apply(serviceName: String): Host = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: InetAddress): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostPort extends StObject {
    
    var host: js.UndefOr[InetAddress] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object HostPort {
    
    @scala.inline
    def apply(): HostPort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostPort]
    }
    
    @scala.inline
    implicit class HostPortMutableBuilder[Self <: HostPort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: InetAddress): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait Ipv4 extends StObject {
    
    var ipv4: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
  }
  object Ipv4 {
    
    @scala.inline
    def apply(): Ipv4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ipv4]
    }
    
    @scala.inline
    implicit class Ipv4MutableBuilder[Self <: Ipv4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    }
  }
  
  trait Logger extends StObject {
    
    var logger: typings.zipkin.mod.Logger
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Logger {
    
    @scala.inline
    def apply(logger: typings.zipkin.mod.Logger): Logger = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: typings.zipkin.mod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Port extends StObject {
    
    var host: InetAddress
    
    var port: Double
  }
  object Port {
    
    @scala.inline
    def apply(host: InetAddress, port: Double): Port = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: InetAddress): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteServiceName extends StObject {
    
    var remoteServiceName: js.UndefOr[String] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var tracer: Tracer
  }
  object RemoteServiceName {
    
    @scala.inline
    def apply(tracer: Tracer): RemoteServiceName = {
      val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteServiceName]
    }
    
    @scala.inline
    implicit class RemoteServiceNameMutableBuilder[Self <: RemoteServiceName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteServiceNameUndefined: Self = StObject.set(x, "remoteServiceName", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerTags extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var serverTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var tracer: Tracer
  }
  object ServerTags {
    
    @scala.inline
    def apply(port: Double, tracer: Tracer): ServerTags = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTags]
    }
    
    @scala.inline
    implicit class ServerTagsMutableBuilder[Self <: ServerTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerTags(value: StringDictionary[String]): Self = StObject.set(x, "serverTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerTagsUndefined: Self = StObject.set(x, "serverTags", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
  
  trait XB3Flags extends StObject {
    
    var `X-B3-Flags`: js.UndefOr[`1` | typings.zipkin.zipkinStrings.`0`] = js.undefined
    
    var `X-B3-ParentSpanId`: js.UndefOr[String] = js.undefined
    
    var `X-B3-Sampled`: js.UndefOr[`1` | typings.zipkin.zipkinStrings.`0`] = js.undefined
    
    var `X-B3-SpanId`: String
    
    var `X-B3-TraceId`: String
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
    implicit class XB3FlagsMutableBuilder[Self <: XB3Flags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setX-B3-Flags`(value: `1` | typings.zipkin.zipkinStrings.`0`): Self = StObject.set(x, "X-B3-Flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-B3-FlagsUndefined`: Self = StObject.set(x, "X-B3-Flags", js.undefined)
      
      @scala.inline
      def `setX-B3-ParentSpanId`(value: String): Self = StObject.set(x, "X-B3-ParentSpanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-B3-ParentSpanIdUndefined`: Self = StObject.set(x, "X-B3-ParentSpanId", js.undefined)
      
      @scala.inline
      def `setX-B3-Sampled`(value: `1` | typings.zipkin.zipkinStrings.`0`): Self = StObject.set(x, "X-B3-Sampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-B3-SampledUndefined`: Self = StObject.set(x, "X-B3-Sampled", js.undefined)
      
      @scala.inline
      def `setX-B3-SpanId`(value: String): Self = StObject.set(x, "X-B3-SpanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-B3-TraceId`(value: String): Self = StObject.set(x, "X-B3-TraceId", value.asInstanceOf[js.Any])
    }
  }
}
