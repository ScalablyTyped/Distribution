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
  class BinaryAnnotation protected ()
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
  class ClientAddr protected ()
    extends StObject
       with IAnnotation {
    def this(args: Port) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientRecv")
  @js.native
  class ClientRecv ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ClientSend")
  @js.native
  class ClientSend ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ConsumerStart")
  @js.native
  class ConsumerStart ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ConsumerStop")
  @js.native
  class ConsumerStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalAddr")
  @js.native
  class LocalAddr ()
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
  class LocalOperationStart protected ()
    extends StObject
       with IAnnotation {
    def this(name: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.LocalOperationStop")
  @js.native
  class LocalOperationStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.Message")
  @js.native
  class Message protected ()
    extends StObject
       with IAnnotation {
    def this(message: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var message: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.MessageAddr")
  @js.native
  class MessageAddr protected ()
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
  class ProducerStart ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ProducerStop")
  @js.native
  class ProducerStop ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.Rpc")
  @js.native
  class Rpc protected ()
    extends StObject
       with IAnnotation {
    def this(name: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerAddr")
  @js.native
  class ServerAddr protected ()
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
  class ServerRecv ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServerSend")
  @js.native
  class ServerSend ()
    extends StObject
       with IAnnotation {
    
    /* CompleteClass */
    override val annotationType: String = js.native
  }
  
  @JSImport("zipkin", "Annotation.ServiceName")
  @js.native
  class ServiceName protected ()
    extends StObject
       with IAnnotation {
    def this(serviceName: String) = this()
    
    /* CompleteClass */
    override val annotationType: String = js.native
    
    var serviceName: String = js.native
  }
}
