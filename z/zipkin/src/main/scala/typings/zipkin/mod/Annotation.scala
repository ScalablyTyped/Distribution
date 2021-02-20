package typings.zipkin.mod

import typings.zipkin.anon.Host
import typings.zipkin.anon.HostPort
import typings.zipkin.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Annotation {
  
  @JSImport("zipkin", "Annotation.BinaryAnnotation")
  @js.native
  class BinaryAnnotation protected () extends IAnnotation {
    def this(key: String, value: String) = this()
    
    var key: String = js.native
    
    var value: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientAddr")
  @js.native
  class ClientAddr protected () extends IAnnotation {
    def this(args: Port) = this()
  }
  
  @JSImport("zipkin", "Annotation.ClientRecv")
  @js.native
  class ClientRecv () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ClientSend")
  @js.native
  class ClientSend () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ConsumerStart")
  @js.native
  class ConsumerStart () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ConsumerStop")
  @js.native
  class ConsumerStop () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.LocalAddr")
  @js.native
  class LocalAddr () extends IAnnotation {
    def this(args: HostPort) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalOperationStart")
  @js.native
  class LocalOperationStart protected () extends IAnnotation {
    def this(name: String) = this()
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalOperationStop")
  @js.native
  class LocalOperationStop () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.Message")
  @js.native
  class Message protected () extends IAnnotation {
    def this(message: String) = this()
    
    var message: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.MessageAddr")
  @js.native
  class MessageAddr protected () extends IAnnotation {
    def this(args: Host) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ProducerStart")
  @js.native
  class ProducerStart () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ProducerStop")
  @js.native
  class ProducerStop () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.Rpc")
  @js.native
  class Rpc protected () extends IAnnotation {
    def this(name: String) = this()
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerAddr")
  @js.native
  class ServerAddr protected () extends IAnnotation {
    def this(args: Host) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerRecv")
  @js.native
  class ServerRecv () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ServerSend")
  @js.native
  class ServerSend () extends IAnnotation
  
  @JSImport("zipkin", "Annotation.ServiceName")
  @js.native
  class ServiceName protected () extends IAnnotation {
    def this(serviceName: String) = this()
    
    var serviceName: String = js.native
  }
}
