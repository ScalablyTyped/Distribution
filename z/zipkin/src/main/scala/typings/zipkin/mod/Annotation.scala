package typings.zipkin.mod

import typings.zipkin.anon.Host
import typings.zipkin.anon.HostPort
import typings.zipkin.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "Annotation")
@js.native
object Annotation extends js.Object {
  
  @js.native
  class BinaryAnnotation protected () extends IAnnotation {
    def this(key: String, value: String) = this()
    
    var key: String = js.native
    
    var value: String = js.native
  }
  
  @js.native
  class ClientAddr protected () extends IAnnotation {
    def this(args: Port) = this()
  }
  
  @js.native
  class ClientRecv () extends IAnnotation
  
  @js.native
  class ClientSend () extends IAnnotation
  
  @js.native
  class ConsumerStart () extends IAnnotation
  
  @js.native
  class ConsumerStop () extends IAnnotation
  
  @js.native
  class LocalAddr () extends IAnnotation {
    def this(args: HostPort) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
  }
  
  @js.native
  class LocalOperationStart protected () extends IAnnotation {
    def this(name: String) = this()
    
    var name: String = js.native
  }
  
  @js.native
  class LocalOperationStop () extends IAnnotation
  
  @js.native
  class Message protected () extends IAnnotation {
    def this(message: String) = this()
    
    var message: String = js.native
  }
  
  @js.native
  class MessageAddr protected () extends IAnnotation {
    def this(args: Host) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @js.native
  class ProducerStart () extends IAnnotation
  
  @js.native
  class ProducerStop () extends IAnnotation
  
  @js.native
  class Rpc protected () extends IAnnotation {
    def this(name: String) = this()
    
    var name: String = js.native
  }
  
  @js.native
  class ServerAddr protected () extends IAnnotation {
    def this(args: Host) = this()
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @js.native
  class ServerRecv () extends IAnnotation
  
  @js.native
  class ServerSend () extends IAnnotation
  
  @js.native
  class ServiceName protected () extends IAnnotation {
    def this(serviceName: String) = this()
    
    var serviceName: String = js.native
  }
}
