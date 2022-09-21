package typings.zipkin.mod

import typings.zipkin.anon.Host
import typings.zipkin.anon.HostPort
import typings.zipkin.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Annotation {
  
  @JSImport("zipkin", "Annotation.BinaryAnnotation")
  @js.native
  open class BinaryAnnotation protected ()
    extends StObject
       with IAnnotation {
    def this(key: String, value: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var key: String = js.native
    
    var value: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientAddr")
  @js.native
  open class ClientAddr protected ()
    extends StObject
       with IAnnotation {
    def this(args: Port) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientRecv")
  @js.native
  open class ClientRecv ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientSend")
  @js.native
  open class ClientSend ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ConsumerStart")
  @js.native
  open class ConsumerStart ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ConsumerStop")
  @js.native
  open class ConsumerStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalAddr")
  @js.native
  open class LocalAddr ()
    extends StObject
       with IAnnotation {
    def this(args: HostPort) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalOperationStart")
  @js.native
  open class LocalOperationStart protected ()
    extends StObject
       with IAnnotation {
    def this(name: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalOperationStop")
  @js.native
  open class LocalOperationStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.Message")
  @js.native
  open class Message protected ()
    extends StObject
       with IAnnotation {
    def this(message: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var message: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.MessageAddr")
  @js.native
  open class MessageAddr protected ()
    extends StObject
       with IAnnotation {
    def this(args: Host) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ProducerStart")
  @js.native
  open class ProducerStart ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ProducerStop")
  @js.native
  open class ProducerStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.Rpc")
  @js.native
  open class Rpc protected ()
    extends StObject
       with IAnnotation {
    def this(name: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerAddr")
  @js.native
  open class ServerAddr protected ()
    extends StObject
       with IAnnotation {
    def this(args: Host) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var host: InetAddress = js.native
    
    var port: Double = js.native
    
    var serviceName: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerRecv")
  @js.native
  open class ServerRecv ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerSend")
  @js.native
  open class ServerSend ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServiceName")
  @js.native
  open class ServiceName protected ()
    extends StObject
       with IAnnotation {
    def this(serviceName: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var serviceName: String = js.native
  }
}
