package typings.zipkin.mod.model

import org.scalablytyped.runtime.StringDictionary
import typings.zipkin.mod.TraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "model.Span")
@js.native
class Span protected () extends js.Object {
  def this(traceId: TraceId) = this()
  
  def addAnnotation(timestamp: Double, value: String): Unit = js.native
  
  val annotations: js.Array[Annotation] = js.native
  
  val debug: Boolean = js.native
  
  val duration: js.UndefOr[Double] = js.native
  
  val id: String = js.native
  
  val kind: js.UndefOr[String] = js.native
  
  val localEndpoint: js.UndefOr[Endpoint] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val parentId: js.UndefOr[String] = js.native
  
  def putTag(key: String, value: String): Unit = js.native
  
  val remoteEndpoint: js.UndefOr[Endpoint] = js.native
  
  def setDebug(debug: Boolean): Unit = js.native
  
  def setDuration(duration: Double): Unit = js.native
  
  def setKind(kind: String): Unit = js.native
  
  def setLocalEndpoint(endpoint: Endpoint): Unit = js.native
  
  def setName(name: String): Unit = js.native
  
  def setRemoteEndpoint(endpoint: Endpoint): Unit = js.native
  
  def setShared(shared: Boolean): Unit = js.native
  
  def setTimestamp(timestamp: Double): Unit = js.native
  
  val shared: Boolean = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val timestamp: js.UndefOr[Double] = js.native
  
  val traceId: String = js.native
}
