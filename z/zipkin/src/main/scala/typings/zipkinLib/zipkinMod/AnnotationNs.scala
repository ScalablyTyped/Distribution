package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Annotation")
@js.native
object AnnotationNs extends js.Object {
  @js.native
  class BinaryAnnotation protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.BinaryAnnotation {
    def this(key: java.lang.String, value: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var key: java.lang.String = js.native
    /* CompleteClass */
    override var value: java.lang.String = js.native
  }
  
  @js.native
  class ClientAddr protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ClientAddr {
    def this(args: zipkinLib.Anon_Host) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ClientRecv ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ClientRecv {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ClientSend ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ClientSend {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class LocalAddr ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.LocalAddr {
    def this(args: zipkinLib.Anon_HostPort) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var host: zipkinLib.zipkinMod.zipkinNs.InetAddress = js.native
    /* CompleteClass */
    override var port: scala.Double = js.native
  }
  
  @js.native
  class LocalOperationStart protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.LocalOperationStart {
    def this(name: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  class LocalOperationStop ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.LocalOperationStop {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class Message protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.Message {
    def this(message: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
  }
  
  @js.native
  class Rpc protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.Rpc {
    def this(name: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  class ServerAddr protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ServerAddr {
    def this(args: zipkinLib.Anon_ServiceName) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var host: zipkinLib.zipkinMod.zipkinNs.InetAddress = js.native
    /* CompleteClass */
    override var port: scala.Double = js.native
    /* CompleteClass */
    override var serviceName: java.lang.String = js.native
  }
  
  @js.native
  class ServerRecv ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ServerRecv {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ServerSend ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ServerSend {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ServiceName protected ()
    extends zipkinLib.zipkinMod.zipkinNs.AnnotationNs.ServiceName {
    def this(serviceName: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    /* CompleteClass */
    override var serviceName: java.lang.String = js.native
  }
  
}

