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
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(key: java.lang.String, value: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var key: java.lang.String = js.native
    var value: java.lang.String = js.native
  }
  
  @js.native
  class ClientAddr protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(args: zipkinLib.Anon_Host) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ClientRecv ()
    extends zipkinLib.zipkinMod.IAnnotation {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ClientSend ()
    extends zipkinLib.zipkinMod.IAnnotation {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class LocalAddr ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(args: zipkinLib.Anon_HostPortInetAddress) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var host: zipkinLib.zipkinMod.InetAddress = js.native
    var port: scala.Double = js.native
  }
  
  @js.native
  class LocalOperationStart protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(name: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var name: java.lang.String = js.native
  }
  
  @js.native
  class LocalOperationStop ()
    extends zipkinLib.zipkinMod.IAnnotation {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class Message protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(message: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var message: java.lang.String = js.native
  }
  
  @js.native
  class Rpc protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(name: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var name: java.lang.String = js.native
  }
  
  @js.native
  class ServerAddr protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(args: zipkinLib.Anon_HostPort) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var host: zipkinLib.zipkinMod.InetAddress = js.native
    var port: scala.Double = js.native
    var serviceName: java.lang.String = js.native
  }
  
  @js.native
  class ServerRecv ()
    extends zipkinLib.zipkinMod.IAnnotation {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ServerSend ()
    extends zipkinLib.zipkinMod.IAnnotation {
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
  }
  
  @js.native
  class ServiceName protected ()
    extends zipkinLib.zipkinMod.IAnnotation {
    def this(serviceName: java.lang.String) = this()
    /* CompleteClass */
    override val annotationType: java.lang.String = js.native
    var serviceName: java.lang.String = js.native
  }
  
}

