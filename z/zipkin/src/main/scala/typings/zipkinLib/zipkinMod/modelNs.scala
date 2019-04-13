package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "model")
@js.native
object modelNs extends js.Object {
  trait Annotation extends js.Object {
    var timestamp: scala.Double
    var value: java.lang.String
  }
  
  @js.native
  class Endpoint protected () extends js.Object {
    def this(args: zipkinLib.Anon_Ipv4) = this()
    def isEmpty(): scala.Boolean = js.native
    def setIpv4(ipv4: java.lang.String): scala.Unit = js.native
    def setPort(port: scala.Double): scala.Unit = js.native
    def setServiceName(serviceName: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Span protected () extends js.Object {
    def this(traceId: zipkinLib.zipkinMod.TraceId) = this()
    val annotations: js.Array[Annotation] = js.native
    val debug: scala.Boolean = js.native
    val duration: js.UndefOr[scala.Double] = js.native
    val id: java.lang.String = js.native
    val kind: js.UndefOr[java.lang.String] = js.native
    val localEndpoint: js.UndefOr[Endpoint] = js.native
    val name: js.UndefOr[java.lang.String] = js.native
    val parentId: js.UndefOr[java.lang.String] = js.native
    val remoteEndpoint: js.UndefOr[Endpoint] = js.native
    val shared: scala.Boolean = js.native
    val tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    val timestamp: js.UndefOr[scala.Double] = js.native
    val traceId: java.lang.String = js.native
    def addAnnotation(timestamp: scala.Double, value: java.lang.String): scala.Unit = js.native
    def putTag(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def setDebug(debug: scala.Boolean): scala.Unit = js.native
    def setDuration(duration: scala.Double): scala.Unit = js.native
    def setKind(kind: java.lang.String): scala.Unit = js.native
    def setLocalEndpoint(endpoint: Endpoint): scala.Unit = js.native
    def setName(name: java.lang.String): scala.Unit = js.native
    def setRemoteEndpoint(endpoint: Endpoint): scala.Unit = js.native
    def setShared(shared: scala.Boolean): scala.Unit = js.native
    def setTimestamp(timestamp: scala.Double): scala.Unit = js.native
  }
  
}

