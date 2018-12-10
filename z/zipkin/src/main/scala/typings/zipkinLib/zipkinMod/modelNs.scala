package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "model")
@js.native
object modelNs extends js.Object {
  @js.native
  class Endpoint protected ()
    extends zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint {
    def this(args: zipkinLib.Anon_Ipv4) = this()
    /* CompleteClass */
    override def isEmpty(): scala.Boolean = js.native
    /* CompleteClass */
    override def setIpv4(ipv4: java.lang.String): scala.Unit = js.native
    /* CompleteClass */
    override def setPort(port: scala.Double): scala.Unit = js.native
    /* CompleteClass */
    override def setServiceName(serviceName: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Span protected ()
    extends zipkinLib.zipkinMod.zipkinNs.modelNs.Span {
    def this(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId) = this()
    /* CompleteClass */
    override val annotations: js.Array[zipkinLib.zipkinMod.zipkinNs.modelNs.Annotation] = js.native
    /* CompleteClass */
    override val debug: scala.Boolean = js.native
    /* CompleteClass */
    override val id: java.lang.String = js.native
    /* CompleteClass */
    override val shared: scala.Boolean = js.native
    /* CompleteClass */
    override val tags: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
    /* CompleteClass */
    override val traceId: java.lang.String = js.native
    /* CompleteClass */
    override def addAnnotation(timestamp: scala.Double, value: java.lang.String): scala.Unit = js.native
    /* CompleteClass */
    override def putTag(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
    /* CompleteClass */
    override def setDebug(debug: scala.Boolean): scala.Unit = js.native
    /* CompleteClass */
    override def setDuration(duration: scala.Double): scala.Unit = js.native
    /* CompleteClass */
    override def setKind(kind: java.lang.String): scala.Unit = js.native
    /* CompleteClass */
    override def setLocalEndpoint(endpoint: zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint): scala.Unit = js.native
    /* CompleteClass */
    override def setName(name: java.lang.String): scala.Unit = js.native
    /* CompleteClass */
    override def setRemoteEndpoint(endpoint: zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint): scala.Unit = js.native
    /* CompleteClass */
    override def setShared(shared: scala.Boolean): scala.Unit = js.native
    /* CompleteClass */
    override def setTimestamp(timestamp: scala.Double): scala.Unit = js.native
  }
  
}

