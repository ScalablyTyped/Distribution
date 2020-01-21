package typings.zipkin.mod

import typings.zipkin.AnonHost
import typings.zipkin.AnonHostPort
import typings.zipkin.AnonHostPortInetAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Annotation")
@js.native
object Annotation extends js.Object {
  @js.native
  class BinaryAnnotation protected () extends IAnnotation {
    def this(key: String, value: String) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var key: String = js.native
    var value: String = js.native
  }
  
  @js.native
  class ClientAddr protected () extends IAnnotation {
    def this(args: AnonHostPort) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ClientRecv () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ClientSend () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ConsumerStart () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ConsumerStop () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class LocalAddr () extends IAnnotation {
    def this(args: AnonHostPortInetAddress) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var host: InetAddress = js.native
    var port: Double = js.native
  }
  
  @js.native
  class LocalOperationStart protected () extends IAnnotation {
    def this(name: String) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var name: String = js.native
  }
  
  @js.native
  class LocalOperationStop () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class Message protected () extends IAnnotation {
    def this(message: String) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var message: String = js.native
  }
  
  @js.native
  class MessageAddr protected () extends IAnnotation {
    def this(args: AnonHost) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var host: InetAddress = js.native
    var port: Double = js.native
    var serviceName: String = js.native
  }
  
  @js.native
  class ProducerStart () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ProducerStop () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class Rpc protected () extends IAnnotation {
    def this(name: String) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var name: String = js.native
  }
  
  @js.native
  class ServerAddr protected () extends IAnnotation {
    def this(args: AnonHost) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var host: InetAddress = js.native
    var port: Double = js.native
    var serviceName: String = js.native
  }
  
  @js.native
  class ServerRecv () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ServerSend () extends IAnnotation {
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @js.native
  class ServiceName protected () extends IAnnotation {
    def this(serviceName: String) = this()
    /* CompleteClass */
    override val annotationType: String = js.native
    var serviceName: String = js.native
  }
  
}

